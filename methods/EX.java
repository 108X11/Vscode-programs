public class EX {
  public static void main(String[] args) {

    /*
     * int i;
     * for (i = 1; i <= 4; i++) {
     * for (int j = 1; j <= i; j++) {
     * System.out.print("* ");
     * }
     * }
     */

    // Only change code below this line
    /*
     * int a = 5;
     * int b = 10;
     * String c = "I am a ";
     * // Only change code above this line
     * 
     * a = a + 1;
     * b = b + 5;
     * c = c + " String!";
     * 
     * System.out.println(a);
     * System.out.println(b);
     * System.out.println(c);
     */

    for (int x = 1; x <= 4; x++) {
      for (int j = 1; j <= x; j++)
        System.out.print("* ");
    }
    System.out.println();
  }
}
