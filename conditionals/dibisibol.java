import java.util.Scanner;

public class dibisibol {
    public static void main(String[]args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a positive integer");
        int num = sc.nextInt();

        if(num % 5 == 0){
            
            System.out.println("It's multiple of 5");

        }else{

            System.out.println("It's not mutliple of 5");
        }
    }
}
