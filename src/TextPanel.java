import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class TextPanel extends JPanel{
  private static final int WIDTH = 500;
  private static final int HEIGHT = 170;
  private static final int X = 10;
  private static final int Y = 370;

  public TextPanel(){
    setBounds(X,Y,WIDTH,HEIGHT);
    // 変数などの初期化
    setLayout(null);
    setBackground(Color.ORANGE);
    setBorder(new TitledBorder("テキストパネル"));
  }

}
