public class Dia {
  public static void main(String[] args) {

    // Looping to print diamond asterisk pattern
    int n = 4;

    System.out.println("Asterisk Diamond Pattern:");
    // Up Triangle
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= n - i; j++) {
        System.out.print(" ");
      }
      for (int j = 1; j < i; j++) {
        System.out.print("* ");
      }
      System.out.print("*");
      System.out.println();
    }
    // Down Triangle
    for (int i = n - 1; i >= 1; i--) {
      for (int j = 1; j <= n - i; j++) {
        System.out.print(" ");
      }
      for (int j = 1; j < i; j++) {
        System.out.print("* ");
      }
      System.out.print("*");
      System.out.println();
    }
    System.out.println();

    // Printing array

    int arr[] = { 40, 30, 28, 58, 60, 98, 12, 15 };

    // Unsorted array/Original array
    System.out.print("Original Array: ");
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();

    // Sorting array asending

    for (int i = 0; i < arr.length - 1; i++) {
      for (int j = 0; j < arr.length - i - 1; j++) {
        if (arr[j] > arr[j + 1]) {
          int fixed = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = fixed;
        }
      }
    }
    System.out.print("Sorted array asecnding: ");
    for (int num : arr) {
      System.out.print(num + " ");
    }

    // Sorting array descending

    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr.length - i - 1; j++) {
        if (arr[j] < arr[j + 1]) {
          int fixed = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = fixed;
        }
      }
    }
    System.out.println();

    System.out.print("Sorted array descending: ");
    for (int num : arr) {
      System.out.print(num + " ");
    }
    System.out.println();

    // Dsiplay all the sum in the array
    int total = 0;
    for (int i = 0; i < arr.length; i++) {
      total += arr[i];
    }
    System.out.println("The sum of all the elements in the array: " + total);

    // Display the maximum number in the array

    int max = 0;

    // Compare each then replace if ther is higher number until the condition is not
    // met
    for (int num : arr) {
      if (num > max) {
        max = num;
      }
    }
    System.out.println("The maximum number in the array is: " + max);
  }
}
