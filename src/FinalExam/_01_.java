package FinalExam;

import java.util.Scanner;

public class _01_ {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String journey = s.nextLine();
        StringBuilder product = new StringBuilder();

        while (true) {
            String command = s.nextLine();

            if (command.equals("Travel")) {
                break;
            } else {
                String[] tokens = command.split(":");
                String instruction = tokens[0];

                switch (instruction) {
                    case "Add Stop": {
                        int startIndex = Integer.parseInt(tokens[1]);
                        boolean startIndexIsInRange = startIndex >= 0 && startIndex < journey.length();
                        if (startIndexIsInRange) {
                            journey = addNewStop(journey, tokens);
                        }
                        product.append(journey).append(System.lineSeparator());
                        break;
                    }
                    case "Remove Stop":
                        int startIndex = Integer.parseInt(tokens[1]);
                        int endIndex = Integer.parseInt(tokens[2]);
                        boolean startIndexIsInRange = startIndex >= 0 && startIndex < journey.length();
                        boolean endIndexIsInRange = endIndex >= 0 && endIndex < journey.length();
                        if (startIndexIsInRange && endIndexIsInRange) {
                            journey = removeStop(journey, tokens);
                        }
                        product.append(journey).append(System.lineSeparator());
                        break;
                    case "Switch":
                        String targetStop = tokens[1];
                        String newStop = tokens[2];
                        if (journey.contains(tokens[1])) {
                            journey = journey.replaceAll(targetStop, newStop);
                        }
                        product.append(journey).append(System.lineSeparator());
                        break;
                }
            }
        }
        System.out.print(product.toString());
        System.out.printf("Ready for world tour! Planned stops: %s", journey);
    }

    private static String addNewStop(String journey, String[] tokens) {
        int startIndex = Integer.parseInt(tokens[1]);
        String newStop = tokens[2];
        String firstPart = journey.substring(0, startIndex);
        String secondPart = journey.substring(startIndex);
        return firstPart + newStop + secondPart;
    }

    private static String removeStop(String journey, String[] tokens) {
        int startIndex = Integer.parseInt(tokens[1]);
        int endIndex = Integer.parseInt(tokens[2]);
        String firstPart = journey.substring(0, startIndex);
        String secondPart = journey.substring(endIndex + 1);
        return firstPart + secondPart;
    }
}
