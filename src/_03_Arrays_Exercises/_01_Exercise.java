/*
You will be given a count of wagons in a train n.
On the next n lines, you will receive how many people are going to get on that wagon.
At the end print the whole train and after that the sum of the people in the train.
 */

// Judge ready

package _03_Arrays_Exercises;

import java.util.Scanner;

public class _01_Exercise {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//        System.out.print("Enter number of positions: ");
        String input = s.nextLine();
        int n = Integer.parseInt(input);
        int[] vector = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
//            System.out.print("Enter number of passengers: ");
            int p = Integer.parseInt(s.nextLine());
            vector[i] = p;
            sum += vector[i];
        }
        for (int pCount : vector) {
            System.out.printf("%d ", pCount);
        }
        System.out.println();
        System.out.printf("%d",sum);
    }
}
