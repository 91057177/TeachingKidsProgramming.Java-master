package org.teachingkidsprogramming.section08events;

import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.utils.ColorUtils.ColorWheel;
import org.teachingextensions.logo.utils.ColorUtils.PenColors.Blues;
import org.teachingextensions.logo.utils.ColorUtils.PenColors.Greens;
import org.teachingextensions.logo.utils.ColorUtils.PenColors.Pinks;
import org.teachingextensions.logo.utils.ColorUtils.PenColors.Purples;
import org.teachingextensions.logo.utils.ColorUtils.PenColors.Reds;
import org.teachingextensions.logo.utils.EventUtils.MouseLeftClickListener;
import org.teachingextensions.logo.utils.EventUtils.MouseRightClickListener;
import org.teachingextensions.logo.utils.LineAndShapeUtils.Circle;
import org.teachingextensions.logo.utils.LineAndShapeUtils.Text;

public class ConnectTheDots implements MouseRightClickListener, MouseLeftClickListener
{
  public static void main(String[] args)
  {
    new ConnectTheDots();
  }
  {
    Tortoise.show();
    Tortoise.getBackgroundWindow().addMouseRightClickListener(this);
    Tortoise.getBackgroundWindow().addMouseLeftClickListener(this);
    Tortoise.setSpeed(10);
    clearTheScreen();
    prepareColorPalette();
  }
  private void clearTheScreen()
  {
    Tortoise.clear();
    new Text("Right click to Clear").setTopLeft(100, 100).addTo(Tortoise.getBackgroundWindow());
  }
  private void prepareColorPalette()
  {
    ColorWheel.addColor(Reds.Red);
    ColorWheel.addColor(Blues.Aqua);
    ColorWheel.addColor(Greens.Green);
    ColorWheel.addColor(Purples.Purple);
    ColorWheel.addColor(Blues.Teal);
    ColorWheel.addColor(Pinks.Pink);
  }
  private static void addMouseLeftClickListener(ConnectTheDots connectTheDots)
  {
    // TODO Auto-generated method stub
  }
  @Override
  public void onRightMouseClick(int x, int y)
  {
    //    clearTheScreen (recipe above) --#20.3
    clearTheScreen();
  }
  @Override
  public void onLeftMouseClick(int x, int y)
  {
    int radius = 7;
    addDot(x, y, radius);
  }
  private void addDot(int x, int y, int radius)
  {
    addACircle(x, y, radius);
    //
    Tortoise.moveTo(x, y);
  }
  private void addACircle(int x, int y, int radius)
  {
    Circle circle = new Circle(radius, ColorWheel.getNextColor());
    circle.setTransparency(60);
    circle.setCenter(x, y);
    circle.addTo(Tortoise.getBackgroundWindow());
  }
}
