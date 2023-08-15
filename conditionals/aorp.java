import java.util.Scanner;

public class aorp {
    public static void main(String[]args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter length: ");
        float length = sc.nextFloat();

        System.out.println("Enter width: ");
        float width = sc.nextFloat();

        System.out.println("What do you want to compute? a for area and p for preimeter");
        char choice = sc.next().charAt(0);

        if(choice == 'A' || choice == 'A'){

            float area = length * width;
            System.out.println("The area is: " + area);

        }else if(choice == 'p' || choice == 'P'){
            
            float perimeter = 2 * length + 2 * width;
            System.out.println("The area of the perimeter is: " + perimeter);
        }
    }
}
