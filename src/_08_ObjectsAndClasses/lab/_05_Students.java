
// Judge ready

package _08_ObjectsAndClasses.lab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _05_Students {
    private String firstName;
    private String lastName;
    private int age;
    private String town;

    public _05_Students(String firstName, String lastName, int age, String town) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.town = town;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        List<_05_Students> studentsList = new ArrayList<>();
        while (true) {
//            System.out.print("Enter input: ");
            String input = s.nextLine();
            if (input.equals("end")) {
                break;
            } else {
                String[] tokens = input.split("\\s+");
                String firstName = tokens[0];
                String secondName = tokens[1];
                int age = Integer.parseInt(tokens[2]);
                String town = tokens[3];
                String[] studentExistence = ConfirmStudentExistence(studentsList, firstName, secondName);
                if (studentExistence.length > 1) {
                    int studentIndex = Integer.parseInt(studentExistence[4]);
                    updateStudentInformation(studentsList, studentIndex, age, town);
                } else {
                    studentsList.add(new _05_Students(firstName, secondName, age, town));
                }
            }
        }

//        System.out.print("Enter city: ");
        String city = s.nextLine();

        for (_05_Students student : studentsList) {
            boolean cityMatch = student.town.equals(city);
            if (cityMatch) {
                System.out.printf("%s %s is %d years old%n", student.getFirstName(), student.getLastName(), student.getAge());
            }
        }
    }

    private static String[] ConfirmStudentExistence(List<_05_Students> studentsList, String firstName, String secondName) {
        String studentStatus = "";
        for (int i = 0; i < studentsList.size(); i++) {
            _05_Students student = studentsList.get(i);
            if (student.getFirstName().equals(firstName) && student.getLastName().equals(secondName)) {
                studentStatus = String.format("Student found at index %d", i);
                break;
            }
        }
        return studentStatus.split(" ");
    }

    private static void updateStudentInformation(List<_05_Students> studentsList, int studentIndex, int age, String town) {
        _05_Students student = studentsList.get(studentIndex);
        student.setAge(age);
        student.setTown(town);
    }
}
