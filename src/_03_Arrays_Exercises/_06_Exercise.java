/*
Write a program that determines if there exists an element in the array such that the sum of the elements on its left is equal to the sum of the elements on its right.
If there are no elements to the left / right, their sum is considered to be 0.
Print the index that satisfies the required condition or “no” if there is no such index.
 */

// Judge ready

package _03_Arrays_Exercises;

import java.util.Scanner;

public class _06_Exercise
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
//        System.out.print("Enter string of integers: ");
        String[] input = s.nextLine().split(" ");
        int[] vector = new int[input.length];
        boolean noMatch = true;


        for (int i = 0; i < input.length; i++)
        {
            vector[i] = Integer.parseInt(input[i]);
        }

        for (int i = 0; i < input.length; i++)
        {
            int sumA = 0;
            int sumB = 0;

            for (int j = i + 1; j < input.length; j++)
            {
                sumA += vector[j];
            }

            for (int k = 0; k < (input.length) - (input.length - i); k++)
            {
                sumB += vector[k];
            }

            if (sumA == sumB)
            {
                System.out.printf("%d", i);
                noMatch = false;
            }
        }

        if (noMatch)
        {
            System.out.println("no");
        }
    }
}

