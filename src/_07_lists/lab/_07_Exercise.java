/*
Read a list of integers, remove all negative numbers from it and print the remaining elements in reversed order.
In case of no elements left in the list, print "empty".
 */

// Judge ready

package _07_lists.lab;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _07_Exercise {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//        System.out.print("Enter string of integers: ");
        List<Integer> input = Arrays.stream(s.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        for (int index = 0; index < input.size(); index++) {
            int current = input.get(index);
            if (current < 0) {
                input.remove(index);
                index = -1;
            }
        }
        if (input.size() == 0) {
            System.out.println("empty");
        } else {
            Collections.reverse(input);
            printResult(input);
        }
    }

    private static void printResult(List<Integer> input) {
        StringBuilder result = new StringBuilder();
        for (Integer integer : input) {
            result.append(integer).append(" ");
        }
        System.out.print(result.toString());
    }
}
