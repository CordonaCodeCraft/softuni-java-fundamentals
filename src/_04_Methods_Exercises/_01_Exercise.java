/*
Write a method to print the smallest of three integer numbers.
Use appropriate name for the method.
 */

// Judge ready

package _04_Methods_Exercises;

import java.util.Scanner;

public class _01_Exercise
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);

        int[] input = new int[3];

        for (int i = 1; i <= input.length; i++)
        {
            System.out.printf("Enter %d integer: ", i);
            input[i - 1] = Integer.parseInt(s.nextLine());
        }

        int smallestInt = findSmallestInteger(input);

        System.out.println(smallestInt);

    }

    private static int findSmallestInteger(int[] input)
    {
        int smallestInteger = Integer.MAX_VALUE;

        for (int currentInteger : input)
        {
            if (currentInteger < smallestInteger)
            {
                smallestInteger = currentInteger;
            }
        }
        return smallestInteger;
    }
}



