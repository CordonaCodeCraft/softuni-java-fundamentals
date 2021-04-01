/*
Write a program that calculates the difference between the sum of the even and the sum of the odd numbers in an array.
 */

// Judge ready

package _03_Arrays_lab;

import java.util.Scanner;

public class _05_Exercise {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//        System.out.print("Enter a string of numbers: ");
        String[] input = s.nextLine().split(" ");
        int[] vector = new int[input.length];
        int sumEven = 0;
        int sumOdd = 0;
        for (int i = 0; i < input.length; i++) {
            vector[i] = Integer.parseInt(input[i]);
            if (vector[i] % 2 == 0) {
                sumEven += vector[i];
            } else {
                sumOdd += vector[i];
            }
        }
        System.out.println(sumEven - sumOdd);
    }
}
