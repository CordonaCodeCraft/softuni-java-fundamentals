/*
Write a program that receives a single string and on the first line prints all the digits, on the second – all the letters, and on the third – all the other characters.
There will always be at least one digit, one letter and one other characters.
 */

// Judge ready

// Judge ready

package _05_Text_processing.lab;

import java.util.Scanner;

public class _05_Exercise {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//        System.out.print("Enter string of random characters: ");
        String input = s.nextLine();
        System.out.println(extractDigits(input));
        System.out.println(extractLetters(input));
        System.out.println(extractCharacters(input));

    }

    private static String extractCharacters(String input) {
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < input.length() ; i++) {
            if (!Character.isLetterOrDigit(input.charAt(i))) {
                builder.append(input.charAt(i));
            }
        }

        return builder.toString();
    }

    private static String extractLetters(String input) {
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < input.length() ; i++) {
            if (Character.isLetter(input.charAt(i))) {
                builder.append(input.charAt(i));
            }
        }

        return builder.toString();
    }

    private static String extractDigits(String input) {
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < input.length() ; i++) {
            if (Character.isDigit(input.charAt(i))) {
                 builder.append(input.charAt(i));
            }
        }

        return builder.toString();
    }
}
