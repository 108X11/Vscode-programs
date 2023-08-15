import java.util.Scanner;

public class negative {
  public static void main(String[] args) {

    int highest = 0, num;
    Scanner scan = new Scanner(System.in);

    while (true) {
      System.out.print("Enter a number: ");
      num = scan.nextInt();

      if (num > highest) {
        highest = num;
      }
      if (num == -999)
        break;
    }

    System.out.print("Highest number is: " + highest);
  }
}
