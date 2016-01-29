package LKDA;
//====================================================================
//                全キャラクタに共通の構造を定義するクラス
//====================================================================
public class Character {
  int num;  // 識別番号
  String name;    // 名前
  int lv;   // レベル
  int mhp;  // 最大HP
  int nhp;  // 現在HP
  int at;   // 攻撃力
  int df;   // 守備力
  public Character(String name, int hp, int at, int df, int num) {
    this.name = name;
    this.mhp = hp;
    this.nhp = hp;
    this.at = at;
    this.df = df;
    this.num = num;
  }

  //-- 攻撃
  public void attack(Character chara) {
    int damage = this.at-chara.df;
    if ( damage > 0 ) {chara.nhp -= damage; }
    MainPanel.mp.setMessage(num, 2);
  }

  //-- 回復
  public void recovery() {
    this.nhp += 30;
    if ( nhp > mhp ) { nhp = mhp; }
    MainPanel.mp.setMessage(num, 4);
  }
}
