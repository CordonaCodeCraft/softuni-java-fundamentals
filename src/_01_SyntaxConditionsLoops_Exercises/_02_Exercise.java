
// TODO: 23.03.2020 г. Finalize the task

package _01_SyntaxConditionsLoops_Exercises;

import java.util.Scanner;

public class _02_Exercise {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter integer: ");
        int input = Integer.parseInt(s.nextLine());
        boolean divisible = input % 2 == 0 || input % 3 == 0 || input % 6 == 0 || input % 7 == 0 && input % 10 == 0;
        if (!divisible) {
            System.out.println("Not divisible");
        } else {
            if (input % 2 == 0) {
                System.out.println("The number is divisible by 10");
            } else if (input % 2 == 0 && input % 3 == 0) {
                System.out.println("The number is divisible by 6");
            } else if (input % 3 == 0) {
                System.out.println("The number is divisible by 3");
            } else if (input % 7 == 0) {
                System.out.println("The number is divisible by 7");
            }
        }
    }
}
