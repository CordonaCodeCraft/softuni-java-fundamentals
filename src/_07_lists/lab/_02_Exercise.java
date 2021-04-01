/*
Write a program that sum all numbers in a list in the following order:
first + last, first + 1 + last - 1, first + 2 + last - 2, … first + n, last - n.
 */

// Judge ready

package _07_lists.lab;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _02_Exercise {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//        System.out.print("Enter string of numbers: ");
        List<Integer> input = Arrays.stream(s.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        for (int index = 0; index < input.size(); index++) {
            if (index == input.size() - 1) {
                break;
            } else {
                int first = input.get(index);
                int last = input.get(input.size() - 1);
                input.set(index, first + last);
                input.remove(input.size() - 1);
            }
        }

        String product = input.stream()
                .map(String::valueOf)
                .collect(Collectors.joining(" "));


    }


}
