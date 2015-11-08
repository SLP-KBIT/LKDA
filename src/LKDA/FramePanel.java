package LKDA;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JPanel;

//============================================================
//============フレーム内のパネル総合監理クラス================
//============================================================
class FramePanel extends JPanel
{
  private static final int WIDTH = 400;
  private static final int HEIGHT = 300;
  private static final Color  color = Color.ORANGE;
  static GraphicsCanvas gc;
  static MessageCanvas mc;

  public FramePanel()
  {
    setPreferredSize(new Dimension(WIDTH, HEIGHT));
    setBackground(color);
    gc = new GraphicsCanvas();
    add(gc);
    mc = new MessageCanvas();
    add(mc);
    setVisible(true);
    setLayout(null);
  }
}
