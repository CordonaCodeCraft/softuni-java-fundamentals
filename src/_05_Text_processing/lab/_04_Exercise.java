/*
Write a program that takes a text and a string of banned words.
All words included in the ban list should be replaced with asterisks "*", equal to the word's length.
The entries in the ban list will be separated by a comma and space ", ".
The ban list should be entered on the first input line and the text on the second input line.

 */

// Judge ready

// Judge ready

package _05_Text_processing.lab;

import java.util.Scanner;

public class _04_Exercise {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//        System.out.print("Enter list of banned words: ");
        String bannedWords = s.nextLine();
//        System.out.print("Enter text: ");
        String text = s.nextLine();
        String[] bannedArray = bannedWords.split("[, ]+");
        String censured = removeBannedWords(text, bannedArray);
        System.out.println(censured);
    }

    private static String removeBannedWords(String text, String[] bannedArray) {
        int arrayLength = bannedArray.length;

        for (String bannedWord : bannedArray) {
            int bannedLength = bannedWord.length();
            String censuredWord = maskWord(bannedLength);

            while (text.contains(bannedWord)) {
                text = text.replace(bannedWord, censuredWord);
            }
        }
        return text;
    }

    private static String maskWord(int stringLength) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < stringLength; i++) {
            builder.append("*");
        }
        return builder.toString();
    }
}
