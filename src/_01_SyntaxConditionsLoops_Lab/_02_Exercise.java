/*
Write a program, which takes as an input a grade and prints "Passed!" if the grade is equal or more than 3.00.
 */

//Judge ready

package _01_SyntaxConditionsLoops_Lab;

import java.util.Scanner;

public class _02_Exercise {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double i = s.nextDouble();
        if (i >= 3) {
            System.out.println("Passed!");
        }
    }
}
