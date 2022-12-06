import java.util.Scanner;

public class terminal{
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Username: ");
        String name = scan.nextLine();

        System.out.print("Enter Password: ");
        String pass = scan.nextLine();

        if((name.equals("name")) && (pass.equals("pass1"))){
            System.out.println("Access Granted");
        }else{
            System.out.println("Access Denied");
        }
    }
}
