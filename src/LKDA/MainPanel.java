package LKDA;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JPanel;
//====================================================================
//                  ゲーム画面の構成を定義するクラス
//====================================================================
class MainPanel extends JPanel implements ActionListener {
  private static final int WIDTH = 805;    // パネルの幅
  private static final int HEIGHT = 605;    // パネルの高さ
  private static final Color  color = Color.ORANGE;    // パネルの背景色
  private static JButton attack;    // 攻撃させるボタン(テスト用)
  private static JButton recovery;    // 回復させるボタン(テスト用)
  static GraphicsPanel gp;    // 画像を出力するパネル
  static MessagePanel mp;    // メッセージを出力するパネル
  Random rand = new Random();    // 乱数発生用変数(テスト用)
  public static Character player, enemy;    // キャラクタ(テスト用)
  static HPWindow charaHP, eneHP;    // キャラクタの情報を出力するパネル(テスト用)
  GameThread gt = null;

  public MainPanel() {
    setPreferredSize(new Dimension(WIDTH, HEIGHT));    // パネルの推奨サイズを設定
    setLayout(null);    // コンポーネントを座標で張り付ける
    setBackground(color);

    //-- 画像パネルの追加
    gp = new GraphicsPanel();
    add(gp);

    //-- メッセージパネルの追加
    mp = new MessagePanel();
    add(mp);

    //-- キャラクタ生成
    player = new Character("PLAYER", 100, 10, 5, 0);
    enemy = new Character("ENEMY", 150, 10, 5, 1);

    //-- HPウィンドウの追加
    charaHP = new HPWindow(610,5,player);
    add(charaHP);

    eneHP = new HPWindow(610, 160,enemy);
    add(eneHP);

    //-- テスト用ボタンの追加
    attack = new JButton("攻撃");
    attack.addActionListener(this);
    attack.setBounds(650, 400, 100, 50);
    add(attack);

    recovery = new JButton("回復");
    recovery.addActionListener(this);
    recovery.setBounds(650, 500, 100, 50);
    add(recovery);

    //-- スレッドの作成・開始
    gt = new GameThread(500);
    gt.start();
  }

  public void actionPerformed(ActionEvent e) {
    if ( e.getSource() == attack ) { player.attack(enemy); }
    else if ( e.getSource() == recovery ) { player.recovery(); }
    gt.setStop();
    repaint();
  }
}

//========================テスト用ゲームループスレッド==============================
class GameThread extends Thread {
  boolean end = false;     // 終了確認用フラグ
  boolean stop = false;    // 一時停止確認用フラグ
  int time;

  public GameThread(int time) {
    this.time = time;
  }

  @Override
  public void run() {
    while ( ! end ) {
      MainPanel.mp.setMessage(0,0);
      this.stopRun();
      try {
        Thread.sleep(time);
        synchronized(this) {
          if ( stop ) wait();
        }
      } catch ( InterruptedException e ) {
        e.printStackTrace();
      }
      MainPanel.enemy.attack(MainPanel.player);
    }
  }

  public void stopRun() {
    stop = true;
  }

  public synchronized void setStop() {
    stop = ! stop;
    if ( ! stop ) {
      notify();
    }
  }
}
