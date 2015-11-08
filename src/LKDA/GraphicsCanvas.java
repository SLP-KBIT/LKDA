package LKDA;

import java.awt.Canvas;
import java.awt.Color;

//=============================================================
//=============戦闘のキャラ絵を表示させるクラス================
//=============================================================
public class GraphicsCanvas extends Canvas
{
  private static final int X = 0;
  private static final int Y = 0;
  private static final int WIDTH = 600;
  private static final int HEIGHT = 400;
  private static final Color color = Color.GRAY;

  public GraphicsCanvas()
  {
    setBounds(X, Y, WIDTH, HEIGHT);
    setBackground(color);
  }
}
