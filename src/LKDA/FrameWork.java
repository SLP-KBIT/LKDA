package LKDA;

import java.awt.Dimension;

import javax.swing.JFrame;

//===============================================================
//========フレームと、ゲーム全体に共通のデータを扱うクラス=======
//===============================================================
public class FrameWork extends JFrame
{
  private static final int WIDTH = 800;
  private static final int HEIGHT = 600;
  static FramePanel fp;

  public FrameWork()
  {
    setTitle("LKDA");
    setPreferredSize(new Dimension(WIDTH, HEIGHT));
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    fp = new FramePanel();
    add(fp);
    pack();
    setVisible(true);
    setResizable(false);
  }
}
