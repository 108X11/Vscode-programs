import java.util.Scanner;

public class asdf {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

<<<<<<< HEAD
    int product = 1;
    int i = 1;
=======
    int sum = 0;
    int x = 1;
>>>>>>> c955ef999f5df98b589e0bc977638777e0649a70

    System.out.println("Enter a number ");
    int num = scan.nextInt();
    scan.close();

<<<<<<< HEAD
    while (i <= num) {
      product = product * i;
      i++;
    }
    System.out.println("The product of " + num + " is " + product);
=======
    while (num >= x) {
      sum = sum + x;
      x++;
    }
    System.out.println("The sum is " + sum);
>>>>>>> c955ef999f5df98b589e0bc977638777e0649a70
  }
}