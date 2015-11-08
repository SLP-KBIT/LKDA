package LKDA;

import java.awt.Canvas;
import java.awt.Color;

//=============================================================
//==============戦闘の文章を表示させるクラス===================
//=============================================================
public class MessageCanvas extends Canvas
{
  private static final int X = 0;
  private static final int Y = 400;
  private static final int WIDTH = 600;
  private static final int HEIGHT = 200;
  private static final Color color = Color.BLACK;

  public MessageCanvas()
  {
    setBounds(X, Y, WIDTH, HEIGHT);
    setBackground(color);
  }
}
