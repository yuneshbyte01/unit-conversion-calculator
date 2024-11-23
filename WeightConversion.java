package Projects.UnitConversion;

import java.util.Scanner;

public class WeightConversion {
    Scanner sc = new Scanner(System.in);
    double weight;
    String fromUnit;
    String toUnit;

    WeightConversion() {

        System.out.println("*********Weight Conversion Begins**********");
        System.out.print("Enter weight: ");
        weight = sc.nextDouble();

        System.out.print("Enter the unit to covert from (milligram, centigram, decigram, gram, decagram, hectogram, kilogram, ton, pound, ounce): ");
        fromUnit = sc.next();

        System.out.print("Enter the unit to convert to (milligram, centigram, decigram, gram, decagram, hectogram, kilogram, ton, pound, ounce): ");
        toUnit = sc.next();

    }

    static double weightConversion(double value, String fromUnit, String toUnit) {

        double kilogram;
        switch (fromUnit.toLowerCase()) {
            case "milligram" -> kilogram = value * 1 / 1000000;
            case "centigram" -> kilogram = value * 1 / 100000;
            case "decigram" -> kilogram = value * 1 / 10000;
            case "gram" -> kilogram = value * 1 / 1000;
            case "decagram" -> kilogram = value * 1 / 100;
            case "hectogram" -> kilogram = value * 1 / 10;
            case "kilogram" -> kilogram = value;
            case "ton" -> kilogram = value * 1000;
            case "pound" -> kilogram = value * 0.453592;
            case "ounce" -> kilogram = value * 3.78541;
            default -> {
                return -1;
            }
        }
        double result;
        switch (toUnit.toLowerCase()) {
            case "milligram" -> result = kilogram * 1000000;
            case "centigram" -> result = kilogram * 100000;
            case "decigram" -> result = kilogram * 10000;
            case "gram" -> result = kilogram * 1000;
            case "decagram" -> result = kilogram * 100;
            case "hectogram" -> result = kilogram * 10;
            case "kilogram" -> result = kilogram;
            case "ton" -> result = kilogram / 1000;
            case "pound" -> result = kilogram / 0.453592;
            case "ounce" -> result = kilogram / 3.78541;
            default -> {
                return -1;
            }
        }
        return result;
    }

    void getResult() {
        System.out.printf("%f %s = %f %s",weight,fromUnit,weightConversion(weight, fromUnit, toUnit),toUnit);
    }
}
