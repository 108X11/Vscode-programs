import java.util.Scanner;

public class Sample{
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter number 1 ");
    int num1 = sc.nextInt();

    System.out.println("Enter number 2 ");
    int num2 = sc.nextInt();

    int result = num1 + num2;
    System.out.println("The result is " + result);
  }
}