package _06_Regular_expressions.exercises;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class _04_StarEnigma {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int count = Integer.parseInt(s.nextLine());
        Map<String, List<String>> warLog = new TreeMap<>();
        warLog.put("Attacked planets:", new ArrayList<>());
        warLog.put("Destroyed planets:", new ArrayList<>());

        while (--count >= 0) {
            String message = s.nextLine();
            int key = findKey(message);
            String decryptedMessage = decryptMessage(message,key);
            Pattern messagePattern = generatePattern(decryptedMessage);
            Matcher messageMatcher = messagePattern.matcher(decryptedMessage);
            boolean isValidMessage = messageMatcher.find();

            if (isValidMessage) {
                String planet = messageMatcher.group("planet");
                String attackType = messageMatcher.group("attack");
                if (attackType.equals("A")) {
                    String attacked = "Attacked planets:";
                    warLog.get(attacked).add(planet);
                } else {
                    String destroyed = "Destroyed planets:";
                    warLog.get(destroyed).add(planet);
                }
            }
        }
        printResult(warLog);
    }

    private static int findKey(String message) {
        int key = 0;
        Pattern keyPattern = Pattern.compile("[star]", Pattern.CASE_INSENSITIVE);
        Matcher keyMatcher = keyPattern.matcher(message);
        for (int i = 0; i < message.length(); i++) {
            if (keyMatcher.find()) {
                key++;
            }
        }
        return key;
    }

    private static String decryptMessage(String message, int key) {
        StringBuilder decryptedMessage = new StringBuilder();
        char[] charactersArray = message.toCharArray();
        for (char character : charactersArray) {
            char decryptedCharacter = (char) (character - key);
            decryptedMessage.append(decryptedCharacter);
        }
        return decryptedMessage.toString();
    }

    private static Pattern generatePattern(String decryptedMessage) {
        return Pattern.compile(".*?(?<planet>[A-Z][a-z]+)(?:[^@\\-!:>]*):(?<population>(\\d)+)" +
                "(?:[^@\\-!:>]*)!(?<attack>[AD])!(?:[^@\\-!:>]*)->(?<soldiersCount>\\d+)");
    }

    private static void printResult(Map<String, List<String>> attackLog) {
        attackLog
                .entrySet()
                .forEach(e -> printLog(e));
    }

    private static void printLog(Map.Entry<String, List<String>> e) {
        String attackType = e.getKey();
        int planetsCount = e.getValue().size();
        System.out.printf("%s %d%n", attackType, planetsCount);
        e.getValue()
                .stream()
                .sorted(Comparator.naturalOrder())
                .forEach(p -> System.out.printf("-> %s%n", p));
    }
    
}