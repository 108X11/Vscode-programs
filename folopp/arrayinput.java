import java.util.Scanner;

public class arrayinput {
    
    public static void main(String[] args) {
        Scanner in=new Scanner (System.in);
        int num[]=new int[5];
        int average=0;
        int sum=0;

        for (int i=0;i<num.length;i++) {
            System.out.println("enter a number");
            num[i]=in.nextInt();
            sum=sum+num[i];
        }
        average=sum/5;
        System.out.println("Average="+ average);
    }
}