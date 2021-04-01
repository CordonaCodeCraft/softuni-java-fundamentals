/*
 You will be given numbers (list of integers) on the first input line.
 Until you receive "End" you will be given operations you have to apply on the list. The possible commands are:
•	Add {number} - add number at the end
•	Insert {number} {index} - insert number at given index
•	Remove {index} - remove that index
•	Shift left {count} - first number becomes last 'count' times
•	Shift right {count} - last number becomes first 'count' times
Note: It is possible that the index given is outside of the bounds of the array. In that case print "Invalid index"
 */

// Judge ready

package _07_lists.exercises;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _04_Exercise {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//        System.out.print("Enter list of integers: ");
        List<Integer> input = Arrays.stream(s.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        while (true) {
//            System.out.print("Enter command: ");
            String[] tokens = s.nextLine().split(" ");
            String trigger = tokens[0];
            if (trigger.equals("End")) {
                break;
            } else {
                switch (trigger) {
                    case "Add":
                        int number = Integer.parseInt(tokens[1]);
                        input.add(number);
                        break;
                    case "Insert":
                        int targetNumber = Integer.parseInt(tokens[1]);
                        int targetIndex = Integer.parseInt(tokens[2]);
                        if (targetIndex < 0 || targetIndex > input.size() - 1) {
                            System.out.println("Invalid index");
                            break;
                        } else {
                            input.add(targetIndex, targetNumber);
                        }
                        break;
                    case "Remove":
                        int index = Integer.parseInt(tokens[1]);
                        if (index < 0 || index > input.size() - 1) {
                            System.out.println("Invalid index");
                            break;
                        } else {
                            input.remove(index);
                        }
                        break;
                    case "Shift":
                        String direction = tokens[1];
                        int count = Integer.parseInt(tokens[2]);
                        switch (direction) {
                            case "left":
                                moveLeft(input, count);
                                break;
                            case "right":
                                moveRight(input,count);
                        }


                }
            }
        }

        printResult(input);
    }

    private static void moveLeft(List<Integer> input, int count) {
        for (int cycle = 0; cycle < count; cycle++) {
            for (int index = 0; index < input.size() - 1; index++) {
                int current = input.get(index);
                int targetIndex = index + 1;
                int target = input.get(targetIndex);
                input.set(targetIndex, current);
                input.set(index, target);
            }
        }
    }

    private static void moveRight(List<Integer> input, int count) {
        for (int cycle = 0; cycle < count; cycle++) {
            for (int index = input.size() - 1; index > 0; index--) {
                int current = input.get(index);
                int targetIndex = index - 1;
                int target = input.get(targetIndex);
                input.set(targetIndex, current);
                input.set(index, target);
            }
        }
    }

    private static void printResult(List<Integer> input) {
        StringBuilder product = new StringBuilder();
        for (Integer integer : input) {
            product.append(integer).append(" ");
        }
        System.out.println(product.toString());
    }
}
