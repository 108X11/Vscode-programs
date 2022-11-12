import java.util.Scanner;

public class meth{

    public static void main (String []args){

        System.out.println("1. Add");
        System.out.println("2. Remove");
        System.out.println("3. Insert");
        System.out.println("4. Delete all");

        chooseNumber();
        
        }

    static void chooseNumber(){

        Scanner sc = new Scanner(System.in);

        //Ask what action the person wants
        System.out.print("What do you want to do? ");
        int choose = sc.nextInt();

        //this action determin if the user input matches with the numbers then proceed with the statement
        switch(choose){
            case 1:
            addString();

            case 2:
            removeString();

            case 3:
            removeString();

            case 4:
            insertString();

            case 5:
            deleteString();
        }

    }
        


    static void addString(){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = sc.next();

        System.out.println("You added: " + name);

        System.out.println("1. Add");
        System.out.println("2. Remove");
        System.out.println("3. Insert");
        System.out.println("4. Delete all");

        chooseNumber();
        
    }

    static void removeString(){

    }

    static void insertString(){

    }

    static void deleteString(){

    }
    
}