/*
Write a program to read an array of integers and condense them by summing adjacent couples of elements until a single integer is obtained.
For example, if we have 3 elements {2, 10, 3},
we sum the first two and the second two elements and obtain {2+10, 10+3} = {12, 13},
then we sum again all adjacent elements and obtain {12+13} = {25}.
 */

// Judge ready

package _03_Arrays_lab;

import java.util.Scanner;

public class _07_Exercise {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//        System.out.print("Enter a string of digits: ");
        String[] input = s.nextLine().split(" ");
        int[] vector = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            vector[i] = Integer.parseInt(input[i]);
        }
        int tempLength = input.length - 1;
        while (tempLength >= 1) {
            for (int i = 0; i < tempLength; i++) {
                int k = vector[i] + vector[i + 1];
                vector[i] = k;
            }
            tempLength -= 1;
        }

        System.out.println(vector[0]);
    }
}
