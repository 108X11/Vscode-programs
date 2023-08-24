package Simpleprogs;

import java.util.Scanner;

public class Arrayuser {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int num, i, total = 0;
    System.out.print("Enter how many numbers you want to add: ");
    num = sc.nextInt();

    int arr[] = new int[num];

    for (i = 0; i < arr.length; i++) {
      System.out.print("Enter num " + i + " ");
      arr[i] = sc.nextInt();
      total += arr[i];
    }
    System.out.println("The total is " + total);
  }
}
