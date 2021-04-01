/*
Write a program, which prints common elements in two arrays.
You have to compare the elements of the second array to the elements of the first.
 */

// Judge ready

package _03_Arrays_Exercises;

import java.util.Scanner;

public class _02_Exercise {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//        System.out.print("Enter first array of random strings: ");
        String[] inputA = s.nextLine().split(" ");
//        System.out.print("Enter second array of random strings: ");
        String[] inputB = s.nextLine().split(" ");
        int max = Math.max(inputA.length,inputB.length);
//        System.out.print(max);
        for (String sB : inputB) {
            for (String sA : inputA) {
                if (sA.equals(sB)) {
                    System.out.printf("%s ", sB);
                }
            }
        }
    }
}
