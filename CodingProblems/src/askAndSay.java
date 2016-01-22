import java.util.Scanner;

public class askAndSay
{
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
    System.out.print("Please enter your first name:");
    String name = scan.next();
    System.out.print("Hello " + name + "!");
  }
}
