import java .util.Scanner;
public class CheckOddEven{
    public static void main(String[] args){
         Scanner sc = new Scanner(System.in);

         String quitmsg = "Bye!";
         int number;

         System.out.println("Input number");
         number = sc.nextInt();
        sc.close();

        // Determine whether the number entered is odd or even
         if((number % 2) == 0){
             System.out.println("Remark: Even");
         }else {
             System.out.println("Remark: Odd");
         }
            System.out.println(quitmsg);
        

    }

}
