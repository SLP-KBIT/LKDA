package LKDA;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JPanel;

public class HPWindow extends JPanel{
  public static final int WIDTH = 200;
  public static final int HEIGHT = 150;
  private static final Font font = new Font("MS ゴシック", Font.BOLD, 15);
  public int charanum;

  public HPWindow(int x, int y, int charanum) {
    this.charanum = charanum;
    setBounds(x,y,WIDTH, HEIGHT);
    setBackground(Color.BLACK);
  }

  @Override
  public void paintComponent(Graphics g) {
    super.paintComponent(g);
    g.setFont(font);
    g.setColor(Color.WHITE);
    g.drawString("name:  ほげほげ", 30, 30);
    g.drawString("HP  :  100/100", 30, 60);
  }

}

