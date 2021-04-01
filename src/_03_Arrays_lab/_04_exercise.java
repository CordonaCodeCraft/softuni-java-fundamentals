/*
Write a program to read an array of strings, reverse it and print its elements.
The input consists of a sequence of space separated strings.
Print the output on a single line (space separated).
*/

// Judge ready

package _03_Arrays_lab;

import java.util.Scanner;

public class _04_exercise {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String input = s.nextLine();
        String[] split = input.split(" ");
        for (int i = 0; i < split.length / 2; i++) {
            String temp = split[i];
            split[i] = split[split.length - 1 - i];
            split[split.length - 1 - i] = temp;
        }
        System.out.println(String.join(" ", split));
    }
}

    // Personal working solution with two strings

    /*
    Scanner s = new Scanner(System.in);
    // System.out.print("Enter number of elements: ");
    String input = s.nextLine();
    String[] split = input.split(" ");
    String[] reversed = new String[split.length];
    int k = 0;
    for (int i = split.length - 1; i >= 0; i--) {
    reversed[i] = split[k];
    k++;
    }
    System.out.println(String.join(" ", reversed));
        */
