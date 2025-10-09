package com.pluralsight;
import java.util.Scanner;

public class VehicleInventory {
    private static Vehicle[] inventory = new Vehicle[20];
    private static int vehicleCount = 0;
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        preloadVehicles();

        boolean running = true;
        while (running) {
            System.out.println("\nWhat do you want to do?");
            System.out.println("1 - List all Vehicles");
            System.out.println("2 - Search by make/model");
            System.out.println("3 - Search by price range?");
            System.out.println("4 - Search by color");
            System.out.println("5 - Add a vehicle");
            System.out.println("6 - Quit");
            System.out.println("Enter your command: ");

            int command = scanner.nextInt();
            scanner.nextLine();

            switch (command) {
                case 1: listAllVehicles();
                case 2: searchByMakeModel();
                case 3: searchByPriceRange();
                case 4: searchByColor();
                case 5: addVehicle();
                case 6: running = false;
                default:
                    System.out.println("Invalid command. PLease try again.");
            }
        }
        System.out.println("Goodbye!");

    }

    private static void preloadVehicles() {
        inventory[vehicleCount++] = new Vehicle(101121,"Ford Ranger","Red",45000,30000);
        inventory[vehicleCount++] = new Vehicle(111231,"Toyota Camry","blue",8000,25000);
        inventory[vehicleCount++] = new Vehicle(100234,"Honda civic","black",950000,12000);
        inventory[vehicleCount++] = new Vehicle( 100120,"Dodge Charger Hellcat red-eye", "white",1200,1200000);
        inventory[vehicleCount++] = new Vehicle(102303,"Ford mustang","blue",67000,50000);
        inventory[vehicleCount++] = new Vehicle(101234,"Chevrolet Camaro ZL1","red",8000,900000);
    }
    private static void listAllVehicles() {
        System.out.println("\nCurrent Vehicle Inventory");
        for (int i = 0; i < vehicleCount; i++) {
            System.out.println(inventory[i]);
        }
    }
    private static void searchByMakeModel() {
        System.out.println("Enter make or model to search: ");
        String searchTerm =  scanner.nextLine().toLowerCase();

        boolean found = false;
        for (int i = 0; i < vehicleCount; i++) {
            if (inventory[i].getMakeModel().toLowerCase().contains(searchTerm)) {
                System.out.println(inventory[i]);
                found = true;
            }
        }

        if (!found)
            System.out.println("No vehicles found with that make/model.");
    }

    private static void searchByPriceRange() {
        System.out.println("Enter minimum price: ");
        float min = scanner.nextFloat();
        System.out.println("Enter maximum price: ");
        float max =  scanner.nextFloat();

        boolean found = false;
        for(int i = 0; i < vehicleCount; i++) {
            if (inventory[i].getPrice() >= min && inventory[i].getPrice() <= max) {
                System.out.println(inventory[i]);
                found = true;
            }
        }
        if (!found) System.out.println("No vehicles found in that price range.");
    }
    private static void searchByColor() {
        System.out.println("Enter color to search: ");
        String color = scanner.nextLine().toLowerCase();

        boolean found = false;
        for(int i = 0; i < vehicleCount; i++) {
            if (inventory[i].getColor().toLowerCase().equals(color)) {
                System.out.println(inventory[i]);
                found = true;
            }
        }
        if (!found) System.out.println("No vehicles found with that color.");
    }

    private static void addVehicle() {
        if (vehicleCount >= inventory.length) {
            System.out.println("Inventory full. Cannot add more vehicles.");
            return;
        }
        System.out.println("Enter Vehicle ID: ");
        long id = scanner.nextLong();
        scanner.nextLine();

        System.out.println("Enter Make/Model: ");
        String makeModel = scanner.nextLine();

        System.out.println("Enter color: ");
        String color = scanner.nextLine();

        System.out.println("Enter Odometer Reading: ");
        int odometer = scanner.nextInt();

        System.out.println("Enter price: ");
        float price = scanner.nextFloat();

        Vehicle newVehicle = new Vehicle(id,makeModel,color,odometer,price);
        inventory[vehicleCount++] = newVehicle;

        System.out.println(" Vehicle added successfully.");

    }
}