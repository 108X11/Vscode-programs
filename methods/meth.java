import java.util.Scanner;

import javax.sql.rowset.spi.SyncResolver;

public class meth{

    public static void main (String []args){

        System.out.println("1. Add");
        System.out.println("2. Remove");
        System.out.println("3. Insert");
        System.out.println("4. Delete all");

        Scanner sc = new Scanner(System.in);

        System.out.print("What do you want to do? ");
        int choose = sc.nextInt();

        if (choose == 1){
            addString();
        }
    }


    static void addString(){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = sc.next();

        System.out.println("You added: " + name);

        

    }

    
}