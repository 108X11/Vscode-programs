import java.util.Scanner;

public class positiveneg{
    public static void main (String[]args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Input number");
        int num = sc.nextInt();

        if(num >= 1){
            System.out.println("Positive");
        }

        else{
            System.out.println("Negative");
        }
    }
}