package PAST;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class CommandPanel extends JPanel implements ActionListener {
  private static final int WIDTH = 170;
  private static final int HEIGHT = 170;
  private static final int X = 520;
  private static final int Y = 370;
  JButton attack, cure, magic;

  public CommandPanel(){
    setBounds(X,Y,WIDTH,HEIGHT);
    // 変数などの初期化
    setLayout(new FlowLayout());
    setBackground(Color.BLUE);
    setBorder(new TitledBorder("コマンドパネル"));
    attack = new JButton("攻撃");
    attack.setBounds(25, 20, 120,30);
    attack.addActionListener(this);
    add(attack);
    cure = new JButton("回復");
    cure.setBounds(25, 60, 120,30);
    cure.addActionListener(this);
    add(cure);
    magic = new JButton("魔法");
    magic.setBounds(25, 100, 120,30);
    magic.addActionListener(this);
    add(magic);
  }

  public void actionPerformed(ActionEvent e) {
    if (e.getSource() == attack) {
      Run.battleExec(1);
    }

    if (e.getSource() == cure) {
      Run.battleExec(2);
    }

    if (e.getSource() == magic) {
      Run.battleExec(3);
    }
  }
}
