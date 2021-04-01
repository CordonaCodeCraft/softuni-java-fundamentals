
// Judge ready

package _09_AssociativeArrays.exercises;

import java.util.*;


public class _07_StudentAcademy {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Map<String, List<Double>> studentsGradesDataBase = new LinkedHashMap<>();
        int count = Integer.parseInt(s.nextLine());
        String studentName = " ";
        for (int i = 0; i < count * 2; i++) {
            String input = s.nextLine();
            try {
                double grade = Double.parseDouble(input);
                studentsGradesDataBase.get(studentName).add(grade);
            } catch (NumberFormatException nfe) {
                studentsGradesDataBase.putIfAbsent(input, new ArrayList<>());
                studentName = input;
            }
        }
        filterStudentsGradesDataBase(studentsGradesDataBase);


    }

    private static void filterStudentsGradesDataBase(Map<String, List<Double>> studentsGradesDataBase) {
        studentsGradesDataBase
                .entrySet()
                .stream()
                .filter(e -> filterByAverageGradeThreshold(e))
                .sorted((e1, e2) -> sortByMaxAverageGrade(e1, e2))
                .forEach(e -> System.out.printf("%s -> %.2f%n", e.getKey(), e.getValue().get(e.getValue().size() - 1)));


    }

    private static int sortByMaxAverageGrade(Map.Entry<String, List<Double>> e1, Map.Entry<String, List<Double>> e2) {
        return Double.compare(e2.getValue().get(e2.getValue().size() - 1), e1.getValue().get(e1.getValue().size() - 1));
    }

    private static boolean filterByAverageGradeThreshold(Map.Entry<String, List<Double>> e) {
        OptionalDouble product = e.getValue()
                .stream()
                .mapToDouble(Double::doubleValue)
                .average();
        double averageGrade = product.getAsDouble();
        e.getValue().add(averageGrade);
        return averageGrade >= 4.50;

    }

}


