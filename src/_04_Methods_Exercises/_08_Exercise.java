/*
   Read two integer numbers.
   Calculate factorial of each number.
   Divide the first result by the second and print the division formatted to the second decimal point.
 */

// Judge ready

package _04_Methods_Exercises;

import java.util.Scanner;

public class _08_Exercise
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
//        System.out.print("Enter first integer: ");
        double firstInt = Integer.parseInt(s.nextLine());
//        System.out.print("Enter second integer: ");
        double secondInt = Integer.parseInt(s.nextLine());

        double firstFactorial = calculateFactorial(firstInt);
        double secondFactorial = calculateFactorial(secondInt);
        double result = firstFactorial / secondFactorial;

        System.out.printf("%.2f", result);
    }

    private static double calculateFactorial(double input)
    {
        double factorial = 1;

        for (int i = 1; i <= input; i++)
        {
            factorial *= i;
        }

        return factorial;
    }

}
