import java.util.Scanner;

public class asdf {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int sum = 0;
    int x = 1;

    System.out.println("Enter a number ");
    int num = scan.nextInt();

    while (num >= x) {
      sum = sum + x;
      x++;
    }
    System.out.println("The sum is " + sum);
  }
}