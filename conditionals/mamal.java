import java.util.Scanner;


public class mamal {
    public static void main(String []args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Is_Mamal?:");
        char yes = sc.next().charAt(0);

        System.out.println("No_of_Legs:");
        int legs = sc.nextInt();

        System.out.println("Can_Bark?:");
        int bark = sc.next().charAt(0);

        if(yes == 'y' || yes == 'Y'){
            if(bark == 'y' || bark == 'Y'){
                System.out.println("Dog");
            }else{
                System.out.println("Cat");
            }
        }else{
            if(legs == 2){
            System.out.println("Bird");
            }else{
                if(legs == 0){
                    System.out.println("Fish");
                }else{
                System.out.println("UNKNOWN ANIMAL");
                }
            }
        }
    }
}
