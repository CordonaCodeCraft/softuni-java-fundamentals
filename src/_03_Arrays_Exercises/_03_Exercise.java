/*
Write a program which creates 2 arrays. You will be given an integer n.
On the next n lines, you get 2 integers. Form 2 arrays as shown below.
 */

// Judge ready

package _03_Arrays_Exercises;

import java.util.Scanner;

public class _03_Exercise {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//        System.out.print("Enter number of iterations: ");
        int n = Integer.parseInt(s.nextLine());
        int[] vector1 = new int[n];
        int[] vector2 = new int[n];
        for (int i = 0; i < n; i++) {
//            System.out.print("Enter to digits: ");
            String[] input = s.nextLine().split(" ");
            if (i % 2 == 0) {
                vector1[i] = Integer.parseInt(input[0]);
                vector2[i] = Integer.parseInt(input[1]);
            } else {
                vector1[i] = Integer.parseInt(input[1]);
                vector2[i] = Integer.parseInt(input[0]);
            }
        }
        for (int v1 : vector1) {
            System.out.print(v1 + " ");
        }
        System.out.println();
        for (int v2 : vector2) {
            System.out.print(v2 + " ");
        }
    }
}
