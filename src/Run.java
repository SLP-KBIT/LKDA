import java.util.Scanner;

public class Run {
  static int MAXFloor = 10;
  int floor;
  KNYN knyn = new KNYN();
  Enemy ene;
  GameFrame frame = new GameFrame();
  Scanner stdIn = new Scanner(System.in);

  void runGame() {
    frame.titleScreen();
    try{
      Thread.sleep(300);
    }catch(InterruptedException e){
    }
    frame.changeScreen();
    for ( floor = 1; floor <= MAXFloor; floor++ ) {
      floorActionRoutine();
    }
  }

  //--- フロアでの行動の流れを規定
  private void floorActionRoutine() {
    int killCounter = 0;
    System.out.println("現在"+this.floor+"階層");
    while (true) {

      makeEnemy();                 // 敵の出現
      System.out.println(ene.name+"と遭遇した!");
      battleRoutine();             // 戦闘
      killCounter++;
      if( killCounter >= 3 ) {     // 一定数倒したら次に進むか確認
        System.out.println("次の階層に移動する？");
        System.out.println("1 : 次の階層に   2 : この階層にとどまる");
        //Scanner stdIn = new Scanner(System.in);
        int s = stdIn.nextInt();
        if ( s == 1 ) { break; }
      }
    }
  }

  //--- 戦闘の流れを規定
  private void battleRoutine() {
    while (true) {
      knyn.printHP();
      knyn.printMP();
      ene.printHP();
      System.out.println("KNYNはどうする?");
      System.out.println("1 : 攻撃,   2 : 回復,  3：魔法攻撃");
      int cmd = stdIn.nextInt();           // 行動選択
      if ( battleExec(cmd) ) { break; }    // 行動実行
    }
    getEXP();                              // 経験値入手
  }

  //--- 敵を生成
  private void makeEnemy() {
    if ( this.floor%5 == 0 ) { ene = new Boss(); }    // 5階層ごとにボス
    else {                                            // それ以外はランダム
      int rand = new java.util.Random().nextInt(2);
      switch (rand){
      case 0: ene = new Slime(); break;
      default: ene = new Lolicom();
      }
    }
    ene.powerUp(this.floor);                         // 階層に応じたパワーアップ
  }

  private void getEXP() {
    System.out.println("敵を倒した");
    System.out.println(knyn.name+"は"+ene.exp+"経験値手に入れた");
    knyn.exp += ene.exp;   // 経験値を加算
    //-- レベルアップ
    while (knyn.exp>=knyn.nextEXP) {
      knyn.levelup();
    }
  }

  private boolean battleExec(int cmd) {
    //-- プレイヤが先攻
    if ( knyn.sp >= ene.sp ) {
      switch (cmd) {
      case 1: knyn.attack(ene);  break;
      case 2: knyn.skill();      break;
      case 3: knyn.magicattack(ene);   break;
      default: System.out.println(knyn.name + "は変なことをした!");  knyn.die();
      }
      if ( ! ene.aliveCheck() ) { return true; }
      ene.attack(knyn);
      if ( ! knyn.aliveCheck() ) { knyn.die(); }
    }
    //-- プレイヤが後攻
    else {
      ene.attack(knyn);
      if ( ! knyn.aliveCheck() ) { knyn.die(); }
      switch (cmd) {
      case 1: knyn.attack(ene);  break;
      case 2: knyn.skill();      break;
      case 3: knyn.magicattack(ene);   break;
      default: System.out.println(knyn.name + "は変なことをした!");  knyn.die();
      }
      if ( ! ene.aliveCheck() ) { return true; }
    }
    return false;
  }
}