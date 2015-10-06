import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class Frame extends JFrame/*implements ActionListener*/ {
  JFrame content;
  JLabel tittle_logo;
  JButton finish;
  JPanel imgpanel;
  GamePanel panel = new GamePanel();

  void createFrame (Enemy ene) {
    content = new JFrame("View JFrame");
    content.setSize(800,800);
    content.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    content.setVisible(true);

    tittle_logo = new JLabel("lkda", SwingConstants.CENTER);
    tittle_logo.setFont(new Font("Century", Font.ITALIC, 30));
    tittle_logo.setBounds(70, 50, 20, 40);
    content.add(tittle_logo);

    imgpanel = panel.imgpanel();
    content.add(imgpanel);
/*
    ImageIcon  img;
    img = new ImageIcon("C:\\Eclipse\\LKDA\\bin\\lolicom.jpg");
    JLabel label = new JLabel(img);
    content.add(label);
*/


    //finish = new JButton(ene.name);
    //finish.setBounds(167, 220, 91, 21);
    //content.add(finish);
    //finish.addActionListener(this);

  }


  /*public void actionPerformed(ActionEvent e) {
    if (e.getSource() == finish) {
      System.exit(0);
  }
  }*/
}