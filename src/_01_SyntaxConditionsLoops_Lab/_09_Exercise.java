/*
Write a program that prints the next n odd numbers (starting from 1) and on the last row prints the sum of them.
 */

 // Judge ready

package _01_SyntaxConditionsLoops_Lab;

import java.util.Scanner;

public class _09_Exercise {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//        System.out.print("Enter number of odd numbers to be printed on the console: ");
        int n = Integer.parseInt(s.nextLine());
        int k = 1;
        int counter = 0;
        int sum = 0;
        do {
            if (k % 2 != 0) {
                sum += k;
                counter++;
                System.out.println(k);
            }
            k++;
        } while (n > counter);
        System.out.printf("Sum: %d", sum);
    }
}
