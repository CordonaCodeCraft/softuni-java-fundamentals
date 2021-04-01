// Judge reddy

package _09_AssociativeArrays.lab;

import java.util.*;
import java.util.stream.Collectors;

public class _01_CountRealNumbers {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter input: ");
        List<Integer> integersList = generateList(s.nextLine());
        Map<Integer, Integer> integersMap = new TreeMap<>();
        populateMap(integersList,integersMap);
        printMap(integersMap);

    }

    private static List<Integer> generateList(String input) {
        return Arrays
                .stream(input.split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
    }

    private static void populateMap(List<Integer> integersList, Map<Integer, Integer> integersMap) {
        for (int i = 0; i < integersList.size(); i++) {
            int key = integersList.get(i);
            if (!integersMap.containsKey(key)) {
                int count = 0;
                for (int j = i; j < integersList.size(); j++) {
                    if (integersList.get(j) == key) {
                        count++;
                    }
                }
                integersMap.put(key,count);
            }
        }
    }

    private static void printMap(Map<Integer, Integer> integersMap) {
        for (Integer integer : integersMap.keySet()) {
            System.out.printf("%d -> %d%n", integer, integersMap.get(integer));
        }
    }
}
