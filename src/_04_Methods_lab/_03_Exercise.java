/*
Create a method for printing triangles as shown below:
 */

// Judge ready

package _04_Methods_lab;

import java.util.Scanner;

public class _03_Exercise
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
//        System.out.print("Enter integer: ");
        int maxRowCount = Integer.parseInt(s.nextLine());

        printTriangle(maxRowCount);
    }

    private static void  printTriangle(int maxRowCount)
    {
        for (int currentNumber = 1; currentNumber <= maxRowCount; currentNumber++)
        {
            printLine(currentNumber);
        }

        for (int currentNumber = maxRowCount - 1; currentNumber >= 1; currentNumber--)
        {
            printLine(currentNumber);
        }
    }

    private static void printLine(int currentNumber)
    {
        for (int printedNumber = 1; printedNumber <= currentNumber; printedNumber++)
        {
            System.out.printf("%d ", printedNumber);
        }
        System.out.println();
    }

}
