
// Judge ready

package _09_AssociativeArrays.lab;

import java.util.*;

public class _02_WordSynonyms {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int count = Integer.parseInt(s.nextLine());
        Map<String, List<String>> dictionary = new LinkedHashMap<>();
        for (int i = 0; i < count; i++) {
            String word = s.nextLine();
            String synonym = s.nextLine();
            dictionary.putIfAbsent(word, new ArrayList<>());
            dictionary.get(word).add(synonym);

        }
        printDictionary(dictionary);
    }

    private static void printDictionary(Map<String, List<String>> dictionary) {
        for (String word : dictionary.keySet()) {
            System.out.printf("%s - %s%n", word,String.join(", ", dictionary.get(word)));
        }
    }
}
