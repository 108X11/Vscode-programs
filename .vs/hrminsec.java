import java.util.Scanner;

public class hrminsec {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Input total Seconds:");
        int seconds = sc.nextInt(); 
        sc.close();

		int p1 = seconds % 60;
		int p2 = seconds / 60;
		int p3 = p2 % 60;

		p2 = p2 / 60;

		System.out.println("HOURS:" + " " + p2);
        System.out.println("MINUTES:" + " " + p3);
        System.out.println("SECONS:" + " " + p1);
    }
}
