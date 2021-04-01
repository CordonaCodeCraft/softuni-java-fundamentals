/*
Read an array from the console and sum only the even numbers.
 */

// Judge ready

package _03_Arrays_lab;

import java.util.Scanner;

public class _03_Exercise {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//        System.out.print("Enter a string of numbers: ");
        String[] input = s.nextLine().split(" ");
        int[] vector = new int[input.length];
        int sumEven = 0;
        for (int i = 0; i < input.length; i++) {
            vector[i] = Integer.parseInt(input[i]);
            if (vector[i] % 2 == 0) {
                sumEven += vector[i];
            }
        }
        System.out.println(sumEven);
    }
}
