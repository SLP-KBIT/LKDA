package LKDA;

import java.awt.Color;

import javax.swing.JPanel;

//=============================================================
//=============戦闘のキャラ絵を表示させるクラス================
//=============================================================
public class GraphicsPanel extends JPanel {
  private static final int X = 0;
  private static final int Y = 0;
  private static final int WIDTH = 600;
  private static final int HEIGHT = 400;
  private static final Color color = Color.GRAY;

  public GraphicsPanel() {
    setBounds(X, Y, WIDTH, HEIGHT);
    setBackground(color);
  }
}
