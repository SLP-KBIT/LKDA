package LKDA;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JPanel;

class MainPanel extends JPanel implements ActionListener {
  private static final int WIDTH = 805;    // パネルの幅
  private static final int HEIGHT = 605;    // パネルの高さ
  private static final Color  color = Color.ORANGE;    // パネルの背景色
  private static JButton image;    // 画像を表示させるボタン(テスト用)
  private static JButton message;    // メッセージを更新するボタン(テスト用)
  static GraphicsPanel gp;    // 画像を出力するパネル
  static MessagePanel mp;    // メッセージを出力するパネル
  Random rand = new Random();    // 乱数発生用変数(テスト用)
  static Character chara;    // キャラクタ(テスト用)
  static HPWindow charaHP, eneHP;    // キャラクタの情報を出力するパネル(テスト用)

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
    chara = new Character();

    //-- HPウィンドウの追加
    charaHP = new HPWindow(610,5,0);
    add(charaHP);

    eneHP = new HPWindow(610, 160,1);
    add(eneHP);

    //-- テスト用ボタンの追加
    image = new JButton("画像");
    image.addActionListener(this);
    image.setBounds(650, 400, 100, 50);
    add(image);

    message = new JButton("メッセージ");
    message.addActionListener(this);
    message.setBounds(650, 500, 100, 50);
    add(message);
  }


  public void actionPerformed(ActionEvent e) {
    if ( e.getSource() == image ) { gp.setImage("image/seki.jpg"); }
    else if ( e.getSource() == message ) { mp.setMessage(rand.nextInt(2), rand.nextInt(5)); }
    repaint();
  }
}
