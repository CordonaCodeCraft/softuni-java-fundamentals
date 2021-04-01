/*
Write a method that receives a single integer n and prints nxn matrix with that number.
 */

// Judge ready

package _04_Methods_Exercises;

import java.util.Arrays;
import java.util.Scanner;

public class _07_Exercise
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
//        System.out.print("Enter base for the matrix: ");
        int n = Integer.parseInt(s.nextLine());
        buildMatrix(n);
    }

    private static void buildMatrix(int n)
    {
        int[] matrixLine = new int[n];

        Arrays.fill(matrixLine, n);

        for (int i = 0; i < n; i++)
        {
          for (int number : matrixLine)
          {
              System.out.print(number + " ");
          }
            System.out.println();
        }
    }
}
