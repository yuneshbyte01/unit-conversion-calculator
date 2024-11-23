package Projects.UnitConversion;

import java.util.Scanner;

public class TempConversion {

    Scanner sc = new Scanner(System.in);
    double temp;
    String fromUnit;
    String toUnit;

    TempConversion() {

        System.out.println("*********Temperature Conversion Begins**********");
        System.out.print("Enter temperature: ");
        temp = sc.nextDouble();

        System.out.print("Enter the unit to convert form (celsius, fahrenheit, kelvin): ");
        fromUnit = sc.next();

        System.out.print("Enter the unit to convert to (celsius or fahrenheit, kelvin): ");
        toUnit = sc.next();
    }

    static double tempConversion(double value, String fromUnit, String toUnit) {

        double celsius;
        switch (fromUnit) {
            case "fahrenheit" -> celsius = (value - 32) * 5 / 9;
            case "celsius" -> celsius = value;
            case "kelvin" -> celsius = value - 273.15;
            default -> {
                return -1;
            }
        }
        double result;
        switch (toUnit) {
            case "fahrenheit" -> result = (celsius * 9 / 5) + 32;
            case "celsius" -> result = value;
            case "kelvin" -> result = celsius + 273.15;
            default -> {
                return -1;
            }
        }
        return result;
    }

    void getResult() {
        System.out.printf("%.2f %s = %.2f %s",temp,fromUnit,tempConversion(temp, fromUnit, toUnit),toUnit);
    }
}
