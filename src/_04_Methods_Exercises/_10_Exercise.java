package _04_Methods_Exercises;

import java.util.Scanner;

public class  _10_Exercise
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
//        System.out.print("Enter an integer: ");
        int input = Integer.parseInt(s.nextLine());

        for (int i = 1; i < input; i++)
        {
            String intToString = Integer.toString(i);
            int[] arrayOfInts = convertStringToArrayOfIntegers(intToString);
            boolean isTopNumber = validateTopNumber(arrayOfInts);

            if (isTopNumber)
            {
                System.out.println(i);
            }
        }
    }

    private static boolean validateTopNumber(int[] vector)
    {
        boolean sumIsDivisible = confirmSumIsDivisibleByEight(vector);
        boolean hasOddNumber = confirmHasOddNumber(vector);
        boolean isTopNumber = false;

        if (sumIsDivisible && hasOddNumber)
        {
            isTopNumber = true;
        }

        return isTopNumber;
    }

    private static boolean confirmSumIsDivisibleByEight(int[] vector)
    {
        boolean sumIsDivisible = false;

        int sum = 0;

        for (int integer : vector)
        {
            sum += integer;
        }

        if (sum % 8 == 0)
        {
            sumIsDivisible = true;
        }
        return sumIsDivisible;
    }

    private static boolean confirmHasOddNumber(int[] vector)
    {
        boolean hasOddNumber = false;

        for (int integer : vector)
        {
            if (integer % 2 != 0)
            {
                hasOddNumber = true;
                break;
            }
        }

        return hasOddNumber;
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


