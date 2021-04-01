/*
A number is special when its sum of digits is 5, 7 or 11.
Write a program to read an integer n and for all numbers in the range 1…n to print the number and if it is special or not (True / False).
 */

// Judge ready

package _02_DataTypesAndVariables_Lab;

import java.math.BigDecimal;
import java.util.Scanner;

public class _10_Exercise {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//        System.out.print("Въведи число: ");
        int n = Integer.parseInt(s.nextLine());
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            String integer = Integer.toString(i);
            int l = integer.length();
            for (int j = 0; j < l; j++) {
                int k = Character.getNumericValue(integer.charAt(j));
                sum += k;
            }
            if (sum == 5 || sum == 7 || sum == 11) {
                System.out.printf("%d -> True%n", i);
            } else {
                System.out.printf("%d -> False%n", i);
            }
            sum = 0;
        }
    }
}
