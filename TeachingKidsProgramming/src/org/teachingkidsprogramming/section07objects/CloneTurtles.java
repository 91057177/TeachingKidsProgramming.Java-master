package org.teachingkidsprogramming.section07objects;

import java.util.ArrayList;

import org.teachingextensions.WindowUtils.MultiTurtleWindow;
import org.teachingextensions.logo.Turtle;
import org.teachingextensions.logo.utils.ColorUtils.PenColors;
import org.teachingextensions.logo.utils.LineAndShapeUtils.Text;

public class CloneTurtles
{
  public ArrayList<Turtle> turtles = new ArrayList<Turtle>();
  public MultiTurtleWindow mtw     = new MultiTurtleWindow();
  public CloneTurtles()
  {
    showSomeTurtles();
  }
  private void showSomeTurtles()
  {
    for (int i = 0; i < 75; i++)
    {
      Turtle myTurtle = new Turtle();
      turtles.add(myTurtle);
    }
    int numberOfTurtles = turtles.size();
    System.out.println(numberOfTurtles);
    new Text("There are " + numberOfTurtles + " turtles in the turtle container").setTopLeft(50, 50)
        .setPenColor(PenColors.Whites.FloralWhite).addTo(mtw);
    //
    for (Turtle turtle : turtles)
    {
      mtw.addAndShowTurtle(turtle);
    }
    for (int i = 0; i < 75; i++)
    {
      int y = 150;
      if (i % 1700 == 0)
      {
        i = 100;
        y += 100;
      }
      turtles.get(i).setX(i * 70);
      turtles.get(i).setY(y);
    }
    //
    for (Turtle turtle : turtles)
    {
      turtle.setPenWidth(10);
      turtle.setSpeed(9);
      for (int i = 0; i < 5; i++)
      {
        turtle.turn(145);
        turtle.move(100);
      }
    }
  }
  public static void main(String[] args)
  {
    new CloneTurtles();
  }
}
