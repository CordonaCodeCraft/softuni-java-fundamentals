// Judge ready

package _09_AssociativeArrays.exercises;

import java.util.*;

public class _03_LegendaryFarming {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Map<String, Integer> keyMaterials = new HashMap<>();
        Map<String, Integer> junkItems = new TreeMap<>();
        generateLegendaryMaterials(keyMaterials);
        while (true) {
            boolean terminate = keyMaterials.containsKey("terminate");
            if (terminate) {
                keyMaterials.remove("terminate");
                break;
            } else {
                String[] input = generateInput(s.nextLine());
                distributeItems(input, keyMaterials, junkItems);
            }
        }
        printKeyMaterials(keyMaterials);
        printJunk(junkItems);


    }

    private static void generateLegendaryMaterials(Map<String, Integer> legendaryMaterials) {
        legendaryMaterials.put("shards", 0);
        legendaryMaterials.put("fragments", 0);
        legendaryMaterials.put("motes", 0);
    }

    private static String[] generateInput(String input) {
        return Arrays.stream(input.split("\\s+"))
                .map(String::toLowerCase)
                .toArray(String[]::new);
    }

    private static void distributeItems(String[] input, Map<String, Integer> legendaryMaterials, Map<String, Integer> junkItems) {
        int quantity = 0;
        for (String token : input) {
            char character = token.charAt(0);
            if (Character.isDigit(character)) {
                quantity = Integer.parseInt(token);
            } else {
                boolean isMaterial = legendaryMaterials.containsKey(token);
                if (isMaterial) {
                    int inputQuantity = legendaryMaterials.get(token);
                    legendaryMaterials.put(token, inputQuantity + quantity);
                    int totalQuantity = legendaryMaterials.get(token);
                    if (totalQuantity >= 250) {
                        legendaryMaterials.put(token, totalQuantity - 250);
                        printLegendary(token);
                        legendaryMaterials.put("terminate", 0);
                        break;
                    }
                    quantity = 0;
                } else {
                    junkItems.putIfAbsent(token, 0);
                    junkItems.put(token, junkItems.get(token) + quantity);
                    quantity = 0;
                }
            }
        }
    }

    private static void printLegendary(String token) {
        switch (token) {
            case "shards":
                System.out.println("Shadowmourne obtained!");
                break;
            case "fragments":
                System.out.println("Valanyr obtained!");
                break;
            case "motes":
                System.out.println("Dragonwrath obtained!");
                break;
        }
    }

    private static void printKeyMaterials(Map<String, Integer> keyMaterials) {
        keyMaterials.entrySet()
                .stream()
                .sorted((e1, e2) ->
                        {
                            int res = e2.getValue().compareTo(e1.getValue());
                            if (res == 0) {
                                res = e1.getKey().compareTo(e2.getKey());
                            }
                            return res;
                        }
                )
                .forEach(e -> System.out.printf("%s: %d%n", e.getKey(), e.getValue()));


    }

    private static void printJunk(Map<String, Integer> junkItems) {
        for (String junk : junkItems.keySet()) {
            System.out.printf("%s: %d%n", junk, junkItems.get(junk));
        }
    }
}
