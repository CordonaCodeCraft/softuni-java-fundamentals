// Judge ready

package _06_Regular_expressions.exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class _05_NetherRealms {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String[] input = s.nextLine().split(",");
        List<String> demonsList = new ArrayList<>();
        for (String demon : input) {
            demon = demon.trim();
            int demonHealth = calculateHealth(demon);
            double demonDamage = calculateDamage(demon);
            String demonStatistics = constructDemonStatistics(demon, demonHealth, demonDamage);
            demonsList.add(demonStatistics);
        }
        printResult(demonsList);
    }

    private static int calculateHealth(String demon) {
        String reduced = demon.replaceAll("[0-9+\\-*/.]", "");
        return reduced
                .chars()
                .sum();
    }

    private static double calculateDamage(String demon) {
        Pattern damagePattern = Pattern.compile("[-]?[+]?[\\d]*[.]?[\\d]+");
        Matcher damageMatcher = damagePattern.matcher(demon);
        double demonDamage = 0;

        while (damageMatcher.find()) {
            double digit = Double.parseDouble(damageMatcher.group());
            demonDamage += digit;
        }

        char[] nameToCharactersArray = demon.toCharArray();

        for (char character : nameToCharactersArray) {
            if (character == '*') {
                demonDamage *= 2;
            }
            if (character == '/') {
                demonDamage /= 2;
            }
        }

        return demonDamage;
    }

    private static String constructDemonStatistics(String demon, int demonHealth, double demonDamage) {
        return String.format("%s - %d health, %.2f damage", demon, demonHealth, demonDamage);
    }

    private static void printResult(List<String> demonsList) {
        demonsList
                .stream()
                .sorted()
                .forEach(System.out::println);
    }

}
