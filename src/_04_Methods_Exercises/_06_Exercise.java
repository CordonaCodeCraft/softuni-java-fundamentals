/*
You will receive a single string.
Write a method that prints the middle character.
If the length of the string is even, there are two middle characters.
 */

// Judge ready

package _04_Methods_Exercises;

import java.util.Scanner;

public class _06_Exercise
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
//        System.out.print("Enter random string: ");
        String[] input = s.nextLine().split("");
        printMiddleCharacter(input);
    }

    private static void printMiddleCharacter(String[] input)
    {
        if (input.length % 2 == 0)
        {
            System.out.println(input[(input.length/2)-1] + input[input.length/2]);
        }
        else
        {
            System.out.println(input[((input.length-1)/2)]);
        }
    }
}
