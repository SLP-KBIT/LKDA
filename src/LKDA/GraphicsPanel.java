package LKDA;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class GraphicsPanel extends JPanel {
  private static final int X = 0;
  private static final int Y = 0;
  private static final int WIDTH = 600;
  private static final int HEIGHT = 400;
  private static final Color color = Color.GRAY;
  private Image image;
  private static int width;
  private static int height;
  private static boolean flag;

  public GraphicsPanel() {
    setBounds(X, Y, WIDTH, HEIGHT);
    setBackground(color);
    flag = false;
  }

  public void setImage(String path) {
    //-- イメージを読み込む
    ImageIcon icon = new ImageIcon(getClass().getResource(path));
    image = icon.getImage();
    flag = true;
    //-- 幅と高さをセット
    width = image.getWidth(this);
    height = image.getHeight(this);
  }

  @Override
  public void paintComponent(Graphics g) {
    super.paintComponent(g);
    if ( flag )  { g.drawImage(image, (WIDTH-width)/2, (HEIGHT-height)/2, this); }
  }
}
