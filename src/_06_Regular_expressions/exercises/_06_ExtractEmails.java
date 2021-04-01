
// Judge ready

package _06_Regular_expressions.exercises;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class _06_ExtractEmails {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String input = s.nextLine();
        String mailRegex = "((?<=\\s)[a-zA-Z0-9]+([-.]\\w*)*@[a-zA-Z]+?([.-][a-zA-Z]*)*(\\.[a-z]{2,}))";
        Pattern mailPattern = Pattern.compile(mailRegex);
        Matcher mailMatcher = mailPattern.matcher(input);
        while (mailMatcher.find()) {
            System.out.println(mailMatcher.group());
        }
    }
}
