import java.util.Scanner;

public class bank {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

    }

    class bankaccount {

        int balance;
        int previoustransact;
        String custormersName;
        String customersId;

        bankaccount(String cname, String cId) {

            custormersName = cname;
            customersId = cId;

        }

        void deposit(int amount) {

            if (amount != 0) {
                balance = balance + amount;
                previoustransact = amount;
            }
        }

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
    }
}