package MidExam;

import java.util.Arrays;
import java.util.Scanner;

public class _02_ArrayModifier {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] input = extractTokens(s);

        while (true) {
            String command = s.nextLine();
            if ("end".equals(command)) {
                break;
            } else {
                String[] tokens = command.split("\\s+");
                String instruction = tokens[0];

                switch (instruction) {
                    case "swap":
                        swapElements(input, tokens);
                        break;
                    case "multiply":
                        multiplyElements(input, tokens);
                        break;
                    case "decrease":
                        decreaseElements(input);
                        break;
                }
            }
        }

        System.out.println(Arrays.toString(input).replaceAll("[\\[\\]]", ""));

    }

    private static int[] extractTokens(Scanner s) {
        return Arrays
                .stream(s.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
    }

    private static void swapElements(int[] input, String[] tokens) {
        int firstIndex = Integer.parseInt(tokens[1]);
        int secondIndex = Integer.parseInt(tokens[2]);
        int buffer = input[firstIndex];

        input[firstIndex] = input[secondIndex];
        input[secondIndex] = buffer;

    }

    private static void multiplyElements(int[] input, String[] tokens) {
        int firstIndex = Integer.parseInt(tokens[1]);
        int secondIndex = Integer.parseInt(tokens[2]);

        int product = input[firstIndex] * input[secondIndex];

        input[firstIndex] = product;
    }

    private static void decreaseElements(int[] input) {

        for (int element = 0; element < input.length; element++) {
            input[element] -= 1;
        }

    }
}
