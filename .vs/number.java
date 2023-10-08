import java.util.Scanner;

public class number {
  public static void main(String[] args) {
<<<<<<< HEAD

    Scanner scan = new Scanner(System.in);
    int num;
=======
    int num;
    Scanner scan = new Scanner(System.in);

>>>>>>> c955ef999f5df98b589e0bc977638777e0649a70
    // This is an infinite loop since it is true
    while (true) {
      System.out.println("Enter a number");
      num = scan.nextInt();

      /*
       * The twist of the infinite loop wherein if num is less than zero the loop will
       * stop and then proceeds to the next block
       */
      if (num < 0)
        break;
    }
    System.out.println("Finished");
  }
}
