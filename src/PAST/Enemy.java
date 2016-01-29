package PAST;

class Enemy extends Character {
  {
  maxHP = 15;    // 敵の最大体力
  nowHP = maxHP; // 敵の現在体力
  at = 3;        // 敵の攻撃力
  df = 3;        // 敵の守備力
  sp = 3;        // 敵の素早さ
  exp = 5;       // 経験値
  }

  void powerUp(int floor) {
    this.maxHP *= floor;
    nowHP = maxHP;
    this.at *= floor;
  }
}