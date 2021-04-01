package FinalExam;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class _02_ {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        List<String> locations = new ArrayList<>();
        String input = s.nextLine();
        Pattern pattern = Pattern.compile("={1}[A-Z]{1}[A-Za-z]{2,}={1}|\\/{1}[A-Z]{1}[A-za-z]{2,}\\/{1}");
        Matcher matcher = pattern.matcher(input);

        while (matcher.find()) {
            StringBuilder builder = new StringBuilder();
            String extractedLocation = matcher.group();

            for (char character : extractedLocation.toCharArray()) {
                if (Character.isLetter(character)) {
                    builder.append(character);
                }
            }

            locations.add(builder.toString());
        }

        int travelPoints = 0;

        for (String location : locations) {
            travelPoints += location.length();
        }

        System.out.printf("Destinations: %s%n", String.join(", ", locations));
        System.out.printf("Travel Points: %d", travelPoints);

    }
}
