import java.util.Scanner;

public class asdf {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int product = 1;
    int i = 1;

    System.out.println("Enter a number ");
    int num = scan.nextInt();
    scan.close();

    while (i <= num) {
      product = product * i;
      i++;
    }
    System.out.println("The product of " + num + " is " + product);
  }
}