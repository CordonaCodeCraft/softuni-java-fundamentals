package _05_Text_processing.exercises;

import java.util.Scanner;

public class _08_Exercise {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//        System.out.print("Enter a string of letters and digits: ");
        String[] input = s.nextLine().split("\\s+");
        double product = 0;
        for (String target : input) {
            boolean[] isCapitalLetter = evaluateLetters(target);
            int[] letterValues = findLetterValues(target);
            int integer = Integer.parseInt(extractDigit(target));
            double result = executeCalculation(isCapitalLetter, letterValues, integer);
            product += result;
        }
        System.out.printf("%.2f", product);
    }

    private static boolean[] evaluateLetters(String input) {
        boolean[] isCapitalLetter = new boolean[2];
        isCapitalLetter[0] = Character.isUpperCase(input.charAt(0));
        isCapitalLetter[1] = Character.isUpperCase(input.charAt(input.length() - 1));
        return isCapitalLetter;
    }

    private static int[] findLetterValues(String input) {
        String toLowerCase = input.toLowerCase();
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        int[] letterValues = new int[2];
        letterValues[0] = alphabet.indexOf(toLowerCase.charAt(0), 0) + 1;
        letterValues[1] = alphabet.indexOf(toLowerCase.charAt(toLowerCase.length() - 1), 0) + 1;
        return letterValues;
    }

    private static String extractDigit(String input) {
        StringBuilder extractor = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char character = input.charAt(i);
            if (Character.isDigit(character)) {
                extractor.append(character);
            }
        }
        return extractor.toString();
    }

    private static double executeCalculation(boolean[] isCapitalLetter, int[] letterValues, int integer) {
        boolean firstLetterIsCapital = isCapitalLetter[0];
        boolean secondLetterIsCapital = isCapitalLetter[1];
        int firstLetterValue = letterValues[0];
        int secondLetterValue = letterValues[1];
        double result = 0;

        if (firstLetterIsCapital) {
            result += (integer * 1.0 / firstLetterValue);
        } else {
            result += integer * firstLetterValue;
        }

        if (secondLetterIsCapital) {
            result -= secondLetterValue;
        } else {
            result += secondLetterValue;
        }

        return result;

    }

}
