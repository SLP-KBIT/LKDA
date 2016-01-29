package PAST;

import java.util.Scanner;

public class Run {
<<<<<<< HEAD:src/Run.java
  static int MAXFloor = 1;
  int floor;
  static KNYN knyn = new KNYN();
  static Enemy ene;
=======
  Scanner stdIn = new Scanner(System.in);
  static int Floor = 10;
  int floor = 1;
  KNYN knyn = new KNYN();
>>>>>>> develop:src/PAST/Run.java
  GameFrame frame = new GameFrame();
  Scanner stdIn = new Scanner(System.in);
  static boolean eneflag, iflag;

<<<<<<< HEAD:src/Run.java
  void runGame() {
    frame.titleScreen();
    try{
      Thread.sleep(1000);
    }catch(InterruptedException e){
    }
    frame.changeScreen();
    for ( floor = 1; floor <= MAXFloor; floor++ ) {
      floorActionRoutine();
    }
  }
=======
        Enemy ene;
        int enemy = new java.util.Random().nextInt(2);
        switch (enemy){
        case 0: ene = new Slime(); break;
        default: ene = new Lolicom();
        }
        if(floor%5==0) {
          ene = new Boss();
        }
        frame.changeScreen();
        System.out.println(ene.name+"と遭遇した!");
        ene.powerUp(this.floor);
        while (true){
          if (! knyn.aliveCheck()){knyn.die(); return;}
          else {
            knyn.printHP();
            knyn.printMP();
            ene.printHP();
            System.out.println("KNYNはどうする?");
            System.out.println("1 : 攻撃,   2 : 回復,  3：魔法攻撃");
            int n = stdIn.nextInt();
            if(n == 1) {
              if (knyn.sp >= ene.sp) {
                System.out.println(knyn.name+"の攻撃!");
                knyn.attack(ene);
                if (ene.aliveCheck()) {
                  System.out.println(ene.name+"の攻撃!");
                  ene.attack(knyn);
                } else {break;}
              } else {
                if (ene.aliveCheck()) {
                  System.out.println(ene.name+"の攻撃!");
                  ene.attack(knyn);
                } else {break;}
                System.out.println(knyn.name+"の攻撃!");
                knyn.attack(ene);
              }
            } else if (n==3) {
              if (knyn.sp >= ene.sp) {
                System.out.println(knyn.name+"の攻撃!");
                knyn.magicattack(ene);
                if (ene.aliveCheck()) {
                  System.out.println(ene.name+"の攻撃!");
                  ene.attack(knyn);
                } else {break;}
              } else {
                if (ene.aliveCheck()) {
                  System.out.println(ene.name+"の攻撃!");
                  ene.attack(knyn);
                } else {break;}
                System.out.println(knyn.name+"の攻撃!");
                knyn.magicattack(ene);
              }
            } else {knyn.skill();}
>>>>>>> develop:src/PAST/Run.java

  //--- フロアでの行動の流れを規定
  private void floorActionRoutine() {
    int killCounter = 0;
    System.out.println("現在"+this.floor+"階層");
    while (true) {

      makeEnemy();                 // 敵の出現
      System.out.println(ene.name+"と遭遇した!");
      frame.changeImage(ene.path);
      battleRoutine();             // 戦闘
      killCounter++;
      if( killCounter >= 3 ) {     // 一定数倒したら次に進むか確認
        System.out.println("次の階層に移動する？");
        System.out.println("1 : 次の階層に   2 : この階層にとどまる");
<<<<<<< HEAD:src/Run.java
        //Scanner stdIn = new Scanner(System.in);
=======
>>>>>>> develop:src/PAST/Run.java
        int s = stdIn.nextInt();
        if ( s == 1 ) { break; }
      }
    }
  }

  //--- 戦闘の流れを規定
  private void battleRoutine() {
    eneflag = false;
    while ( ! eneflag ) {
      iflag = false;
      knyn.printHP();
      knyn.printMP();
      ene.printHP();
      System.out.println("KNYNはどうする?");
      while(true) { if(iflag) { break; } }
      System.out.println("入力確認");
      /*
      System.out.println("1 : 攻撃,   2 : 回復,  3：魔法攻撃");
      while (cmd <= 0 ) { }
      if ( battleExec(cmd) ) { break; }    // 行動実行
      */
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

  public static void battleExec(int cmd) {
    //-- プレイヤが先攻
    if ( knyn.sp >= ene.sp ) {
      switch (cmd) {
      case 1: knyn.attack(ene);  break;
      case 2: knyn.skill();      break;
      case 3: knyn.magicattack(ene);   break;
      default: System.out.println(knyn.name + "は変なことをした!");  knyn.die();
      }
      if ( ! ene.aliveCheck() ) { eneflag = true;  return;}
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
      if ( ! ene.aliveCheck() ) { eneflag =  true;  return;}
    }
    iflag = true;
  }
}