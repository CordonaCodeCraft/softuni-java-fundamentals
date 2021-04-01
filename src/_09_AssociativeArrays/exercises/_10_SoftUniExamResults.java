package _09_AssociativeArrays.exercises;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class _10_SoftUniExamResults {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Map<String, Integer> studentsLog = new TreeMap<>();
        Map<String, Integer> technologyLog = new TreeMap<>();
        while (true) {
            String input = s.nextLine();
            if (input.equals("exam finished")) {
                break;
            } else {
                String[] tokens = input.split("-");
                String student = tokens[0];
                if (!input.contains("banned")) {
                    String technology = tokens[1];
                    int points = Integer.parseInt(tokens[2]);
                    technologyLog.putIfAbsent(technology, 0);
                    technologyLog.put(technology, technologyLog.get(technology) + 1);
                    studentsLog.putIfAbsent(student, 0);
                    int currentPoints = studentsLog.get(student);
                    if (points > currentPoints)  {
                        studentsLog.put(student, points);
                    }
                } else {
                    studentsLog.remove(student);
                }
            }
        }

        if (studentsLog.isEmpty()) {
            printTechnologyResults(technologyLog);
        } else {
            printStudentsResults(studentsLog);
            printTechnologyResults(technologyLog);
        }


    }

    private static void printStudentsResults(Map<String, Integer> studentsLog) {
        System.out.println("Results: ");
        studentsLog
                .entrySet()
                .stream()
                .sorted((s1, s2) -> Integer.compare(s2.getValue(), s1.getValue()))
                .forEach(s -> System.out.printf("%s | %d%n", s.getKey(), s.getValue()));
    }

    private static void printTechnologyResults(Map<String, Integer> technologyLog) {
        System.out.println("Submissions:");
        technologyLog
                .entrySet()
                .stream()
                .sorted((t1, t2) -> Integer.compare(t2.getValue(), t1.getValue()))
                .forEach(t -> System.out.printf("%s - %d%n", t.getKey(), t.getValue()));
    }

}
