/*
Write a program to find all the top integers in an array.
A top integer is an integer which is bigger than all the elements to its right.
 */

// TODO: 25.03.2020 г. Judge not ready 80 / 100

package _03_Arrays_Exercises;

import java.util.Scanner;

public class _05_Exercise {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//        System.out.print("Enter string of integers: ");
        String[] input = s.nextLine().split(" ");
        int[] vector = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            vector[i] = Integer.parseInt(input[i]);
        }
        for (int i = 0; i < input.length; i++) {
            for (int j = i + 1; j < input.length; j++) {
                int counter = 0;
                if (vector[i] < vector[j]) {
                    break;
                } else {
                    counter++;
                }
                if (counter >= input.length - j) {
                    System.out.printf("%d ", vector[i]);
                    break;
                }
            }
            if (i == input.length - 1) {
                System.out.printf("%d ", vector[i]);
            }
        }
    }
}