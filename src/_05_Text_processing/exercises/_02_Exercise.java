/*
Create a method that takes two strings as arguments and returns the sum of their character codes multiplied (multiply str1[0] with str2[0] and add to the total sum).
Then continue with the next two characters.
If one of the strings is longer than the other, add the remaining character codes to the total sum without multiplication.
*/

// TODO: 17.04.2020 г. Judge not ready 60/100 points

package _05_Text_processing.exercises;

import java.util.Scanner;

public class _02_Exercise {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
// System.out.print("Enter array of strings: ");
        String[] input = s.nextLine().split(" ");
        boolean equalLength = input[0].length() == input[1].length();
        int result = sumAndMultiply(input);

        if (!equalLength) {
            int remainingLength = Math.abs(input[0].length() - input[1].length());
            if (input[0].length() > input[1].length()) {
                result += sumForLongerString(input[0], remainingLength);
            } else {
                result += sumForLongerString(input[1], remainingLength);
            }
        }

        System.out.println(result);
    }

    private static int sumAndMultiply(String[] input) {
        int result = 0;
        for (int index = 0; index < input[0].length(); index++) {
            result += input[0].charAt(index) * input[1].charAt(index);
        }
        return result;
    }

    private static int sumForLongerString(String longerString, int remainingLength) {
        int result = 0;
        int startIndex = longerString.length() - remainingLength;
        for (int i = startIndex; i <= remainingLength; i++) {
            result += longerString.charAt(i);
        }
        return result;
    }


}