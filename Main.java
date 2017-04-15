package Key;

import javax.microedition.lcdui.Canvas;
import javax.microedition.lcdui.Display;
import javax.microedition.midlet.MIDlet;

public class Main extends MIDlet
{
  Canvas canvas;
  Display dis = Display.getDisplay(this);

  public void startApp()
  {
    this.canvas = new KeyCanvas();
    this.dis.setCurrent(this.canvas);
    this.canvas.setFullScreenMode(true);
  }

  public void pauseApp()
  {
  }

  public void destroyApp(boolean paramBoolean)
  {
  }
}
