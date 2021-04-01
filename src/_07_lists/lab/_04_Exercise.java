/*
Write a program that reads a list of integers. Then until you receive "end", you will be given different commands:
Add {number}: add a number to the end of the list
Remove {number}: remove a number from the list
RemoveAt {index}: remove a number at a given index
Insert {number} {index}: insert a number at a given index
Note: All the indices will be valid!
When you receive the "end" command print the final state of the list (separated by spaces)
 */

// Judge ready

package _07_lists.lab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _04_Exercise {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//        System.out.print("Enter string of integers: ");
        List<Integer> input = Arrays.stream(s.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        while (true) {
//            System.out.print("Enter a command: ");
            String command = s.nextLine();
            if (command.equals("end")) {
                break;
            } else {
                String[] splitted = command.split(" ");
                String trigger = splitted[0];
                switch (trigger) {
                    case "Add":
                        int numberToAdd = Integer.parseInt(splitted[1]);
                        input.add(numberToAdd);
                        break;
                    case "Remove":
                        int numberToRemove = Integer.parseInt(splitted[1]);
                        input.remove(Integer.valueOf(numberToRemove));
                        break;
                    case "RemoveAt":
                        int indexToRemove = Integer.parseInt(splitted[1]);
                        input.remove(indexToRemove);
                        break;
                    case "Insert" :
                        int numberToInsert = Integer.parseInt(splitted[1]);
                        int targetIndex = Integer.parseInt(splitted[2]);
                        input.add(targetIndex,numberToInsert);
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
        System.out.print(product.toString());
    }
}
