import java.util.Scanner;

<<<<<<< HEAD
public class bank {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

    }

    class bankaccount {
=======
public class bank{
public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    }

    class bankaccount{
>>>>>>> c955ef999f5df98b589e0bc977638777e0649a70

        int balance;
        int previoustransact;
        String custormersName;
        String customersId;

<<<<<<< HEAD
        bankaccount(String cname, String cId) {
=======
        bankaccount(String cname, String cId){
>>>>>>> c955ef999f5df98b589e0bc977638777e0649a70

            custormersName = cname;
            customersId = cId;

        }

<<<<<<< HEAD
        void deposit(int amount) {

            if (amount != 0) {
=======
        void deposit(int amount){

            if (amount != 0 ){
>>>>>>> c955ef999f5df98b589e0bc977638777e0649a70
                balance = balance + amount;
                previoustransact = amount;
            }
        }
<<<<<<< HEAD

        void withdrawal(int amount) {

            if (amount != 0) {
                balance = balance - amount;
                previoustransact = amount;
            }
        }

        void getprevioustransact() {

            if (previoustransact > 0) {
                System.out.println("Deposited" + previoustransact);
            } else if (previoustransact < 0) {
                System.out.println("Withdrawn" + Math.abs(previoustransact));
            } else {
                System.out.println("No transaction occured");
            }
        }

        void showMenu() {
            Scanner scan = new Scanner(System.in);

            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Get Previous Transact");

            System.out.println("Enter choice");
            char choice = scan.next().charAt(0);

            switch (choice) {
                case 1:
                    deposit(choice);
                    break;

                case 2:
                    withdrawal(choice);
                    break;

                case 3:
                    getprevioustransact();
                    break;
            }
        }
=======
         void withdrawal (int amount){

            if( amount != 0){
                balance = balance - amount;
                previoustransact = amount;
            }
         }

         void getprevioustransact(){
            
            if (previoustransact > 0) {
                System.out.println("Deposited" + previoustransact);
            }else if (previoustransact< 0) {
                System.out.println("Withdrawn" + Math.abs(previoustransact));
            }else{
                System.out.println("No transaction occured");
            }
         }
         void showMenu(){
            
         }
>>>>>>> c955ef999f5df98b589e0bc977638777e0649a70
    }
}