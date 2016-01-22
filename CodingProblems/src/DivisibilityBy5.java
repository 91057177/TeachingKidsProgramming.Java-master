import java.util.Scanner;

public class DivisibilityBy5
{
  public static void main(String[] args)
  {
    repeat();
  }
  private static void repeat()
  {
    @SuppressWarnings("resource")
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter a Number: ");
    int N = scan.nextInt();
    if (N < 1)
    {
      System.out.print("Must be greater than 1!");
      System.out.println();
      repeat();
    }
    if (N % 5 == 0)
    {
      System.out.print("Yes!");
      System.exit(0);
    }
    else
    {
      System.out.print("No!");
      System.out.println();
      repeat();
    }
  }
}
