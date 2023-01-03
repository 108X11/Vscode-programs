import java.util.Scanner;

public class number {
  public static void main(String[] args) {
    int num;
    Scanner scan = new Scanner(System.in);
    while (true) {
      System.out.println("Enter a number");
      num = scan.nextInt();

      if (num < 0)
        break;
    }
  }
}
