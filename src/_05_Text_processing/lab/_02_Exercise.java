/*
Write a program that reads an array of strings.
Each string is repeated n times, where n is the length of the string.
Print the concatenated string.
 */
// Judge ready

package _05_Text_processing.lab;

import java.util.Scanner;

public class _02_Exercise {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//        System.out.print("Enter string of words: ");
        String[] input = s.nextLine().split(" ");
        String result = repeatWord(input);
        System.out.println(result);

    }

    private static String repeatWord(String[] input) {
        String result = "";
        for (String word : input) {
            for (int j = 0; j < word.length(); j++) {
                result += word;
            }
        }
        return result;
    }
}
