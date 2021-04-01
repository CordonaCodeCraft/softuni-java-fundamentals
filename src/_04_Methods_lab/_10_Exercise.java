/*
Create a program that reads an integer number and multiplies the sum of all its even digits by the sum of all its odd digits
 */

// Judge ready

package _04_Methods_lab;

import java.util.Scanner;

public class _10_Exercise
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
//        System.out.print("Enter an integer: ");
        int input = Integer.parseInt(s.nextLine());
        int result = multiplyEvensByOdds(input);
        System.out.println(result);
    }

    private static int multiplyEvensByOdds(int input)
    {
        int sumOfEvens = getSumOfEvens(input);
        int sumOfOdds = getSumOfOdds(input);

        return sumOfEvens * sumOfOdds;
    }

    private static int getSumOfEvens(int input)
    {
        int sumOfEvens = 0;

        if (input > 0)
        {
            while (input > 0)
            {
                if ((input % 10) % 2 == 0)
                {
                    sumOfEvens += input % 10;
                }
                input /= 10;
            }
        } else
        {
            while (input < 0)
            {
                if ((input % 10) % 2 == 0)
                {
                    sumOfEvens += input % 10;
                }
                input /= 10;
            }
        }
        return sumOfEvens;
    }

    private static int getSumOfOdds(int input)
    {
        int sumOfOdds = 0;

        if (input > 0)
        {
            while (input > 0)
            {
                if ((input % 10) % 2 != 0)
                {
                    sumOfOdds += input % 10;
                }
                input /= 10;
            }
        } else
        {
            while (input < 0)
            {
                if ((input % 10) % 2 != 0)
                {
                    sumOfOdds += input % 10;
                }
                input /= 10;
            }
        }
        return sumOfOdds;
    }

}
