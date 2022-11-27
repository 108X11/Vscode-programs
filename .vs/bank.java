import java.util.Scanner;

public class bank{
public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    }

    class bankaccount{

        int balance;
        int previoustransact;
        String custormersName;
        String cystomersId;

        bankaccount(String cname, String cId){

            custormersName = cname;
            customersId

        }

        void deposit(int amount){

            if (amount != 0 ){
                balance = balance + amount;
                previoustransact = amount;
            }
        }
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
    }
}