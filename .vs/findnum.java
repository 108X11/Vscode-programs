import java.util.Scanner;

public class findnum {
    public static void main(String[] args) {

        int num;

        Scanner scan = new Scanner(System.in);
        int array[] = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter no: ");
            array[i] = scan.nextInt();
        }
        for (int i = 0; i < 5; i++) {
            for (int j = i + 1; j < 5; j++) {
                if (array[i] > array[j]) {
                    num = array[i];
                    array[i] = array[j];
                    array[j] = num;
                }
            }
        }
        System.out.print("Arranged: ");
        for (int i = 0; i < 5 - 1; i++) {
            System.out.print(array[i] + ",");
        }
        System.out.print(array[5 - 1]);
    }
}
