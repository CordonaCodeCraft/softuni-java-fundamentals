
// Judge ready

package _09_AssociativeArrays.exercises;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class _05_SoftuniParking {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Map<String, String> parkingLog = new LinkedHashMap<>();
        int count = Integer.parseInt(s.nextLine());
        for (int i = 0; i < count; i++) {
            String[] input = s.nextLine().split("\\s+");
            String command = input[0];
            String name = input[1];
            switch (command) {
                case "register":
                    String plate = input[2];
                    if (!parkingLog.containsKey(name)) {
                        parkingLog.put(name, plate);
                        System.out.printf("%s registered %s successfully%n", name, plate);
                    } else {
                        System.out.printf("ERROR: already registered with plate number %s%n", plate);
                    }
                    break;
                case "unregister":
                    if (parkingLog.containsKey(name)) {
                        parkingLog.remove(name);
                        System.out.printf("%s unregistered successfully%n", name);
                    } else {
                        System.out.printf("ERROR: user %s not found%n", name);
                    }
                    break;
            }
        }
        printResult(parkingLog);
    }

    private static void printResult(Map<String, String> parkingLog) {
        for (String user : parkingLog.keySet()) {
            System.out.printf("%s => %s%n", user, parkingLog.get(user));
        }
    }
}
