/*
Write program to enter n numbers and calculate and print their exact sum (without rounding).
 */

// Judge ready

package _02_DataTypesAndVariables_Lab;

import java.math.BigDecimal;
import java.util.Scanner;

public class _03_Exercise {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//        System.out.print("Въведи брой итерации: ");
        int a = Integer.parseInt(s.nextLine());
        BigDecimal sum = new BigDecimal(0);
        for (int i = 0; i < a; i++) {
//            System.out.print("Въведи число: ");
            BigDecimal b = new BigDecimal(s.nextLine());
            sum = sum.add(b);
        }
        System.out.println(sum);
    }
}
