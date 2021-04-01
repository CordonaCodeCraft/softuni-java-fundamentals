package FinalExam;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class _03_ {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int plantsCount = Integer.parseInt(s.nextLine());
        Map<String, List<Double>> plantsStatistics = new HashMap<>();
        Map<String, List<Double>> plantsRatings = new HashMap<>();

        while (--plantsCount >= 0) {
            String[] tokens = s.nextLine().split("<->");
            String plantName = tokens[0];
            double plantRarity = Double.parseDouble(tokens[1]);
            List<Double> statistics = new ArrayList<>();

            if (!plantsStatistics.containsKey(plantName)) {
                plantsStatistics.putIfAbsent(plantName, statistics);
                plantsStatistics.get(plantName).add(plantRarity);
                plantsStatistics.get(plantName).add(0.0);
            } else {
                plantsStatistics.get(plantName).set(0, plantRarity);
            }
        }

        Deque<String> test = new ArrayDeque<>();
        test.is

        while (true) {
            String input = s.nextLine();
            if (input.equals("Exhibition")) {
                break;
            } else {

                boolean isValidInput = validateCommand(input);

                if (isValidInput) {
                    String[] tokens = input.split(": ");
                    String command = tokens[0];
                    String[] plantTokens = tokens[1].split(" - ");
                    String plantName = plantTokens[0];

                    switch (command) {
                        case "Rate":
                            double plantScore = Double.parseDouble(plantTokens[1]);
                            List<Double> scores = new ArrayList<>();
                            plantsRatings.putIfAbsent(plantName, scores);
                            plantsRatings.get(plantName).add(plantScore);
                            break;
                        case "Update":
                            double newRarity = Double.parseDouble(plantTokens[1]);
                            plantsStatistics.get(plantName).set(0, newRarity);
                            break;
                        case "Reset":
                            plantsRatings.get(plantName).clear();
                            break;
                    }

                } else {
                    System.out.println("error");
                }


            }
        }

        for (String plant : plantsRatings.keySet()) {
            double averageScore = plantsRatings.get(plant)
                    .stream()
                    .mapToDouble(Double::valueOf)
                    .average()
                    .orElse(0);
            plantsStatistics.get(plant).set(1, averageScore);
        }

        System.out.println("Plants for the exhibition:");
        plantsStatistics
                .entrySet()
                .stream()
                .sorted((first, second) -> Double.compare(measureWeight(second, second), measureWeight(first, first)))
                .forEach(plant -> System.out.printf("- %s; Rarity: %.0f; Rating: %.2f%n", plant.getKey(), plant.getValue().get(0), plant.getValue().get(1)));


    }

    private static boolean validateCommand(String input) {
        boolean isValidCommand = true;
        Pattern pattern = Pattern.compile("^Rate: [A-Z]{1}[a-z]+ - [\\d]+|^Update: [A-Z]{1}[a-z]+ - [\\d]+|^Reset: [A-Z]{1}[a-z]+|Exhibition");
        Matcher matcher = pattern.matcher(input);
        return matcher.find();
    }

    private static Double measureWeight(Map.Entry<String, List<Double>> first, Map.Entry<String, List<Double>> second) {
        double firstRarity = first.getValue().get(0);
        double secondRarity = second.getValue().get(0);
        double firstScore = first.getValue().get(1);
        double secondScore = first.getValue().get(1);

        if (firstRarity == secondRarity) {
            if (firstScore > secondScore) {
                return 1.0;
            } else {
                return 0.0;
            }
        } else {
            if (firstRarity > secondRarity) {
                return 1.0;
            } else {
                return 0.0;
            }
        }

    }
}
