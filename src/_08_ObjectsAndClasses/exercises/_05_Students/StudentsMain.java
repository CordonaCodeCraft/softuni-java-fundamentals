// Judge ready

package _08_ObjectsAndClasses.exercises._05_Students;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class StudentsMain {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter count: ");
        int count = Integer.parseInt(s.nextLine());
        List<Student> studentsList = new ArrayList<>();

        for (int i = 0; i < count; i++) {
            populateStudentsList(studentsList, s.nextLine());
        }

        List<Student> sortedByGrade = studentsList
                .stream()
                .sorted(Comparator.comparing(Student::getGrade).reversed())
                .collect(Collectors.toList());

        printSortedList(sortedByGrade);
    }

    private static void populateStudentsList(List<Student> studentsList, String nextLine) {
        String[] tokens = nextLine.split("\\s+");
        String firstName = tokens[0];
        String lastName = tokens[1];
        double grade = Double.parseDouble(tokens[2]);
        studentsList.add(new Student(firstName, lastName, grade));
    }

    private static void printSortedList(List<Student> sortedByGrade) {
        for (Student student : sortedByGrade) {
            student.printStudentData();
        }
    }
}
