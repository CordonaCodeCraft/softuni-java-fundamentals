package _08_ObjectsAndClasses.exercises._05_Students;

import java.sql.PseudoColumnUsage;

public class Student {
    private String firstName;
    private String lastName;
    private double grade;

    public Student(String firstName, String lastName, double grade) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.grade = grade;
    }

    public void printStudentData() {
        System.out.printf("%s %s: %.2f%n", firstName, lastName, grade);
    }

    public double getGrade() {
        return grade;
    }

}
