/*
You will receive 3 integers.
Write a method sum to get the sum of the first two integers and subtract method that subtracts the third integer from the result from the sum method.
 */

// Judge ready

package _04_Methods_Exercises;

import java.util.Scanner;

public class _05_Exercise
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
//        System.out.print("Enter first integer: ");
        int a = Integer.parseInt(s.nextLine());
//        System.out.print("Enter second integer: ");
        int b = Integer.parseInt(s.nextLine());
//        System.out.print("Enter third integer: ");
        int c = Integer.parseInt(s.nextLine());

        int sum = sum(a, b);
        int result = subtract(sum, c);

        System.out.print(result);

    }

    private static int sum(int a, int b)
    {
        return a + b;
    }

    private static int subtract(int sum, int c)
    {
        return sum - c;
    }
}
