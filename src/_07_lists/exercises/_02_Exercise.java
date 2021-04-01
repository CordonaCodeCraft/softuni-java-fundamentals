/*
Write a program, which reads a list of integers from the console and receives commands, which manipulate the list. Your program may receive the following commands:
• Delete {element} - delete all elements in the array, which are equal to the given element
• Insert {element} {position} - insert element at the given position
You should stop the program when you receive the command "end". Print all numbers in the array separated with a single whitespace.
*/

// TODO: 08.05.2020 г. Judge not ready 85/100

package _07_lists.exercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _02_Exercise {
    public static void main(String[] args) {
// System.out.print("Enter string of integers: ");
        Scanner s = new Scanner(System.in);
        List<Integer> input = Arrays.stream(s.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        while (true) {
// System.out.print("Enter command: ");
            String command = s.nextLine();
            if (command.equals("end")) {
                break;
            } else {
                String[] tokens = command.split(" ");
                String trigger = tokens[0];
                switch (trigger) {
                    case "Delete":
                        int target = Integer.parseInt(tokens[1]);
                        while (input.contains(target)) {
                            input.remove(Integer.valueOf(target));
                        }
                        break;
                    case "Insert":
                        int element = Integer.parseInt(tokens[1]);
                        int targetIndex = Integer.parseInt(tokens[2]);
                        if (targetIndex < input.size())  {
                            input.add(targetIndex, element);
                        }
                }
            }

        }
        printResult(input);
    }

    private static void printResult(List<Integer> input) {
        StringBuilder product = new StringBuilder();
        for (Integer integer : input) {
            product.append(integer).append(" ");
        }
        System.out.println(product.toString());
    }
}