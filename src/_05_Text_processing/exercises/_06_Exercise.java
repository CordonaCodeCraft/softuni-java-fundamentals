/*
Write a program that reads a string from the console and replaces any sequence of the same letters with a single corresponding letter.
 */

// Judge ready

package _05_Text_processing.exercises;

import java.util.Scanner;

public class _06_Exercise {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//        System.out.print("Enter random string: ");
        String input = s.nextLine();
        for (int i = 0; i < input.length(); i++) {
            String match = Character.toString(input.charAt(i)) + Character.toString(input.charAt(i));
            while (input.contains(match)) {
                input = input.replace(match, Character.toString(input.charAt(i)));
            }
        }
        System.out.println(input);
    }
}
