package Key;

import java.util.Date;
import javax.microedition.lcdui.Canvas;
import javax.microedition.lcdui.Graphics;

public class KeyCanvas extends Canvas
{
  int key1 = 0;
  Date date = new Date();
  int Memory = freeMemory();
  int totalMemory = totalMemory();
  String name = "";

  public void paint(Graphics paramGraphics)
  {
    paramGraphics.setColor(8, 5, 5);
    paramGraphics.fillRect(0, 0, getWidth(), getHeight());
    paramGraphics.setColor(0, 70, 10);  
    paramGraphics.drawLine(0,30,240,30);
    paramGraphics.setColor(0,70,10);
    paramGraphics.drawLine(0,285,240,285);
    paramGraphics.setColor(0, 255, 0);
    paramGraphics.drawString("KEY 1.5.5", 85, 20, 68);
    paramGraphics.drawString("Dospy.com", 0, 50, 68);
    paramGraphics.drawString("键值:".concat(String.valueOf(this.key1)), 0, 70, 68);
    paramGraphics.drawString("键值名称:".concat(String.valueOf(this.name)), 0, 90, 68);
    paramGraphics.setColor(150,150,51);
    paramGraphics.drawString("当前时间:"+ date,0,115,68);
    paramGraphics.setColor(250,0,250);
    paramGraphics.drawString("按挂机键退出软件", 61, 305, 68);
  }
public void keyPressed(int paramInt)
  {
    this.key1 = paramInt;
    this.name = getKeyName(paramInt);
    repaint();
  }

  public void keyReleased(int paramInt)
  {
  }

  public void keyRepeated(int paramInt)
  {
  }
}
