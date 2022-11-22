import java.util.Scanner;

public class bingo{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number from 1 to 75");
        int num = sc.nextInt();

        if((num >= 1 ) && (num <= 15)){
            System.out.println("B");
        }else if((num > 16) && (num <= 30)){
            System.out.println("I");
        }else if ((num > 31) && (num <= 45)){
            System.out.println("N");
        }else if ((num > 46) && (num <= 60)){
            System.out.println("G"); 
        }else if ((num > 61) && (num <= 75)){
            System.out.println("O");
        }
    }
}
