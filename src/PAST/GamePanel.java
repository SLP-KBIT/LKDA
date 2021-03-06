package PAST;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
public class GamePanel extends JPanel {

  //--- イメージパネルの設計
  JPanel imgpanel(){
    JPanel panel = new JPanel();
    panel.setLayout(null);

    ImageIcon icon = new ImageIcon(getClass().getResource("image/seki.jpg"));
    JLabel label = new JLabel(icon);
    label.setBounds(50, 50, 100, 100);
    panel.add(label);

    panel.setBorder(new TitledBorder("イメージパネル"));
    panel.setBackground(Color.YELLOW);
    panel.setBounds(10, 10, 500, 350);// パネルのサイズ・位置を設定
    return panel;
  }

  //--- テキストパネルの設計
  JPanel txtpanel(){
    JPanel panel = new JPanel();
    panel.setBorder(new TitledBorder("テキストパネル"));
    panel.setBackground(Color.ORANGE);
    panel.setBounds(10, 370, 500, 170);// パネルのサイズ・位置を設定
    return panel;
  }

  //--- コマンドパネルの設計
  JPanel cmdpanel(){
    JPanel panel = new JPanel();
    panel.setBorder(new TitledBorder("コマンドパネル"));
    panel.setBackground(Color.BLUE);
    panel.setBounds(520, 370, 170, 170);// パネルのサイズ・位置を設定
    return panel;
  }

  //--- 情報パネルの設計
  JPanel infopanel(){
    JPanel panel = new JPanel();
    panel.setBorder(new TitledBorder("情報パネル"));
    panel.setBackground(Color.GREEN);
    panel.setBounds(520, 10, 170, 350);// パネルのサイズ・位置を設定
    return panel;
  }

  public void setPanel(JPanel p, int x, int y,int w, int h, Color c) {
    p.setSize(w,h);             //パネルのサイズを設定
    p.setBackground(c);         //パネルの背景色を設定
    p.setVisible(true);         //パネルの表示を許可
    p.setLocation(x,y);         //フレーム中でのパネルの位置を設定
  }
}
