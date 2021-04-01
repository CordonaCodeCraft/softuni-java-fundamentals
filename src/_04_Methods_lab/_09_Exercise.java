/*
You are given two values of the same type as input.
The values can be of type int, char of String.
Create a method getMax() that returns the greater of the two values:
 */

// Judge ready

package _04_Methods_lab;

import java.util.Scanner;

public class _09_Exercise
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        String inputType = s.nextLine();

        switch (inputType)
        {
            case "int":
                int firstInt = Integer.parseInt(s.nextLine());
                int secondInt = Integer.parseInt(s.nextLine());
                int bestInt = getMax(firstInt, secondInt);
                System.out.println(bestInt);
                break;
            case "char":
                char firstChar = s.nextLine().charAt(0);
                char secondChar = s.nextLine().charAt(0);
                char bestChar = getMax(firstChar,secondChar);
                System.out.println(bestChar);
                break;
            case "string":
                String firstString = s.nextLine();
                String secondString = s.nextLine();
                String bestString = getMax(firstString,secondString);
                System.out.println(bestString);
                break;
        }

    }

    private static int getMax(int firstInt, int secondInt)
    {
        int result = firstInt;

        if (secondInt > firstInt)
        {
            result = secondInt;
        }

        return result;
    }

    private static char getMax(char firstChar, char secondChar)
    {
        char result = firstChar;

        if (secondChar > firstChar)
        {
            result = secondChar;
        }
        return result;

    }

    private static String getMax(String firstString, String secondString)
    {
        String result = firstString;

        if (secondString.compareTo(firstString) > 0)
        {
            result = secondString;
        }

        return result;
    }
}
