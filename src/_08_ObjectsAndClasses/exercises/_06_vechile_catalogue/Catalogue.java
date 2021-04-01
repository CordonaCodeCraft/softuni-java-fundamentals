package _08_ObjectsAndClasses.exercises._06_vechile_catalogue;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.spi.AbstractResourceBundleProvider;

public class Catalogue {
    private String type;
    private String model;
    private String color;
    private int horsePower;

    public Catalogue(String type, String model, String color, int horsePower) {
        this.type = type;
        this.model = model;
        this.color = color;
        this.horsePower = horsePower;
    }

    public void printVehicleData() {
        System.out.printf("Type: %s%n", this.type.substring(0, 1).toUpperCase() + this.type.substring(1));
        System.out.printf("Model: %s%n", this.model);
        System.out.printf("Color: %s%n", this.color);
        System.out.printf("Horsepower: %d%n", this.horsePower);
    }

    public String getModel() {
        return this.model;
    }

    public String getType() {
        return this.type;
    }

    public double getHorsePower() {
        return this.horsePower;
    }


}
