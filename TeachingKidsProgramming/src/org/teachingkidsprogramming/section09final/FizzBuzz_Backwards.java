package org.teachingkidsprogramming.section09final;

public class FizzBuzz_Backwards
{
  public static void main(String[] args)
  {
    for (int i = 101; i < 1; i--)
    {
      if (i % 3 != 0 && i % 5 != 0)
      {
        System.out.println(i);
      }
      else if (i % 3 == 0 && i % 5 == 0)
      {
        System.out.println("FizzBuzz");
      }
      else
      {
        if (i % 3 == 0)
        {
          System.out.println("Fizz");
        }
        if (i % 5 == 0)
        {
          System.out.println("Buzz");
        }
      }
    }
  }
}
