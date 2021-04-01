/*
Write a program that checks if a given password is valid.
Password rules are:
•	6 – 10 characters (inclusive);
•	Consists only of letters and digits;
•	Have at least 2 digits.
If a password is valid, print "Password is valid".
If it is not valid, for every unfulfilled rule print a message:
•	"Password must be between 6 and 10 characters";
•	"Password must consist only of letters and digits";
•	"Password must have at least 2 digits".
 */

// Judge ready

package _04_Methods_Exercises;

import java.util.Scanner;

public class _04_Exercise
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
//        System.out.print("Enter a password: ");
        String[] password = s.nextLine().split("");

        boolean enoughLength = confirmLength(password);
        boolean noChars = confirmWithoutChars(password);
        boolean enoughDigits = confirmEnoughDigits(password);

        if (enoughLength && noChars && enoughDigits)
        {
            System.out.println("Password is valid");
        }

    }

    private static boolean confirmLength(String[] password)
    {
        boolean enoughLength = true;

        if (password.length < 6 || password.length > 10)
        {
            enoughLength = false;
        }

        if (!enoughLength)
        {
            System.out.println("Password must be between 6 and 10 characters");
        }

        return enoughLength;
    }

    private static boolean confirmWithoutChars(String[] password)
    {
        boolean noChars = true;

        for (String character : password)
        {
            if (!Character.isDigit(character.charAt(0)) && !Character.isLetter(character.charAt(0)))
            {
                noChars = false;
                break;
            }
        }

        if (!noChars)
        {
            System.out.println("Password must consist only of letters and digits");
        }

        return noChars;
    }

    private static boolean confirmEnoughDigits(String[] password)
    {
        boolean enoughDigits = true;
        int countDigits = 0;

        for (String character : password)
        {
            if (countDigits >= 2)
            {
                break;
            } else if (Character.isDigit(character.charAt(0)))
            {
                countDigits++;
            }
        }

        if (countDigits < 2)
        {
            enoughDigits = false;
        }

        if (!enoughDigits)
        {
            System.out.println("Password must have at least 2 digits");
        }

        return enoughDigits;
    }


}
