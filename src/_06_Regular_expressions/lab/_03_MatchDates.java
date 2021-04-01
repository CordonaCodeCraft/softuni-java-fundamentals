
// Judge ready

package _06_Regular_expressions.lab;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class _03_MatchDates {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String expression = "\\b(?<day>\\d{2})([-./])(?<month>[A-Z][a-z]{2})(\\2)(?<year>[\\d]{4})\\b";
        Pattern regex = Pattern.compile(expression);
        Matcher matcher = regex.matcher(s.nextLine());
        while (matcher.find()) {
            System.out.printf("Day: %s, Month: %s, Year: %s%n",
                    matcher.group("day"),
                    matcher.group("month"),
                    matcher.group("year"));
        }
    }
}
