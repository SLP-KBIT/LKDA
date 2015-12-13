package LKDA;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

class MainPanel extends JPanel implements ActionListener {
  private static final int WIDTH = 800;
  private static final int HEIGHT = 600;
  private static final Color  color = Color.ORANGE;
  private static JButton image;
  private static JButton message;
  static GraphicsPanel gp;
  static MessagePanel mp;

  public MainPanel() {
    setPreferredSize(new Dimension(WIDTH, HEIGHT));
    setLayout(null);
    setBackground(color);
    gp = new GraphicsPanel();
    add(gp);
    mp = new MessagePanel();
    add(mp);
<<<<<<< HEAD
    image = new JButton("画像");
    image.addActionListener(this);
    image.setBounds(650, 400, 100, 50);
    add(image);
    message = new JButton("メッセージ");
    message.addActionListener(this);
    message.setBounds(650, 500, 100, 50);
    add(message);
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    if ( e.getSource() == image ) { gp.setImage("image/seki.jpg"); }
    if ( e.getSource() == message ) { mp.setMessage(); }
    repaint();
=======
    mp.setMessage();
    setVisible(true);
    setLayout(null);
>>>>>>> dec8c3068eb8cccb911cd6486c8dcdd3768a190c
  }
}
