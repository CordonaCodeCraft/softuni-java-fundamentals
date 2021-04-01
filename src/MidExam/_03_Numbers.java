package MidExam;

import java.util.*;

public class _03_Numbers {
    public static void main(String[] args) {
        List<Integer> bestIntegersList = new ArrayList<>(5);
        Scanner s = new Scanner(System.in);
        int[] input = extractTokens(s);
        double averageValue = calculateAverageValue(input);

        addBestIntegersToList(input, averageValue, bestIntegersList);

        sortBetsIntegersList(bestIntegersList);

        printResult(bestIntegersList);

    }

    private static double calculateAverageValue(int[] input) {
        double sum = 0;
        for (int integer : input) {
            sum += integer;
        }
        return sum / input.length;

    }

    private static int[] extractTokens(Scanner s) {
        return Arrays
                .stream(s.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
    }

    private static void addBestIntegersToList(int[] input, double averageValue, List<Integer> bestIntegersList) {
        for (int integer : input) {
            if (integer > averageValue) {
                bestIntegersList.add(integer);
            }
        }
    }

    private static void sortBetsIntegersList(List<Integer> bestIntegersList) {
        Collections.sort(bestIntegersList);
        Collections.reverse(bestIntegersList);
    }

    private static void printResult(List<Integer> greaterNumbersList) {

        if (greaterNumbersList.isEmpty()) {
            System.out.println("No");
        } else {
            for (int i = 0; i < greaterNumbersList.size(); i++) {
                if (i == 5) {
                    break;
                } else {
                    System.out.printf("%d ", greaterNumbersList.get(i));
                }
            }
        }
    }
}
