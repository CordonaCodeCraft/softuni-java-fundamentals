/*
Read n numbers and print them in reverse order.
 */

// Judge ready

package _03_Arrays_lab;

import java.util.Scanner;

public class _02_Exercise {
    public static void main(String[] args) {
//      Solution with initializing the array with for cycle
        Scanner s = new Scanner(System.in);
//        System.out.print("Въведи брой елементи: ");
        int n = Integer.parseInt(s.nextLine());
        int[] vector = new int[n];
        for (int i = 0; i < vector.length; i++) {
//            System.out.printf("Въведи число в елемент [%d]: ", i);
            vector[i] = Integer.parseInt(s.nextLine());
        }
        for (int i = vector.length - 1; i >= 0; i--) {
            System.out.printf("%d ", vector[i]);
        }
    }
}




