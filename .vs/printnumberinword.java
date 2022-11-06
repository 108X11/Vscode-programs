import java.util.Scanner;
public class printnumberinword {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        
        //Enter number 1 to 10
        System.out.print("Input number from 1 to 10:" );
        int number = sc.nextInt();
        sc.close();

        //Switch statementt
        switch(number){
            case 1: System.out.println("In word/s: ONE");
            break;
            case 2: System.out.println("In word/s: TWO");
            break;
            case 3: System.out.println("In word/s THREE");
            break;
            case 4: System.out.println("In word/s: FOUR");
            break;
            case 5: System.out.println("In word/s: FIVE");
            break;
            case 6: System.out.println("In word/s SIX");
            break;
            case 7: System.out.println("In word/s: SEVEN");
            break;
            case 8: System.out.println("In word/s: EIGHT");
            break;
            case 9: System.out.println("In word/s NINE");
            break;
            case 10: System.out.println("In word/s TEN");
            break;
            default: System.out.println("Invalid!");
        }
    }
}
