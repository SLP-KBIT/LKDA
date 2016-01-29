package PAST;

import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class InformationPanel extends JPanel {
  private static final int WIDTH = 170;
  private static final int HEIGHT = 350;
  private static final int X = 520;
  private static final int Y = 10;

  public InformationPanel(){
    setBounds(X,Y,WIDTH,HEIGHT);
    // 変数などの初期化
    setLayout(null);
    setBackground(Color.GREEN);
    setBorder(new TitledBorder("情報パネル"));
  }
}
