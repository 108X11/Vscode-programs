public class pattern {
  public static void main(String[] args) {
    int n = 5;

    // this a pattern for square

    for (int x = 1; x <= n; x++) {
      for (int j = 1; j <= n; j++) {
        System.out.print("* ");
      }
      System.out.println();
    }

    System.out.println();

    // This is a pattern for right side triangle

    for (int x = 1; x <= n; x++) {
      for (int j = 1; j <= x; j++) {
        System.out.print("*");
      }
      System.out.println();
    }

    System.out.println();

    // This is program for
    for (int x = 1; x <= n; x++) {
      for (int j = 1; j <= x; j++) {
        System.out.print(" ");
      }
      for (int j = 1; j <= x; j++) {
        System.out.print("");
      }
      System.out.println("*");
    }

    System.out.println();

    for (int i = 1; i <= n; ++i) {
      for (int j = 1; j <= i; ++j) {
        System.out.print(" ");
      }
      for (int j = 1; j <= i; j++) {
        System.out.print("* ");
      }
      System.out.println();
    }

    System.out.println();

    for (int i = 1; i <= n; ++i) {
      for (int j = 1; j <= i; ++j) {
        System.out.print(" ");
      }
      for (int j = i; j <= n; j++) {
        System.out.print("* ");
      }
      System.out.println();
    }

    System.out.println();

    for (int i = 1; i <= n; ++i) {
      for (int j = i; j <= n; ++j) {
        System.out.print(" ");
      }
      for (int j = 1; j <= i; j++) {
        System.out.print("* ");
      }
      System.out.println();
    }

    System.out.println();

    for (int i = 1; i <= n; ++i) {
      for (int j = i; j <= n; ++j) {
        System.out.print("* ");
      }
      System.out.println();
    }

  }
}
