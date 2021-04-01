
// Judge ready

package _09_AssociativeArrays.exercises;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class _02_MinerTask {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Map<String, Integer> minedMaterials = new LinkedHashMap<>();
        int count = 0;
        String material = null;
        while (true) {
            String input = s.nextLine();
            count++;
            if (input.equals("stop")) {
                break;
            } else {
                if (count % 2 != 0) {
                    material = input;
                    minedMaterials.putIfAbsent(material, 0);
                } else {
                    int quantity = Integer.parseInt(input);
                    minedMaterials.put(material, minedMaterials.get(material) + quantity);
                }
            }
        }
        printResult(minedMaterials);
    }

    private static void printResult(Map<String, Integer> minedMaterials) {
        for (String material : minedMaterials.keySet()) {
            System.out.printf("%s -> %d%n", material, minedMaterials.get(material));
        }
    }
    
}
