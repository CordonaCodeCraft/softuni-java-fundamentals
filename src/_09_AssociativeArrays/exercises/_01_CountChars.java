// Judge ready

package _09_AssociativeArrays.exercises;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class _01_CountChars {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String input = s.nextLine();
        Map<Character, Integer> lettersMap = new LinkedHashMap<>();
        populateMap(input, lettersMap);
        printResult(lettersMap);

    }

    private static void populateMap(String input, Map<Character, Integer> lettersMap) {
        for (int i = 0; i < input.length(); i++) {
            Character current = input.charAt(i);
            if (current != ' ') {
                lettersMap.putIfAbsent(current, 0);
                lettersMap.put(current, lettersMap.get(current) + 1);
            }
        }
    }

    private static void printResult(Map<Character, Integer> charMap) {
        for (Character character : charMap.keySet()) {
            System.out.printf("%c -> %d%n", character, charMap.get(character));
        }
    }

}
