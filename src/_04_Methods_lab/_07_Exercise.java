/*
Write a method that receives a string and a repeat count n (integer).
The method should return a new string (the old one repeated n times).
 */

// Judge ready

package _04_Methods_lab;

import java.util.Scanner;

public class _07_Exercise
{
    public static void main(String[] args)
    {

        Scanner s = new Scanner(System.in);
//        System.out.print("Enter random string: ");
        String input = s.nextLine();
//        System.out.print("Enter number of repetitions: ");
        int count = Integer.parseInt(s.nextLine());
        String result = repeatString(count, input);
        System.out.println(result);


    }

    private static String repeatString(int count, String input)
    {
        StringBuilder result = new StringBuilder(input);
        for (int i = 1; i < count; i++)
        {
            result.append(input);
        }
        return result.toString();
    }
}
