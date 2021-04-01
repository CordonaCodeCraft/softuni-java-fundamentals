
// TODO: 29.05.2020 г. Judge not ready: 80/100

package _06_Regular_expressions.exercises;

import java.util.*;

public class _02_RaceWithoutRegex {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String[] racers = s.nextLine().split(", ");
        Map<String, Integer> racersStatistics = new HashMap<>();
        List<String> winnersList = new ArrayList<>();
        while (true) {
            String input = s.nextLine();
            if (input.equals("end of race")) {
                break;
            } else {
                String racer = extractRacer(input);
                boolean racerInList = confirmRacer(racers, racer);
                if (racerInList) {
                    int inputDistance = calculateInputDistance(input);
                    racersStatistics.putIfAbsent(racer, 0);
                    racersStatistics.put(racer, racersStatistics.get(racer) + inputDistance);
                }
            }
        }
        generateWinnersList(racersStatistics, winnersList);
        printWinners(winnersList);
    }

    private static String extractRacer(String input) {
        StringBuilder product = new StringBuilder();
        input.chars()
                .filter(Character::isLetter)
                .forEach(c -> product.append(Character.toString(c)));
        return product.toString();
    }

    private static boolean confirmRacer(String[] racers, String racer) {
        return Arrays
                .asList(racers)
                .contains(racer);
    }

    private static int calculateInputDistance(String distances) {
        return distances
                .chars()
                .filter(Character::isDigit)
                .map(Character::getNumericValue)
                .sum();
    }

    private static void generateWinnersList(Map<String, Integer> racersChart, List<String> winners) {
        racersChart
                .entrySet()
                .stream()
                .sorted((r1, r2) -> r2.getValue().compareTo(r1.getValue()))
                .limit(3)
                .forEach((e) -> winners.add(e.getKey()));
    }

    private static void printWinners(List<String> winnersList) {
        for (int i = 0; i < winnersList.size(); i++) {
            String winner = winnersList.get(i);
            if (i == 0) {
                System.out.printf("1st place: %s%n", winner);
            } else if (i == 1) {
                System.out.printf("2nd place: %s%n", winner);
            } else {
                System.out.printf("3rd place: %s%n", winner);
            }
        }
    }
}