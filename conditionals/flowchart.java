import java.util.Scanner;

public class flowchart {
    public static void main(String []args){
        
        //this program checks and prints the greatest value
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter x: ");
        int x = sc.nextInt();

        System.out.println("Enter y: ");
        int y = sc.nextInt();
 
        System.out.println("Enter z: ");
        int z = sc.nextInt();


        //check if x is greater than y
        if(x > y){

            //this compare if x is greater than z
            if(x > z){
                //this prints if the statement is true
                System.out.println("The highest is" + " " + x);
            }else{
                //this prints if the statement is false
                System.out.println("The highest is" + " " + z);
            }

            //if the answer is false
        }else{

            //this compare if y is greater than z
            if(y > z){

                //prints if the statement is true
                System.out.println("The highest is" + " " + y);
            }else{

                //this prints if the statement is false
                System.out.println("The highest is" + " " + z);
            }
        }
    }
}
