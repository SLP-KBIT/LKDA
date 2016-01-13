package LKDA;

public class Character {
  int lv;   // レベル
  int mhp;  // 最大HP
  int nhp;  // 現在HP
  int at;   // 攻撃力
  int df;   // 守備力

  //-- 攻撃
  public void attack(Character chara) {
    int damage = this.at-chara.df;
    if ( damage > 0 ) {chara.nhp -= damage; }
  }
}
