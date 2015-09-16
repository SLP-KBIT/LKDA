class Character {

    //--- パラメータ
    int lv;       // レベル
    int maxHP;    // 最大HP
    int nowHP;    // 現在HP
    int at;       // 攻撃力
    int mat;      // 魔法攻撃力
    int df;       // 防御力
    int mdf;      // 魔法防御力
    int sp;       // 速さ
    int maxMP;    // 最大MP
    int nowMP;    // 現在MP
    int exp;
    String name;

    //--- 攻撃
    void attack(Character chara) {
      int damage = this.at/2 - chara.df/4;
      if (damage <= 0){
        System.out.println("No Damage");
      }
      else {
        chara.nowHP -= damage;
        System.out.println(damage + "ダメージを与えた");
      }
    }

  //-- 魔法攻撃
    void magicattack(Character chara) {
      int damage = this.mat/2 - chara.mdf/4;
      if (damage <= 0){
        System.out.println("No Damage");
      }
      else {
        chara.nowHP -= damage;
        this.nowMP -= 3;
        System.out.println(damage + "ダメージを与えた");
      }
    }

    //--- 生存確認
    Boolean aliveCheck() {
      if (this.nowHP > 0) {return true;}
      return false;
    }

  //--- HP表示
    void printHP(){
      System.out.println(this.name+" HP "+this.nowHP+"/"+maxHP);
    }

}
