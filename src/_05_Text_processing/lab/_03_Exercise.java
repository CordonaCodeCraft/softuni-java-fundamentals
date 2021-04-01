/*
On the first line you will receive a string.
On the second line you will receive a second string.
Write a program that removes all of the occurrences of the first string in the second until there is no match.
At the end print the remaining string.
 */

// Judge ready

package _05_Text_processing.lab;

import java.util.Scanner;

public class _03_Exercise {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//        System.out.print("Enter target word: ");
        String targetWord = s.nextLine();
//        System.out.print("Enter string of words: ");
        String sentence = s.nextLine();

        while (sentence.contains(targetWord)) {
            sentence = sentence.replace(targetWord, "");
        }
        System.out.println(sentence);
    }
}
