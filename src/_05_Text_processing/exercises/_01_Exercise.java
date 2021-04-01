/*
Write a program that reads user names on a single line (joined by ", ") and prints all valid usernames.
A valid username is:
•	Has length between 3 and 16 characters
•	Contains only letters, numbers, hyphens and underscores
•	Has no redundant symbols before, after or in between.
 */

// Judge ready

package _05_Text_processing.exercises;

import java.util.Scanner;

public class _01_Exercise {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//        System.out.print("Enter array of usernames: ");
        String[] userNames = s.nextLine().split(", ");

        for (String word : userNames) {
            int counter = 0;
            if (word.length() >= 3 && word.length() <= 16) {
                for (int wordIndex = 0; wordIndex < word.length(); wordIndex++) {
                    char character = word.charAt(wordIndex);
                    if (Character.isLetterOrDigit(character)) {
                        counter++;
                    } else {
                        if (character == '-' || character == '_') {
                            counter++;
                        }
                    }
                }
                if (counter == word.length()) {
                    System.out.println(word);
                }
            }
        }
    }
}

