package Projects.UnitConversion;

import java.util.Scanner;

public class DataStorageConversion {

    Scanner sc = new Scanner(System.in);
    double value;
    String fromUnit;
    String toUnit;

    DataStorageConversion() {

        System.out.println("*********Data Storage Conversion Begins**********");
        System.out.print("Enter the value: ");
        value = sc.nextDouble();

        System.out.print("Enter the unit to covert from (bit, kilobit, megabit, kilobit, gigabit, terabit, petabit, byte, kilobyte, megabyte, gigabyte, terabyte, petabyte): ");
        fromUnit = sc.next();

        System.out.print("Enter the unit to convert to (bit, kilobit, megabit, kilobit, gigabit, terabit, petabit, byte, kilobyte, megabyte, gigabyte, terabyte, petabyte): ");
        toUnit = sc.next();

    }

    static double datastorageConversion(double value, String fromUnit, String toUnit){
        double megabyte;
        switch (fromUnit.toLowerCase()) {
            case "byte" -> megabyte = value / 1e6;
            case "kilobyte" -> megabyte = value / 1000;
            case "megabyte" -> megabyte = value;
            case "gigabyte" -> megabyte = value * 1000;
            case "terabyte" -> megabyte = value * 1000000;
            case "petabyte" -> megabyte = value * 1000000000;
            case "bit" -> megabyte = value / (8 * 1e6);
            case "kilobit" -> megabyte = value / (8 * 1000);
            case "megabit" -> megabyte = value / 8;
            case "gigabit" -> megabyte = value * 125;
            case "terabit" -> megabyte = value * 125000;
            case "petabit" -> megabyte = value * 125000000;
            default -> {
                return -1;
            }
        }
        double result;
        switch (toUnit.toLowerCase()) {
            case "byte" -> result = megabyte * 1e6;
            case "kilobyte" -> result = megabyte * 1000;
            case "megabyte" -> result = megabyte;
            case "gigabyte" -> result = megabyte / 1000;
            case "terabyte" -> result = megabyte / 1000000;
            case "petabyte" -> result = megabyte / 1000000000;
            case "bit" -> result = megabyte * (8 * 1e6);
            case "kilobit" -> result = megabyte * (8 * 1000);
            case "megabit" -> result = megabyte * 8;
            case "gigabit" -> result = megabyte / 125;
            case "terabit" -> result = megabyte / 125000;
            case "petabit" -> result = megabyte / 125000000;
            default -> {
                return -1;
            }
        }
        return result;
    }

    void getResult() {
        System.out.printf("%.4f %s = %.4f %s",value,fromUnit,datastorageConversion(value, fromUnit, toUnit),toUnit);
    }
}
