import java.util.Scanner;

public class celtofa {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int Fahrenheit, Celsius;
        System.out.println("Enter celsius:");
        Celsius = scan.nextInt();

        Fahrenheit = ((Celsius * 9) / 5) + 32;
        System.out.println("Temperature in Fahrenheit is: " + Fahrenheit);
    }
}
