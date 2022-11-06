import java.util.Scanner;

public class search {
    public static void main(String[] args) {

        int length = 0;
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the String: ");
        String str = scan.nextLine();

        char[] strChars = str.toCharArray();
        for (char ch : strChars)
            length++;

        System.out.println("Length of String =  " + length);
    }
}
