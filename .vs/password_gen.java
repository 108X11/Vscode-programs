import java.util.Scanner;

public class password_gen {
    public static void main(String[]args) {

    char ch;
    String name, pass;

    do{
        Scanner sc = new Scanner(System.in);

        System.out.print("What is your username? ");
        name = sc.nextLine();

        System.out.print("What is your password? ");
        pass = sc.nextLine();

        if(name.equals("lamuas108X11") && pass.equals("Lamuas080300")){
            System.out.println("Access granted!");
            
        }else{
            System.out.println("Access Denied!");
        }

        System.out.println("Do you want to try again? Type y for yes and n for no");
        ch = sc.next().charAt(0);
        }while(ch == 'y' || ch == 'Y');
    }
}
