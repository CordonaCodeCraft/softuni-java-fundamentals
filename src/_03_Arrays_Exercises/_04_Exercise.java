/*
Write a program that receives an array and number of rotations you have to perform (first element goes at the end) Print the resulting array.
 */

// Judge ready

package _03_Arrays_Exercises;

import java.util.Scanner;

public class _04_Exercise {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
// System.out.print("Enter string of numbers: ");
        String[] input = s.nextLine().split(" ");
// System.out.print("Enter number of rotations: ");
        int n = Integer.parseInt(s.nextLine());
        int[] vector = new int[input.length];
        for (int v = 0; v < input.length; v++) {
            vector[v] = Integer.parseInt(input[v]);
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < input.length - 1; j++) {
                int temp = vector[j];
                vector[j] = vector[j + 1];
                vector[j + 1] = temp;
            }
        }
        for (int output : vector) {
            System.out.print(output + " ");
        }
    }
}