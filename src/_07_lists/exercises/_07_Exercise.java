/*
Write a program to append several arrays of numbers.
	Arrays are separated by "|"
	Values are separated by spaces (" ", one or several)
	Order the arrays from the last to the first, and their values from left to right
 */

// TODO: 10.05.2020 г. Judge not ready 75/100

package _07_lists.exercises;

import java.text.DecimalFormat;
import java.util.*;

public class _07_Exercise {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//        System.out.print("Enter input: ");
        String input = s.nextLine();
        List<Double> product = new ArrayList<>();
        boolean isFirstArray = true;
        int separatorIndex = 0;
        String[] subString = new String[1];
        for (int i = input.length() - 1; i >= 0; i--) {
            if (isFirstArray) {
                separatorIndex = input.lastIndexOf("|");
                subString = generateSubstring(input, isFirstArray, separatorIndex)
                        .trim()
                        .split("\\s+");
                addToProduct(product, subString);
                isFirstArray = false;
            } else {
                separatorIndex = input.lastIndexOf("|", separatorIndex - 1);
                boolean confirmSeparator = separatorIndex > 0;
                if (confirmSeparator) {
                    subString = generateSubstring(input, isFirstArray, separatorIndex)
                            .trim()
                            .split("\\s+");
                    addToProduct(product, subString);
                } else {
                    subString = generateSubstring(input, isFirstArray, 0)
                            .trim()
                            .split("\\s+");
                    addToProduct(product, subString);
                    break;
                }
            }
        }

        printProduct(product);
    }

    private static String generateSubstring(String input, boolean isFirstArray, int separatorIndex) {
        String subString = null;
        int subStringStart = separatorIndex + 1;
        if (isFirstArray) {
            subString = input.substring(subStringStart);
        } else {
            if (separatorIndex == 0) {
                subString = input.substring(0, input.indexOf("|"));
            } else {
                subString = input.substring(subStringStart, input.indexOf("|", subStringStart));
            }
        }
        return subString;
    }

    private static void addToProduct(List<Double> product, String[] subString) {
        for (String current : subString) {
            double digit = Double.parseDouble(current);
            product.add(digit);
        }
    }

    private static void printProduct(List<Double> product) {
        for (Double digit : product) {
            System.out.print(new DecimalFormat("0.##").format(digit) + " ");
        }
    }
}