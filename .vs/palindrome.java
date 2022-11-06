import java.util.Scanner;

public class palindrome {

    public static void main(String[] args) {

        String string = " ", reverse = "";

        Scanner scan = new Scanner(System.in);

        System.out.print("input a word: ");
        string = scan.nextLine();
        scan.close();

        int strLength = string.length();

        for (int i = (strLength - 1); i >= 0; --i) {
            reverse = reverse + string.charAt(i);
        }

        if (string.toLowerCase().equals(reverse.toLowerCase())) {
            System.out.println("The word " + string + " is a palindrome String.");
        } else {
            System.out.println("The word " + string + " is not a palindrome String.");
        }
    }
}
