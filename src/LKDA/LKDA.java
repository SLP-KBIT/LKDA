package LKDA;

import java.awt.Container;

import javax.swing.JFrame;

public class LKDA extends JFrame {
  public LKDA() {
    //-- タイトル
    setTitle("LKDA");

    //-- パネル生成
    MainPanel panel = new MainPanel();
    Container contentPane = getContentPane();
    contentPane.add(panel);

    //-- パネルサイズに合わせてフレームサイズを設定
    pack();

  }

  public static void main(String[] args) {
    LKDA frame = new LKDA();
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
    frame.setResizable(false);
  }
}
