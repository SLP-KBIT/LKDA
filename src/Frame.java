import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Frame/* extends JFrame implements ActionListener*/ {
  JFrame content;
  JLabel tittle_logo;
  JButton finish;

  void createFrame (Enemy ene) {
    content = new JFrame("View JFrame");
    content.setSize(1000,800);
    content.setVisible(true);

    tittle_logo = new JLabel("knyn");
    tittle_logo.setFont(new Font("Century", Font.ITALIC, 300));
    tittle_logo.setBounds(700, 500, 200, 400);
    content.add(tittle_logo);

    finish = new JButton(ene.name);
    finish.setBounds(167, 220, 91, 21);
    content.add(finish);
    //finish.addActionListener(this);

  }


  /*public void actionPerformed(ActionEvent e) {
    if (e.getSource() == finish) {
      System.exit(0);
  }
  }*/
}