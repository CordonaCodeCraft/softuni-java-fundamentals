/*
Write a program that receives a string on the first line ("add", "multiply", "subtract", "divide") and on the next two lines receives two numbers.
Create four methods (for each calculation) and invoke the right one depending on the command.
The method should also print the result (needs to be void).
 */

// Judge ready

package _04_Methods_lab;

import java.util.Scanner;

public class _04_Exercise
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);

//        System.out.print("Enter a command: ");
        String command = s.nextLine();
//        System.out.print("Enter a first integer: ");
        int firstInt = Integer.parseInt(s.nextLine());
//        System.out.print("Enter a second integer: ");
        int secondInt = Integer.parseInt(s.nextLine());
        int result = 0;

        switch (command)
        {
            case "add":
                result = add(firstInt, secondInt);
                break;
            case "multiply":
                result = multiply(firstInt, secondInt);
                break;
            case "subtract":
                result = subtract(firstInt, secondInt);
                break;
            case "divide":
                result = divide(firstInt, secondInt);
                break;
        }

        System.out.println(result);
    }

    private static int divide(int firstInt, int secondInt)
    {
        return firstInt / secondInt;
    }

    private static int subtract(int firstInt, int secondInt)
    {
        return firstInt - secondInt;
    }

    private static int multiply(int firstInt, int secondInt)
    {
        return firstInt * secondInt;
    }

    private static int add(int firstInt, int secondInt)
    {
        return firstInt + secondInt;
    }

}
