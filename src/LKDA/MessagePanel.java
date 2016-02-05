package LKDA;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JPanel;
//====================================================================
//                   バトルメッセージを表示するクラス
//====================================================================
public class MessagePanel extends JPanel {
  private static final int X = 5;    // パネルの位置
  private static final int Y = 410;    // パネルの位置
  private static final int WIDTH = 600;    // パネルの幅
  private static final int HEIGHT = 200;    // パネルの高さ
  private static final Color color = Color.BLACK;    // パネルの背景色
  private static final Font font = new Font("MS ゴシック", Font.BOLD, 20);    // 文字のフォント
  private static String str;    // 一時格納用文字列
  private static String str1,str2,str3,str4;    // 表示用文字列
  private static boolean flag1,flag2,flag3,flag4;    // 表示確認用フラグ

  public MessagePanel() {
    setBounds(X, Y, WIDTH, HEIGHT);    // パネルの位置・大きさを設定
    setBackground(color);    // パネルの背景色を設定
    flag1 = flag2 = flag3 = flag4 = false;    // 初めは何も表示しない
  }

  //-- 表示用文字列に文字列を格納
  public void setMessage(int cn, int dmg, int bm) {
    if ( dmg == 0 ) {
      str = Message.chara[cn] + Message.battle[bm];
    } else {
      str = Message.chara[cn] + " は " + dmg + Message.battle[bm];
    }
    if ( ! flag1 ) { str1 = str; flag1 = true; }
    else if ( ! flag2 ) { str2 = str; flag2 = true; }
    else if ( ! flag3 ) { str3 = str; flag3 = true; }
    else if ( ! flag4 ) { str4 = str; flag4 = true; }
    else { str1 = str2; str2 = str3; str3 = str4; str4 = str;  }
  }

  @Override
  public void paintComponent(Graphics g) {
    super.paintComponent(g);
    g.setColor(Color.WHITE);    // 文字の色を設定
    g.setFont(font);    // 文字のフォントを設定
    if ( flag1 ) { g.drawString(str1, 10, 40); }
    if ( flag2 ) { g.drawString(str2, 10, 80); }
    if ( flag3 ) { g.drawString(str3, 10, 120); }
    if ( flag4 ) { g.drawString(str4, 10, 160); }
  }
}
