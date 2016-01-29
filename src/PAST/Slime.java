package PAST;

public class Slime extends Enemy {
  Run floor = new Run();
  {
    maxHP += 4;    // 敵の最大体力
    nowHP = maxHP;    // 敵の現在体力
    at = 3;        // 敵の攻撃力
    df = 3;        // 敵の守備力
    mdf = 2;       // 敵の魔法守備力
    sp = 3;        // 敵の素早さ
    exp *= 100;       // 経験値
    name = "スライム";
    path = "seki.jpg";
  }
}
