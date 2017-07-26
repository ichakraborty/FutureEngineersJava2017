/*
ArrayScanner.java
*/

import java.util.Scanner;

public class ArrayScanner {
  public static void main(String[] args) {
    int[] array = new int[5];

    Scanner sc = new Scanner(System.in);

    for (int i = 0; i < 5; i++)
    {
      System.out.println("Please enter a number");
      String indices = sc.nextLine();
      int number  = Integer.parseInt(indices);
      array[i] = number;

      System.out.println("Index #" + i + " is " + array[i]);
    }
  }
}
