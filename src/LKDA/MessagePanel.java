package LKDA;

import java.awt.Color;

import javax.swing.JPanel;

public class MessagePanel extends JPanel {
  private static final int X = 0;
  private static final int Y = 400;
  private static final int WIDTH = 600;
  private static final int HEIGHT = 200;
  private static final Color color = Color.BLACK;

  public MessagePanel() {
    setBounds(X, Y, WIDTH, HEIGHT);
    setBackground(color);
  }
}
