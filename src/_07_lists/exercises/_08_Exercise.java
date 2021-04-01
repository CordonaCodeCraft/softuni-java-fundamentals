// TODO: 11.05.2020 г. Judge not ready 90/100

package _07_lists.exercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _08_Exercise {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//        System.out.print("Enter input: ");
        List<String> input = generateInput(s.nextLine());

        while (true) {
//            System.out.print("Enter command: ");
            String command = s.nextLine();
            if (command.equals("3:1")) {
                break;
            } else {
                String[] tokens = command.split(" ");
                String trigger = tokens[0];
                switch (trigger) {
                    case "merge":
                        if (input.size() == 1) {
                            break;
                        } else {
                            int startIndex = Integer.parseInt(tokens[1]);
                            int endIndex = Integer.parseInt(tokens[2]);
                            mergeElements(input, startIndex, endIndex);
                            break;
                        }
                    case "divide":
                        int targetIndex = Integer.parseInt(tokens[1]);
                        int partitions = Integer.parseInt(tokens[2]);
                        boolean equalPartitions = confirmEqualPartitions(input, targetIndex, partitions);
                        if (equalPartitions) {
                            generateEqualPartitions(input, targetIndex, partitions);
                        } else {
                            generateNonEqualPartitions(input, targetIndex, partitions);
                        }
                        break;

                }

            }

        }
        printProduct(input);
    }

    private static List<String> generateInput(String nextLine) {
        return Arrays.stream(nextLine.split(" "))
                .map(String::valueOf)
                .collect(Collectors.toList());
    }

    private static void mergeElements(List<String> input, int startIndex, int endIndex) {
        int lastIndex = input.size() - 1;

        if (startIndex < 0 || startIndex > lastIndex) {
            startIndex = 0;
        }
        if (endIndex > lastIndex) {
            endIndex = lastIndex;
        }

        int iterations = endIndex - startIndex;
        String product = null;

        for (int i = startIndex; iterations >= 0; i++) {
            if (iterations == 0) {
                break;
            } else {
                if (i == startIndex) {
                    product = input.get(i);
                } else {
                    String nextString = input.get(i);
                    product = product + nextString;
                    input.remove(i);
                    iterations--;
                    i--;
                }
            }
        }
        input.set(startIndex, product);
    }

    private static boolean confirmEqualPartitions(List<String> input, int targetIndex, int partitions) {
        String target = input.get(targetIndex);
        int length = target.length();
        return length % partitions == 0;
    }

    private static void generateEqualPartitions(List<String> input, int targetIndex, int partitions) {
        String target = input.get(targetIndex);
        int partitionLength = target.length() / partitions;
        boolean toSetElement = true;
        String product = "";
        int index = 0;
        for (int i = 0; i < partitions; i++) {
            for (int j = 0; j < partitionLength; j++) {
                char current = target.charAt(index);
                product = product + current;
                index++;
            }
            if (toSetElement) {
                input.set(targetIndex, product);
                toSetElement = false;
                targetIndex++;
                product = "";
            } else {
                input.add(targetIndex, product);
                targetIndex++;
                product = "";
            }

        }

    }

    private static void generateNonEqualPartitions(List<String> input, int targetIndex, int partitions) {
        String target = input.get(targetIndex);
        int length = target.length();
        int shortPartitionLength = (length / partitions);
        boolean toSetElement = true;
        String product = "";
        int index = 0;
        for (int i = 0; i < partitions - 1; i++) {
            for (int j = 0; j < shortPartitionLength; j++) {
                char current = target.charAt(index);
                product = product + current;
                index++;
            }
            if (toSetElement) {
                input.set(targetIndex, product);
                targetIndex++;
                toSetElement = false;
                product = "";
            } else {
                input.add(targetIndex, product);
                targetIndex++;
                product = "";
            }
        }
        String longPartition = target.substring(index);
        input.add(targetIndex, longPartition);
    }

    private static void printProduct(List<String> input) {
        StringBuilder product = new StringBuilder();
        for (String string : input) {
            product.append(string).append(" ");
        }
        System.out.println(product.toString());
    }
}

