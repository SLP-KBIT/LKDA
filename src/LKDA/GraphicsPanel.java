package LKDA;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
//====================================================================
//            画像パネルの構造を定義するクラス
//====================================================================
public class GraphicsPanel extends JPanel {
  private static final int X = 5;
  private static final int Y = 5;
  private static final int WIDTH = 600;
  private static final int HEIGHT = 400;
  private static final Color color = Color.GRAY;
  private Image image;    // 画像を格納する変数
  private static int width;    // 画像の幅
  private static int height;    // 画像の高さ
  private static boolean flag;    // 出力用フラグ

  public GraphicsPanel() {
    setBounds(X, Y, WIDTH, HEIGHT);
    setBackground(color);
    flag = false;
  }

  //-- 画像をロード
  public void setImage(String path) {
    //- イメージを読み込む
    ImageIcon icon = new ImageIcon(getClass().getResource(path));
    image = icon.getImage();
    flag = true;
    //- 幅と高さをセット
    width = image.getWidth(this);
    height = image.getHeight(this);
  }

  @Override
  public void paintComponent(Graphics g) {
    super.paintComponent(g);
    if ( flag )  { g.drawImage(image, (WIDTH-width)/2, (HEIGHT-height)/2, this); }
  }
}
