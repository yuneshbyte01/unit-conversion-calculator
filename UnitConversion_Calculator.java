package Projects.UnitConversion;

import java.util.Scanner;

public class UnitConversion_Calculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice;

        do { 
            displayMenu();
            System.out.print("Which conversion do you want? ");
            choice = sc.nextInt();

            switch (choice) {
                case 1 -> {
                    LengthConversion length = new LengthConversion();
                    length.getResult();
                    System.out.println();
                    }
                case 2 -> {
                    WeightConversion weight = new WeightConversion();
                    weight.getResult();
                    System.out.println();
                    }
                case 3 -> {
                    TempConversion temperature = new TempConversion();
                    temperature.getResult();
                    System.out.println();
                    }
                case 4 -> {
                    TimeConversion time = new TimeConversion();
                    time.getResult();
                    System.out.println();
                    }
                case 5 -> {
                    DataStorageConversion data = new DataStorageConversion();
                    data.getResult();
                    System.out.println();
                    }
                case 6 -> System.out.println("Exiting.....");
                default -> {
                    return;
                }
            }
        } while (choice != 6);
    }

    public static void displayMenu() {
        System.out.println("<---------- Unit Conversion Calculator ---------->");
        System.out.println("1. Length Conversion");
        System.out.println("2. Weight Conversion");
        System.out.println("3. Temperature Conversion");
        System.out.println("4. Time Conversion");
        System.out.println("5. Data Storage Conversion");
        System.out.println("6. Exit");
    }
}
