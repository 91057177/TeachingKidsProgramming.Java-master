import java.util.Scanner;

public class printNIntegerson10rows
{
  public static void main(String[] args)
  {
    System.out.print("Enter The number of integers you want:");
    Scanner scan = new Scanner(System.in);
    int N = scan.nextInt();
    System.out.print("");
    for (int i = 0; i < 10; i++)
    {
      for (int j = 0; j < 10; j++)
      {
        System.out.println(j + 2 + " ");
      }
    }
  }
}