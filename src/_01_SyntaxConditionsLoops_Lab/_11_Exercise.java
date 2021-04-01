/*
Rewrite you program so it can receive the multiplier from the console.
Print the table from the given multiplier to 10.
If the given multiplier is more than 10 - print only one row with the integer, the given multiplier and the product.
See the examples below for more information.
 */

 // Judge ready

package _01_SyntaxConditionsLoops_Lab;

import java.util.Scanner;

public class _11_Exercise {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//        System.out.print("Enter an integer: ");
        int integer = Integer.parseInt(s.nextLine());
//        System.out.print("Enter an multiplier: ");
        int multiplier = Integer.parseInt(s.nextLine());
        if (multiplier > 10) {
            System.out.printf("%d X %d = %d", integer, multiplier, integer * multiplier);
        } else {
            for (int i = multiplier; i <= 10; i++) {
                int result = integer * i;
                System.out.printf("%d X %d = %d%n", integer, i, result);
            }
        }
    }
}