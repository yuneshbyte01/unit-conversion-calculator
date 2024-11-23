package Projects.UnitConversion;

import java.util.Scanner;

public class TimeConversion {

    Scanner sc = new Scanner(System.in);
    double time;
    String fromUnit;
    String toUnit;

    TimeConversion() {

        System.out.println("*********Time Conversion Begins**********");
        System.out.print("Enter time: ");
        time = sc.nextDouble();

        System.out.print("Enter the unit to covert from (millisecond, microsecond, nanosecond, picosecond, second, minute, hour, day, week, month, year): ");
        fromUnit = sc.next();

        System.out.print("Enter the unit to convert to (millisecond, microsecond, nanosecond, picosecond, second, minute, hour, day, week, month, year): ");
        toUnit = sc.next();
    }

    static double timeConversion(double value, String fromUnit, String toUnit) {

        double seconds;

        switch (fromUnit) {
            case "millisecond" -> seconds = value * 10e-2;
            case "microsecond" -> seconds = value * 10e-5;
            case "nanosecond" -> seconds = value * 10e-8;
            case "picosecond" -> seconds = value * 10e-11;
            case "second" -> seconds = value;
            case "minute" -> seconds = value * 60;
            case "hour" -> seconds = value * 3600;
            case "day" -> seconds = value * 86400;
            case "week" -> seconds = value * 604800;
            case "month" -> seconds = value * 2629743.83;
            case "year" -> seconds = value * 31556926.1;
            default -> {
                return -1;
            }
        }
        double result;

        switch (toUnit) {
            case "millisecond" -> result = seconds / 10e-2;
            case "microsecond" -> result = seconds / 10e-5;
            case "nanosecond" -> result = seconds / 10e-8;
            case "picosecond" -> result = seconds / 10e-11;
            case "second" -> result = seconds;
            case "minute" -> result = seconds / 60;
            case "hour" -> result = seconds / 3600;
            case "day" -> result = seconds / 86400;
            case "week" -> result = seconds / 604800;
            case "month" -> result = seconds / 2629743.83;
            case "year" -> result = seconds / 31556926.1;
            default -> {
                return -1;
            }
        }
        return Math.round(result);
    }

    void getResult() {
        System.out.printf("%.2f %s = %.2f %s",time,fromUnit,timeConversion(time, fromUnit, toUnit),toUnit);
    }
}
