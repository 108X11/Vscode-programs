import java.util.Scanner;

public class fahrentocel {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);

        float Fahren, celsius;
        System.out.println("Input a degree in Fahrenheit:");
        Fahren = sc.nextFloat();
        sc.close();

        celsius = ((Fahren-32)*5)/9;

        //Display computed value
        System.out.println("Celsius:" + " " + celsius);
    }
}
