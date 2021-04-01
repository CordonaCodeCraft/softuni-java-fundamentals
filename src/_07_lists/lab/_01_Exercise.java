/*
Write a program to sum all adjacent equal numbers in a list of decimal numbers, starting from left to right.
	After two numbers are summed, the obtained result could be equal to some of its neighbors and should be summed as well (see the examples below).
	Always sum the leftmost two equal neighbors (if several couples of equal neighbors are available).
 */

// Judge ready

package _07_lists.lab;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _01_Exercise {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        List<Double> input = Arrays.stream(s.nextLine().split(" "))
                .map(Double::parseDouble)
                .collect(Collectors.toList());

        for (int index = 0; index < input.size() - 1; index++) {
            double current = input.get(index);
            double next = input.get(index + 1);
            if (current == next) {
                input.set(index, current * 2);
                input.remove(index + 1);
                index = -1;
            }
        }

        String product = joinByDelimiter(input);
        System.out.println(product);


    }

    private static String joinByDelimiter(List<Double> input) {
        String product = "";
        for (Double aDouble : input) {
            product += (new DecimalFormat("0.#").format(aDouble) + " ");

        }
        return product;
    }
}
