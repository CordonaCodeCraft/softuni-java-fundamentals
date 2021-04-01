/*
Write a program that finds the longest sequence of equal elements in an array of integers.
If several longest sequences exist, print the leftmost one.
 */

// Judge ready

package _03_Arrays_Exercises;

import java.util.Scanner;

public class _07_Exercise {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//        System.out.print("Enter string of integers: ");
        String[] input = s.nextLine().split(" ");
        int[] vector = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            vector[i] = Integer.parseInt(input[i]);
        }
        int length = 1;
        int bestLength = 0;
        int bestPosition = 0;

        for (int i = 1; i < vector.length; i++) {
            if (vector[i] == vector[i - 1]) {
                length++;
                if (i == vector.length - 1 && length > bestLength) {
                    bestLength = length;
                    bestPosition = i - length + 1;
                }
            } else {
                if (length <= bestLength) {
                    length = 1;
                } else if (length > bestLength) {
                    bestLength = length;
                    bestPosition = i - length;
                    length = 1;
                }
            }
        }

        if (bestLength == 0) {
            for (int i = 0; i < length; i++) {
                System.out.print(vector[bestPosition + i] + " ");
            }
        } else {
            for (int i = 0; i < bestLength; i++) {
                System.out.print(vector[bestPosition + i] + " ");
            }
        }
    }
}







