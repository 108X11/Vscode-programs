import java.util.Scanner;

public class forloopppp {
 public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int i = sc.nextInt();

        //print any number below 10 then increment

        //for(initilization; condition; incerement/decrement){Statement}
        /*for(; i<10; i++ ){
            System.out.println(i);
        }*/


        while(i<10){
            System.out.println(i);
            i++;
        }

    }
}
