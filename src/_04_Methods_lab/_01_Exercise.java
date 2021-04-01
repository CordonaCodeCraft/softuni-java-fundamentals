/*
Create a method that prints the sign of an integer number.
 */

// Judge ready

package _04_Methods_lab;

import java.util.Scanner;

public class _01_Exercise {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//        System.out.println("Enter an integer: ");
        int input = Integer.parseInt(s.nextLine());
        printIntegerType(input);

    }

    private static void printIntegerType(int digit) {
      if (digit > 0) {
          System.out.printf("The number %d is positive.", digit);
      } else if (digit < 0) {
          System.out.printf("The number %d is negative.", digit);
      } else {
          System.out.printf("The number %d is zero.", digit);
      }
    }

}
