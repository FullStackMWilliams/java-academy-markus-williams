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
            System.out.println();
        }

    }
}