package _04_Methods_Exercises;

import java.util.Scanner;

public class _09_Exercise
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);

        while (true)
        {
//            System.out.print("Enter an String integer or \"END\": ");
            String input = s.nextLine();

            if (!input.equals("END"))
            {
                int[] vector = convertStringToArrayOfIntegers(input);

                boolean isPalindrome = validatePalindrome(vector);

                System.out.println(isPalindrome);
            } else
            {
                break;
            }
        }
    }

    private static boolean validatePalindrome(int[] vector)
    {
        int totalMatches = 0;
        int increment = 1;
        boolean isPalindrome = true;

        if (vector.length % 2 == 0)
        {
            for (int i = 0; i < vector.length / 2; i++)
            {
                if (vector[i] == vector[vector.length - increment])
                {
                    totalMatches++;
                    increment++;
                }
            }
        } else
        {
            for (int i = 0; i < (vector.length - 1) / 2; i++)
            {
                if (vector[i] == vector[vector.length - increment])
                {
                    totalMatches++;
                    increment++;
                }
            }

        }

        if (totalMatches != vector.length / 2)
        {
            isPalindrome = false;
        }

        return isPalindrome;
    }

    private static int[] convertStringToArrayOfIntegers(String input)
    {
        String[] arrayOfChars = input.split("");
        int[] vector = new int[arrayOfChars.length];

        for (int i = 0; i < vector.length; i++)
        {
            vector[i] = Integer.parseInt(arrayOfChars[i]);
        }
        return vector;
    }
}
