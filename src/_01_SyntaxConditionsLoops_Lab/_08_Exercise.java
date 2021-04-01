/*
Write a program, which prints all the numbers from 1 to 100, which are divisible by 3.
You have to use a single for loop.
The program should not receive input.
 */

// Judge ready

package _01_SyntaxConditionsLoops_Lab;

public class _08_Exercise {
    public static void main(String[] args) {
        for (int i = 3; i <= 100; i += 3) {
            System.out.println(i);
        }
    }
}

