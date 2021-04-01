package _09_AssociativeArrays.exercises;

import java.util.*;
import java.util.stream.Collectors;

public class _09_ForceBook {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Map<String, List<String>> forceLog = new TreeMap<>();
        while (true) {
            String input = s.nextLine();
            if (input.equals("Lumpawaroo")) {
                break;
            } else {
                boolean toAdd = input.contains("|");
                if (toAdd) {
                    addUser(input, forceLog);

                } else {
                    migrateUser(input, forceLog);
                }
            }
        }
        printResult(forceLog);
    }

    private static void addUser(String input, Map<String, List<String>> forceLog) {
        String forceType = input.substring(0, input.indexOf("|") - 1);
        String user = input.substring(input.indexOf("|") + 2);
        forceLog.putIfAbsent(forceType, new ArrayList<>());
        boolean userIsPresent = searchUser(forceLog, user);
        if (!userIsPresent) {
            forceLog.get(forceType).add(user);
        }
    }

    private static void migrateUser(String input, Map<String, List<String>> forceLog) {
        String user = input.substring(0, input.indexOf("-") - 1);
        String forceType = input.substring(input.indexOf(">") + 2);
        boolean userPresent = searchUser(forceLog, user);
        forceLog.putIfAbsent(forceType, new ArrayList<>());
        if (userPresent) {
            String otherSide = findOtherSide(forceLog, forceType);
            forceLog.get(forceType).add(user);
            forceLog.get(otherSide).remove(user);
            System.out.printf("%s joins the %s side!%n", user, forceType);
        } else {
            forceLog.get(forceType).add(user);
            System.out.printf("%s joins the %s side!%n", user, forceType);
        }
    }

    private static boolean searchUser(Map<String, List<String>> forceLog, String user) {
        return forceLog
                .entrySet()
                .stream()
                .anyMatch(e -> e.getValue().contains(user));
    }

    private static String findOtherSide(Map<String, List<String>> forceLog, String forceType) {
        return forceLog.keySet()
                .stream()
                .map(String::toString)
                .filter(e -> !e.equals(forceType))
                .collect(Collectors.joining());
    }

    private static void printResult(Map<String, List<String>> forceLog) {
        forceLog.entrySet()
                .stream()
                .filter(e -> e.getValue().size() > 0)
                .sorted((left, right) -> Integer.compare(right.getValue().size(), left.getValue().size()))
                .forEach(e -> printEntry(e));
    }

    private static void printEntry(Map.Entry<String, List<String>> e) {
        System.out.printf("Side: %s, Members: %d%n", e.getKey(), e.getValue().size());
        e.getValue()
                .stream()
                .sorted()
                .forEach(u -> System.out.printf("! %s%n", u));
    }
}
