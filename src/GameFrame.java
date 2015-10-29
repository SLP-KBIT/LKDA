import java.awt.Color;
import java.awt.Container;

import javax.swing.JFrame;

public class GameFrame extends JFrame {
  private static final int WIDTH = 710;
  private static final int HEIGHT = 580;
  //private static final int X = 10;
  //private static final int Y = 10;
  Container content = getContentPane();
  ImagePanel imgpanel;
  TextPanel txtpanel;
  CommandPanel cmdpanel;
  InformationPanel infopanel;

  public GameFrame() {
    setTitle("LKDA");
    setSize(WIDTH, HEIGHT);
    setLocationRelativeTo(null);
    setLayout(null);
    setResizable(false);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    content.setBackground(Color.BLACK);
    setVisible(true);
  }

  //--- タイトル画面を生成
  public void titleScreen() {
    // コンポーネントを生成・追加
  }

  //--- タイトル画面からプレイ画面へ移行
  public void changeScreen() {
    //-- タイトル画面のコンポーネントを消去

    //-- プレイ画面のコンポーネントを生成・追加
    imgpanel = new ImagePanel("/image/seki.jpg");
    txtpanel = new TextPanel();
    cmdpanel = new CommandPanel();
    infopanel = new InformationPanel();
    repaint();
    content.add(imgpanel);
    content.add(txtpanel);
    content.add(cmdpanel);
    content.add(infopanel);
    //repaint();
  }

  //--- 画像の変更
  public void chageImage() {
    // 今の敵の画像を消去
    // 新しい敵の画像を描画
  }

  //--- ゲームオーバー画面
  public void gameoverScreen() {

  }
}
