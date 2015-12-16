package LKDA;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

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
  Random rand = new Random();

  public MainPanel() {
    setPreferredSize(new Dimension(WIDTH, HEIGHT));
    setLayout(null);
    setBackground(color);
    gp = new GraphicsPanel();
    add(gp);
    mp = new MessagePanel();
    add(mp);
    image = new JButton("画像");
    image.addActionListener(this);
    image.setBounds(650, 400, 100, 50);
    add(image);
    message = new JButton("メッセージ");
    message.addActionListener(this);
    message.setBounds(650, 500, 100, 50);
    add(message);
  }

  public void actionPerformed(ActionEvent e) {
    if ( e.getSource() == image ) { gp.setImage("image/seki.jpg"); }
    else if ( e.getSource() == message ) { mp.setMessage(rand.nextInt(2), rand.nextInt(3)); }
    repaint();
  }
}
