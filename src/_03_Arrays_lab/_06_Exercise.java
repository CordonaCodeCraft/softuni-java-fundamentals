/*
Read two arrays and print on the console whether they are identical or not.
Arrays are identical if their elements are equal.
If the arrays are identical find the sum of the first one and print on the console following message:
"Arrays are identical. Sum: {sum}",
otherwise find the first index where the arrays differ and print on the console following message:
"Arrays are not identical. Found difference at {index} index."
 */

// Judge ready

package _03_Arrays_lab;

import java.util.Scanner;

public class _06_Exercise {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//        System.out.print("Enter first array of strings: ");
        String[] stringA = s.nextLine().split(" ");
//        System.out.print("Enter second array of strings: ");
        String[] stringB = s.nextLine().split(" ");
        int length = stringA.length;
        int[] vectorA = new int[length];
        int[] vectorB = new int[length];
        int i = 0;
        int sum = 0;
        boolean identical = true;
        for (i = 0; i < length; i++) {
            vectorA[i] = Integer.parseInt(stringA[i]);
            vectorB[i] = Integer.parseInt(stringB[i]);
            if (vectorA[i] == vectorB[i]) {
                sum += vectorA[i];
            } else {
                identical = false;
                break;
            }
        }
        if (identical) {
            System.out.printf("Arrays are identical. Sum: %d", sum);

        } else {
            System.out.printf("Arrays are not identical. Found difference at %d index.", i);
        }
    }
}
