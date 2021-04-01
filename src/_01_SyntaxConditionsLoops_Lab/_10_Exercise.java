/*
You will receive an integer as an input from the console.
Print the 10 times table for this integer.
See the examples below for more information.
 */

// Judge ready

package _01_SyntaxConditionsLoops_Lab;

import java.util.Scanner;

public class _10_Exercise {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//        System.out.print("Enter an integer: ");
        int input = Integer.parseInt(s.nextLine());
        for (int i = 1; i <= 10; i++) {
            int result = input * i;
            System.out.printf("%d X %d = %d%n", input, i, result);
        }
    }
}
