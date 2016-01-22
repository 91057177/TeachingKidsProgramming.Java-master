package org.teachingkidsprogramming.section08events;

import org.teachingextensions.logo.utils.EventUtils.MessageBox;

public class OurCalculator
{
  public static void main(String[] args)
  {
    int num1 = MessageBox.askForNumericalInput("Please enter the first number");
    int num2 = MessageBox.askForNumericalInput("Please enter the next number");
    String opp = MessageBox.askForTextInput("Enter symbol for operation,+,-,x,/,e for exponents");
    if (opp.equals("-"))
    {
      int difference = subtract(num1, num2);
      MessageBox.showMessage(num1 + "-" + num2 + "=" + difference);
    }
    //
    if (opp.equals("x"))
    {
      int product = multiply(num1, num2);
      MessageBox.showMessage(num1 + "x" + num2 + "=" + product);
    }
    //
    if (opp.equals("/"))
    {
      int quotient = divide(num1, num2);
      if (quotient == -1) { return; }
      MessageBox.showMessage(num1 + "/" + num2 + "=" + quotient);
    }
    //
    if (opp.equals("e"))
    {
      int answer = pow(num1, num2);
      MessageBox.showMessage("The answer of " + num1 + " to the power of " + num2 + " is: " + answer);
    }
    //
    if (opp.equals("+"))
    {
      int sum = add(num1, num2);
      MessageBox.showMessage("" + num1 + " + " + num2 + " = " + sum);
    }
  }
  public static int add(int n1, int n2)
  {
    return n1 + n2;
  }
  public static int subtract(int n1, int n2)
  {
    return n1 - n2;
  }
  public static int multiply(int n1, int n2)
  {
    return n1 * n2;
  }
  public static int divide(int n1, int n2)
  {
    if (n2 == 0)
    {
      MessageBox.showMessage("The number you entered is not divisible by zero!!");
      return -1;
    }
    else
    {
      return n1 / n2;
    }
  }
  public static int pow(int base, int exp)
  {
    int answer = 1;
    for (int i = 0; i < exp; i++)
    {
      answer = answer * base;
    }
    return answer;
  }
}
