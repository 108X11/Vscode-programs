<<<<<<< HEAD
import java.util.Scanner;

public class celtofa {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int Fahrenheit, Celsius;
        System.out.println("Enter celsius:");
        Celsius = scan.nextInt();

        Fahrenheit = ((Celsius * 9) / 5) + 32;
=======
public class celtofa {
    public static void main(String []args){
        
        float Fahrenheit, Celsius;  
          
        
        Celsius= 20;  
        Fahrenheit =((Celsius*9)/5)+32;  
>>>>>>> c955ef999f5df98b589e0bc977638777e0649a70
        System.out.println("Temperature in Fahrenheit is: " + Fahrenheit);
    }
}
