/*
Write a method that receives two numbers and an operator, calculates the result and returns it.
You will be given three lines of input.
The first will be the first number, the second one will be the operator and the last one will be the second number.
The possible operators are: / * + -
Print the result rounded up to the second decimal point.
 */

// Judge ready

package _04_Methods_lab;

import java.text.DecimalFormat;
import java.util.Scanner;

public class _11_Exercise
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
//        System.out.print("Enter first number: ");
        double firstNumber = Double.parseDouble(s.nextLine());
//        System.out.print("Enter operator: ");
        String operator = s.nextLine();
//        System.out.print("Enter second number: ");
        double secondNumber = Double.parseDouble(s.nextLine());
        double result = calculateResult(firstNumber, operator, secondNumber);
        System.out.println(new DecimalFormat("0.##").format(result));
    }

    private static double calculateResult(double firstNumber, String operator, Double secondNumber)
    {
        double result = 0;

        switch (operator)
        {
            case "/":
                result = firstNumber / secondNumber;
                break;
            case "*":
                result = firstNumber * secondNumber;
                break;
            case "+":
                result = firstNumber + secondNumber;
                break;
            case "-":
                result = firstNumber - secondNumber;
                break;
        }

        return result;
    }
}
