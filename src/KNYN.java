public class KNYN extends Character {

  //--- 初期能力
  {
  lv = 1;         // レベル
  maxHP = 20;        // 最大体力
  nowHP = 20;        // 現在体力
  at = 5;            // 攻撃力
  mat = 15;          // 魔法攻撃力
  df = 5;            // 守備力
  mdf = 5;           // 魔法防御力
  sp = 5;            // 素早さ
  maxMP = 10;        // 最大魔法ポイント
  nowMP = 10;        // 現在魔法ポイント
  exp = 0;           // 累計経験値
  name = "KNYN";
  }
  int nextEXP = 10;  // 必要経験値

  //--- スキル
  void skill() {
    if ( this.nowMP > 0 ) {
      System.out.println("knynは幼女の写真を眺めた");
      System.out.println("knynのHPが回復した!");
      this.nowHP = this.maxHP;
      this.nowMP -= 2;
    } else {
      System.out.println("MPが足りない!!");
    }
  }

  //--- レベルアップ
  void levelup() {
    int p;

    this.lv += 1;
    System.out.println("KNYNはレベル"+this.lv+"になった!");

    p =  new java.util.Random().nextInt(5);
    System.out.println("最大HPが"+p+"あがった!");
    this.maxHP += p;
    this.nowHP = this.maxHP;

    p = new java.util.Random().nextInt(3);
    System.out.println("攻撃力が"+p+"あがった!");
    this.at += p;

    p = new java.util.Random().nextInt(3);
    System.out.println("魔法攻撃力が"+p+"あがった!");
    this.mat += p;

    p = new java.util.Random().nextInt(3);
    System.out.println("守備力が"+p+"あがった!");
    this.df += p;

    p = new java.util.Random().nextInt(3);
    System.out.println("魔法守備力が"+p+"あがった!");
    this.mdf += p;

    p = new java.util.Random().nextInt(3);
    System.out.println("素早さが"+p+"あがった!");
    this.sp += p;

    p = new java.util.Random().nextInt(5);
    System.out.println("最大魔法ポイントが"+p+"あがった!");
    this.maxMP += p;
    this.nowMP = this.maxMP;

    this.exp -= this.nextEXP;
    this.nextEXP += 10;
  }

  //---死(ゲームオーバー)
  void die() {
    System.out.println("knynは死んだwww");
  }

//--- MP表示
  void printMP(){
    System.out.println(this.name+" MP "+this.nowMP+"/"+maxMP);
  }
}
