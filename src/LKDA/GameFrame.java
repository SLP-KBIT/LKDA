package LKDA;

import java.awt.Dimension;

import javax.swing.JFrame;

public class GameFrame extends JFrame {
  private static final int WIDTH = 800;
  private static final int HEIGHT = 600;
  static MainPanel mp;

  public GameFrame() {
    setTitle("LKDA");
    setPreferredSize(new Dimension(WIDTH, HEIGHT));
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    mp = new MainPanel();
    add(mp);
    pack();
    setVisible(true);
    setResizable(false);
  }
}
