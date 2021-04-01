/*
Write a method that receives two charters and prints on a single line all the characters in between them according to ASCII.
 */

// Judge ready

package _04_Methods_Exercises;

import java.util.Scanner;

public class _03_Exercise
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
//        System.out.print("Enter first character: ");
        String firstCharacter = s.nextLine();
//        System.out.print("Enter second character: ");
        String secondCharacter = s.nextLine();
        int first = firstCharacter.charAt(0);
        int second = secondCharacter.charAt(0);

        printCharacters(first, second);

    }

    private static void printCharacters(int first, int second)
    {
        if (first < second)
        {
            for (int i = first + 1; i < second; i++)
            {
                char character = (char) i;
                System.out.print(character + " ");
            }
        } else
        {
            for (int i = second + 1; i < first; i++)
            {
                char character = (char) i;
                System.out.print(character + " ");
            } 
        }


    }
}
