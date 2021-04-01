/*
Write a program, which prints all unique pairs in an array of integers whose sum is equal to a given number.
 */

// Judge ready

package _03_Arrays_Exercises;

import java.util.Scanner;

public class _08_Exercise {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//        System.out.print("Enter string of integers: ");
        String[] input = s.nextLine().split(" ");
//        System.out.print("Enter a number: ");
        int n = Integer.parseInt(s.nextLine());

        int[] vector = new int[input.length];

        for (int i = 0; i < input.length; i++) {
            vector[i] = Integer.parseInt(input[i]);
        }

        for (int i = 0; i < vector.length; i++) {
            for (int j = i + 1; j < vector.length; j++) {
                if (vector[i] + vector[j] == n) {
                    System.out.printf("%d %d%n", vector[i], vector[j]);
                }
            }
        }
    }
}
