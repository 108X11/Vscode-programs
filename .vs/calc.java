import java.util.Scanner;

public class calc{

    public static void main(String[] args){
        
        //Using switch, calculator

        int num1, num2,result,choice;
        char ys;

        Scanner sc = new Scanner(System.in);

        do{
        System.out.println("1 Addittion");
        System.out.println("2 Subtraction");
        System.out.println("3 Multiplication");
        System.out.println("4 Division");
        System.out.println("5 Remainder");

        System.out.print("Enter operator: ");
        choice = sc.nextInt();

        switch(choice){
            case 1: 
            System.out.print("Enter num1: ");
            num1 = sc.nextInt();

            System.out.print("Enter num2: ");
            num2 = sc.nextInt();

            result = num1 + num2;
            System.out.println("The addition is: " + result);
            break;

            case 2:

            System.out.print("Enter num1: ");
            num1 = sc.nextInt();

            System.out.print("Enter num2: ");
            num2 = sc.nextInt();

            result = num1 - num2;
            System.out.println("The Subtraction is: " + result);
            break;

            case 3:
            System.out.print("Enter num1: ");
            num1 = sc.nextInt();

            System.out.print("Enter num2: ");
            num2 = sc.nextInt();

            result = num1 * num2;
            System.out.println("The Multiplication is: " + result);
            break;

            case 4:
            System.out.print("Enter num1: ");
            num1 = sc.nextInt();

            System.out.print("Enter num2: ");
            num2 = sc.nextInt();

            result = num1 / num2;
            System.out.println("The Division is: " + result);
            break;


            case 5:
            System.out.print("Enter num1: ");
            num1 = sc.nextInt();

            System.out.print("Enter num2: ");
            num2 = sc.nextInt();

            result = num1 % num2;
            System.out.println("The Modulo is: " + result);
            break;
            
            default:
                System.out.println("Wrong Operand");
        }
        
        System.out.println("Do you want to retry? y for yes and n for no");
         ys = sc.next().charAt(0);
        }while(ys == 'y' || ys == 'Y');
    }
}
