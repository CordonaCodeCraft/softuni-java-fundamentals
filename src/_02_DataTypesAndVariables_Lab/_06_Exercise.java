/*
Write a program that reads 3 lines of input.
On each line you get a single character.
Combine all the characters into one string and print it on the console.
 */

// Judge ready

package _02_DataTypesAndVariables_Lab;

import java.util.Scanner;

public class _06_Exercise {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//        System.out.print("Въведи 1 знак: ");
        char a = s.nextLine().charAt(0);
//        System.out.print("Въведи 2 знак: ");
        char b = s.nextLine().charAt(0);
//        System.out.print("Въведи 3 знак: ");
        char c = s.nextLine().charAt(0);
        System.out.printf("%c%c%c", a, b, c);
    }
}
