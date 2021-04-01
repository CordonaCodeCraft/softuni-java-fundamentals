/*
  Write a program that returns an encrypted version of the same text.
  Encrypt the text by shifting each character with three positions forward.
  For example A would be replaced by D, B would become E, and so on.
  Print the encrypted text.
 */

// Judge ready

package _05_Text_processing.exercises;

import java.util.Scanner;

public class _04_Exercise {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//        System.out.print("Enter a text: ");
        String input = s.nextLine();
        System.out.println(encryptInput(input));
    }

    private static String encryptInput(String input) {
        StringBuilder codeBuilder = new StringBuilder();

        for (int index = 0; index < input.length(); index++) {
            char encryptedCharacter = (char) (input.charAt(index) + 3);
            codeBuilder.append(encryptedCharacter);
        }

        return codeBuilder.toString();
    }
}
