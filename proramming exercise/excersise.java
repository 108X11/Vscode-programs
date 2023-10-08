import java.util.Scanner;

public class excersise {
    public static void main(String[] args) {

        /*
         * int a;
         * double b;
         * boolean c, d, e, f;
         * 
         * a = (101 + 0) / 3;
         * b = 3.0e-6 * 10000000.1;
         * c = true && true;
         * d = false && true;
         * e = (false && false) || (true && true);
         * f = (false || false) && (true && true);
         * 
         * System.out.println("Answer is " + a);
         * System.out.println("Answer is " + b);
         * System.out.println("Answer is " + c);
         * System.out.println("Answer is " + d);
         * System.out.println("Answer is " + e);
         * System.out.println("Answer is " + f);
         */

        Scanner sc = new Scanner(System.in);

        System.out.print("Input first number: ");
        int num1 = sc.nextInt();

        System.out.print("Input second number: ");
        int num2 = sc.nextInt();

        System.out.print("Input third number: ");
        int num3 = sc.nextInt();

        System.out.print("Input fourth number: ");
        int num4 = sc.nextInt();

        if ((num1 == num2) && (num1 == num3) && (num1 == num4)) {
            System.out.println("They are all equal!");
        } else {
            System.out.println("Numbers are not equal!");
        }

    }
}
