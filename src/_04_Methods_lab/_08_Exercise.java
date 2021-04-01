/*
Create a method that calculates and returns the value of a number raised to a given power.
 */

package _04_Methods_lab;

import java.text.DecimalFormat;
import java.util.Scanner;

public class _08_Exercise
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
//        System.out.print("Enter floating point number: ");
        double input = Double.parseDouble(s.nextLine());
//        System.out.print("Enter exponent: ");
        int exponent = Integer.parseInt(s.nextLine());
        double result = calculateByPower(input, exponent);

        System.out.println(new DecimalFormat("0.####").format(result));
    }

    private static double calculateByPower(double input, int exponent)
    {
        double result = 1;

        for (int i = 0; i < exponent; i++)
        {
            result = result * input;
        }

        return result;
    }
}
