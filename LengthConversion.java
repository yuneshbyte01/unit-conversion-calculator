package Projects.UnitConversion;

import java.util.Scanner;

public class LengthConversion {
    Scanner sc = new Scanner(System.in);
    double length;
    String fromUnit;
    String toUnit;

    LengthConversion() {
        System.out.println("*********Length Conversion Begins**********");
        System.out.print("Enter the length: ");
        length = sc.nextDouble();

        System.out.print("Enter the unit to covert from (millimeter, centimeter, decimeter, meter, decameter, hectometer, kilometer, inch, feet, yard, mile): ");
        fromUnit = sc.next();

        System.out.print("Enter the unit to convert to (millimeter, centimeter, decimeter, meter, decameter, hectometer, kilometer, inch, feet, yard, mile): ");
        toUnit = sc.next();
    }

    static double lengthConversion(double value, String fromUnit, String toUnit) {
        double meter;
        switch (fromUnit.toLowerCase()) {
            case "millimeter" -> meter = value * 0.001;
            case "centimeter" -> meter = value * 0.01;
            case "decimeter" -> meter = value * 0.1;
            case "meter" -> meter = value;
            case "decameter" -> meter = value * 10;
            case "hectometer" -> meter = value * 100;
            case "kilometer" -> meter = value * 1000;
            case "inch" -> meter = value * 0.0254;
            case "feet" -> meter = value * 0.3048;
            case "yard" -> meter = value * 0.9144;
            case "mile" -> meter = value * 1609.34;
            default -> {
                return -1;
            }
        }

        double result;
        switch (toUnit.toLowerCase()) {
            case "millimeter" -> result = meter/0.001;
            case "centimeter" -> result = meter/0.01;
            case "decimeter" -> result = meter/0.1;
            case "meter" -> result = meter;
            case "decameter" -> result = meter/10;
            case "hectometer" -> result = meter/100;
            case "kilometer" -> result = meter/1000;
            case "inch" -> result = meter/0.0254;
            case "feet" -> result = meter/0.3048;
            case "yard" -> result = meter/0.9144;
            case "mile" -> result = meter/1609.34;
            default -> {
                return -1;
            }
        }

        return result;
    }

    void getResult() {
        System.out.printf("%.2f %s = %.2f %s",length,fromUnit,lengthConversion(length, fromUnit, toUnit),toUnit);
    }
}
