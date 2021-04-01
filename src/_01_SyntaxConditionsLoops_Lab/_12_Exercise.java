/*
Take as an input an even number and print its absolute value.
If the number is odd, print "Please write an even number." and continue reading numbers.
 */

//Judge ready

package _01_SyntaxConditionsLoops_Lab;

import java.util.Scanner;

public class _12_Exercise {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//        System.out.print("Enter an even number: ");
        int input = Integer.parseInt(s.nextLine());
        while (true) {
            if (input % 2 != 0) {
                System.out.println("Please write an even number.");
                input = Integer.parseInt(s.nextLine());
            } else {
                System.out.printf("The number is: %d",Math.abs(input));
                break;
            }
        }
    }
}
