import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.TitledBorder;

public class ImagePanel extends JPanel{
  private static final int WIDTH = 500;
  private static final int HEIGHT = 350;
  private static final int X = 10;
  private static final int Y = 10;

  public ImagePanel(){
    setBounds(X,Y,WIDTH,HEIGHT);
    // 変数などの初期化
    setLayout(null);
    setBackground(Color.YELLOW);
    setBorder(new TitledBorder("イメージパネル"));
  }

  public void addImage(String name) {
    ImageIcon icon = new ImageIcon(getClass().getResource(name));
    JLabel label = new JLabel(icon, SwingConstants.CENTER);
    this.add(label);
  }
}
