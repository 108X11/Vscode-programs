import java.util.Scanner;

public class trayangol {
    public static void main(String[] args) {

        // Get the area of a triangle using scanner
        // Get the area of a triangle given it's base and height

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the base: ");
        double base = sc.nextDouble();

        System.out.print("Enter the radius: ");
        double height = sc.nextDouble();

        double area = (base * height) / 2;

        System.out.println("The area of a Triangle is: " + area);

        /*
         * System.out.println("Enter radius:");
         * float radius = sc.nextFloat();
         * 
         * area = (3.14f*radius*radius);
         * 
         * System.out.println("Area of a circle:" + " " + area);
         * System.out.println("The area of a Triangle is: " + "  "+ area);
         */

    }
}
