package LKDA;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JPanel;
//====================================================================
//               HPウィンドウの構造を定義するクラス
//====================================================================
public class HPWindow extends JPanel{
  public static final int WIDTH = 200;    // ウィンドウの幅
  public static final int HEIGHT = 150;    // ウィンドウの高さ
  private static final Font font = new Font("MS ゴシック", Font.BOLD, 15);    // 文字のフォント
  public Character chara;    // キャラクタ識別用変数

  public HPWindow(int x, int y, Character chara) {
    this.chara = chara;
    setBounds(x,y,WIDTH, HEIGHT);
    setBackground(Color.BLACK);
  }

  @Override
  public void paintComponent(Graphics g) {
    super.paintComponent(g);
    g.setFont(font);
    g.setColor(Color.WHITE);
    g.drawString("name:  " + chara.name, 30, 30);    // テスト用
    g.drawString("HP  :  " + chara.nhp + " / " + chara.mhp, 30, 60);    // テスト用
  }

}

