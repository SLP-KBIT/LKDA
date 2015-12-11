package PAST;

import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class CommandPanel extends JPanel{
  private static final int WIDTH = 170;
  private static final int HEIGHT = 170;
  private static final int X = 520;
  private static final int Y = 370;

  public CommandPanel(){
    setBounds(X,Y,WIDTH,HEIGHT);
    // 変数などの初期化
    setLayout(null);
    setBackground(Color.BLUE);
    setBorder(new TitledBorder("コマンドパネル"));
  }
}
