package PAST;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class ImagePanel extends JPanel{
  private static final int WIDTH = 500;
  private static final int HEIGHT = 350;
  private static final int X = 10;
  private static final int Y = 10;
  private BufferedImage image;

  public ImagePanel(String path){

    setBounds(X,Y,WIDTH,HEIGHT);
    // 変数などの初期化
    setLayout(null);
    setBackground(Color.YELLOW);
    setBorder(new TitledBorder("イメージパネル"));
    try {
      this.image = ImageIO.read(getClass().getResource(path));
    } catch (IOException ex) {
      ex.printStackTrace();
      this.image = null;
    }
  }
/*
  public void addImage(String name) {
    ImageIcon icon = new ImageIcon(getClass().getResource(name));
    JLabel label = new JLabel(icon, SwingConstants.CENTER);
    //label.setIcon(icon);
    this.add(label);
  }
*/
  @Override
  public void paintComponent(Graphics g) {
    Graphics2D g2D = (Graphics2D) g;

    double imageWidth = image.getWidth();
    double imageHeight = image.getHeight();
    double panelWidth = this.getWidth();
    double panelHeight = this.getHeight();

    // 画像がコンポーネントの何倍の大きさか計算
    double sx = (panelWidth / imageWidth);
    double sy = (panelHeight / imageHeight);

    // スケーリング
    AffineTransform af = AffineTransform.getScaleInstance(sx, sy);
    g2D.drawImage(image, af, this);
  }
}
