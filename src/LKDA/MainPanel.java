package LKDA;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JPanel;

//============================================================
//============フレーム内のパネル総合監理クラス================
//============================================================
class MainPanel extends JPanel {
  private static final int WIDTH = 400;
  private static final int HEIGHT = 300;
  private static final Color  color = Color.ORANGE;
  static GraphicsPanel gp;
  static MessagePanel mp;

  public MainPanel() {
    setPreferredSize(new Dimension(WIDTH, HEIGHT));
    setBackground(color);
    gp = new GraphicsPanel();
    add(gp);
    mp = new MessagePanel();
    add(mp);
    setVisible(true);
    setLayout(null);
  }
}
