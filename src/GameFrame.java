import java.awt.Color;
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class GameFrame extends JFrame {
  private static final int WIDTH = 710;
  private static final int HEIGHT = 580;
  //private static final int X = 10;
  //private static final int Y = 10;
  Container content = getContentPane();
  JLabel titlelabel;
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
  }

  //--- タイトル画面を生成
  public void titleScreen() {
    //-- コンポーネントを生成・追加
    titlelabel = new JLabel("タイトル", SwingConstants.CENTER);
    titlelabel.setSize(200, 200);
    content.add(titlelabel);
    setVisible(true);
  }

  //--- タイトル画面からプレイ画面へ移行
  public void changeScreen() {
    //-- タイトル画面のコンポーネントを消去
    content.remove(titlelabel);
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
    content.setBackground(Color.BLACK);
  }

  //--- 画像の変更
  public void chageImage(String path) {
    //-- 今の敵の画像を消去
    content.remove(imgpanel);
    //-- 新しい敵の画像を描画
    imgpanel = new ImagePanel("/image/" + path);
    content.add(imgpanel);
    repaint();
  }

  //--- ゲームオーバー画面
  public void gameoverScreen() {

  }
}
