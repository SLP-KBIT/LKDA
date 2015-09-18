import java.util.Scanner;

public class Run {
  static int Floor = 10;
  int floor = 1;
  KNYN knyn = new KNYN();
  Frame panel = new Frame();
  void runGame() {

    while(this.floor<=Floor) {
      System.out.println("現在"+this.floor+"階層");
      while (true) {

        Enemy ene;
        int enemy = new java.util.Random().nextInt(2);
        switch (enemy){
        case 0: ene = new Slime(); break;
        default: ene = new Lolicom();
        }
        if(floor%5==0) {
          ene = new Boss();
        }
        panel.createFrame(ene);
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
            Scanner stdIn = new Scanner(System.in);
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

            if (! ene.aliveCheck()) {
              break;
            }
          }

        }
        System.out.println("敵を倒した");
        System.out.println(knyn.name+"は"+ene.exp+"経験値手に入れた");
        knyn.exp += ene.exp;
        while (knyn.exp>=knyn.nextEXP) {
          knyn.levelup();
        }
        System.out.println("次の階層に移動する？");
        System.out.println("1 : 次の階層に   2 : この階層にとどまる");
        Scanner stdIn = new Scanner(System.in);
        int s = stdIn.nextInt();
        if (s==1) {break;}
      }
      this.floor++;
    }
  }
}
