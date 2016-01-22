package LKDA;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JPanel;

public class MessagePanel extends JPanel {
  private static final int X = 5;
  private static final int Y = 410;
  private static final int WIDTH = 600;
  private static final int HEIGHT = 200;
  private static final Color color = Color.BLACK;
  private static final Font font = new Font("MS ゴシック", Font.BOLD, 20);
  private static String str;
  private static String str1,str2,str3,str4;
  private static boolean flag1,flag2,flag3,flag4;

  public MessagePanel() {
    setBounds(X, Y, WIDTH, HEIGHT);
    setBackground(color);
    flag1 = flag2 = flag3 = flag4 = false;
  }

  public void setMessage(int cn, int bm) {
    str = Message.chara[cn] + Message.battle[bm];
    if ( ! flag1 ) { str1 = str; flag1 = true; }
    else if ( ! flag2 ) { str2 = str; flag2 = true; }
    else if ( ! flag3 ) { str3 = str; flag3 = true; }
    else if ( ! flag4 ) { str4 = str; flag4 = true; }
    else { str1 = str2; str2 = str3; str3 = str4; str4 = str;  }
  }

  @Override
  public void paintComponent(Graphics g) {
    super.paintComponent(g);
    g.setColor(Color.WHITE);
    g.setFont(font);
    if ( flag1 ) { g.drawString(str1, 10, 40); }
    if ( flag2 ) { g.drawString(str2, 10, 80); }
    if ( flag3 ) { g.drawString(str3, 10, 120); }
    if ( flag4 ) { g.drawString(str4, 10, 160); }
  }
}
