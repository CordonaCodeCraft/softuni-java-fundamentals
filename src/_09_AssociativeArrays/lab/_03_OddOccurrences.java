// Judge ready

package _09_AssociativeArrays.lab;

import java.util.*;

public class _03_OddOccurrences {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter input: ");
        String[] input = Arrays.stream(s.nextLine().split("\\s+"))
                .map(String::toLowerCase)
                .toArray(String[]::new);
        Map<String, Integer> words = new LinkedHashMap<>();
        populateWordsMap(input, words);
        List<String> product = generateProduct(words);
        System.out.println(String.join(", ", product));

    }

    private static void populateWordsMap(String[] input, Map<String, Integer> words) {
        for (String word : input) {
            words.putIfAbsent(word, 1);
            words.put(word, words.get(word) + 1);
        }
    }

    private static List<String> generateProduct(Map<String, Integer> words) {
        List<String> product = new ArrayList<>();
        for (String word : words.keySet()) {
            int value = words.get(word);
            boolean toAdd = value % 2 == 0;
            if (toAdd) {
                product.add(word);
            }
        }
        return product;
    }

}

