package LKDA;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class HPWindow extends JPanel implements Runnable{
  private final int WIDTH = 150;
  private final int HEIGHT = 150;

  public HPWindow() {
    setBounds(700,0,WIDTH, HEIGHT);
    setBackground(Color.BLUE);
  }

  public void run() {

  }

  @Override
  public void paintComponent(Graphics g) {

  }
}

