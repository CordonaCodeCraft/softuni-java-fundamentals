
// Judge ready

package _08_ObjectsAndClasses.exercises._06_vechile_catalogue;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CatalogueMain {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        List<Catalogue> vehicleList = new ArrayList<>();
        while (true) {
//            System.out.print("Enter vehicle data: ");
            String input = s.nextLine();
            if (input.equals("End") || vehicleList.size() == 50) {
                break;
            } else {
                populateVehicleList(vehicleList, input);
            }
        }

        while (true) {
//            System.out.print("Enter model: ");
            String input = s.nextLine();
            if (input.equals("Close the Catalogue")) {
                break;
            } else {
                printSelectedVehicle(vehicleList, input);
            }
        }

        double averageCarHP = calculateAverageCarHP(vehicleList);
        double averageTruckHP = calculateAverageTruckHP(vehicleList);

        System.out.printf("Cars have average horsepower of: %.2f.%n", averageCarHP);
        System.out.printf("Trucks have average horsepower of: %.2f.", averageTruckHP);
    }

    private static void populateVehicleList(List<Catalogue> vehicleList, String input) {
        String[] tokens = input.split("\\s+");
        String type = tokens[0];
        String model = tokens[1];
        String color = tokens[2];
        int horsePower = Integer.parseInt(tokens[3]);
        if (horsePower >= 1 && horsePower <= 1000) {
            vehicleList.add(new Catalogue(type, model, color, horsePower));
        }
    }

    private static void printSelectedVehicle(List<Catalogue> vehicleList, String input) {
        for (Catalogue current : vehicleList) {
            if (current.getModel().equals(input)) {
                current.printVehicleData();
            }
        }
    }

    private static double calculateAverageCarHP(List<Catalogue> vehicleList) {
        int totalHP = 0;
        int carsCount = 0;
        for (Catalogue current : vehicleList) {
            if (current.getType().equals("car")) {
                totalHP += current.getHorsePower();
                carsCount++;
            }
        }
        if (carsCount == 0) {
            return 0.00;
        } else {
            return totalHP * 1.0 / carsCount;
        }
    }

    private static double calculateAverageTruckHP(List<Catalogue> vehicleList) {
        int totalHP = 0;
        int trucksCount = 0;
        for (Catalogue current : vehicleList) {
            if (current.getType().equals("truck")) {
                totalHP += current.getHorsePower();
                trucksCount++;
            }
        }

        if (trucksCount == 0) {
            return 0.0;
        } else {
            return totalHP * 1.0 / trucksCount;
        }
    }
}
