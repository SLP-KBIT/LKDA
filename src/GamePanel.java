import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
public class GamePanel extends JPanel {

  //--- イメージパネルの設計
  JPanel imgpanel(){
    JPanel panel = new JPanel();
    ImageIcon  img;
    img = new ImageIcon("seki.jpg");
    JLabel label = new JLabel(img);
    label.setBounds(10, 10, 100, 100);
    panel.add(label);

    panel.setBorder(new TitledBorder("イメージパネル"));
    panel.setBounds(10, 10, 120, 120);// パネルのサイズ・位置を設定
    return panel;
  }

  //--- テキストパネルの設計
  JPanel txtpanel(){
    JPanel panel = new JPanel();
    return panel;
  }

  //--- コマンドパネルの設計
  JPanel cmdpanel(){
    JPanel panel = new JPanel();
    return panel;
  }

  //--- 情報パネルの設計
  JPanel infopanel(){
    JPanel panel = new JPanel();
    return panel;
  }
}
