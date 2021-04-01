package MidExam;

import java.util.Scanner;

public class _01_SoftUniReception {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int receptionTotalCapacityPerHour = calculateCapacity(s);
        int totalStudents = Integer.parseInt(s.nextLine());
        int hoursCounter = 0;
        int breakCounter = 3;

        while (totalStudents >= 0) {

            if (totalStudents <= 0) {
                break;
            }

            if (totalStudents > 0 && breakCounter == 0) {
                hoursCounter++;
                breakCounter = 3;
            } else {
                totalStudents -= receptionTotalCapacityPerHour;
                hoursCounter++;
                breakCounter--;
            }
        }

        System.out.printf("Time needed: %dh.", hoursCounter);

    }

    private static int calculateCapacity(Scanner s) {
        int count = 0;
        int totalStudentsPerHour = 0;
        while (++count <= 3) {
             totalStudentsPerHour +=Integer.parseInt(s.nextLine());
        }

       return  totalStudentsPerHour;
    }
}
