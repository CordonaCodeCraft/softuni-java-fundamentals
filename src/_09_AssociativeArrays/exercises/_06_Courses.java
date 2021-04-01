// Judge ready

package _09_AssociativeArrays.exercises;

import java.util.*;

public class _06_Courses {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Map<String, List<String>> coursesDatabase = new LinkedHashMap<>();
        while (true) {
            String input = s.nextLine();
            if (input.equals("end")) {
                break;
            } else {
                String[] tokens = input.split(" : ");
                addToDataBase(coursesDatabase, tokens);
            }
        }
        sortDatabase(coursesDatabase);
    }

    private static void addToDataBase(Map<String, List<String>> coursesDatabase, String[] tokens) {
        String course = tokens[0];
        String student = tokens[1];
        coursesDatabase.putIfAbsent(course, new ArrayList<>());
        coursesDatabase.get(course).add(student);
    }

    private static void sortDatabase(Map<String, List<String>> coursesDatabase) {
        coursesDatabase
                .entrySet()
                .stream()
                .sorted((left, right) -> Integer.compare(right.getValue().size(), left.getValue().size()))
                .forEach(entry -> print(entry));
    }

    private static void print(Map.Entry<String, List<String>> entry) {
        System.out.printf("%s: %d%n", entry.getKey(), entry.getValue().size());
        entry
                .getValue()
                .stream()
                .map(String::toString)
                .sorted()
                .forEach(e -> System.out.printf("-- %s%n", e));
    }
}
