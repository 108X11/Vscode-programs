//import java.util.Scanner;

public class dowhile {
  public static void main(String[] args) {

    /*
     * int x = 1, num , product = 1;
     * Scanner scan = new Scanner(System.in);
     * 
     * System.out.println("Enter a number: ");
     * num = scan.nextInt();
     * 
     * do{
     * product = product * x;
     * x++;
     * 
     * }while(x <= num);
     * 
     * System.out.println("The product of " + num + " is " + product);
     */

    for (int i = 1; i <= 5; i++) {
      for (int j = i; j <= 5; j++) {
        System.out.print("* ");
      }

      System.out.println(" ");
    }
  }
}
