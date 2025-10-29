package com.pluralsight;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Asset> assets = new ArrayList<>();

        House myHouse = new House("My house", "2025-03-26", 450000.00, "123 Sunset Blvd, Los Angeles", 1,5000, 15000);
        assets.add(myHouse);

        House VacaHome = new House("Vacation Home","2025-07-19",1200000.00,"369 Tesla Rd, Brentwood",1,15000,35000);
        assets.add(VacaHome);

        Vehicle myCar = new Vehicle("My car", "2020-08-16",260000.00,"Honda Accord", 2021, 85000);
        assets.add(myCar);

        Vehicle marksTruck = new Vehicle("Mark's Truck", "2018-05-29",54000.00,"Dodge Ram", 2018,123000);
        assets.add(marksTruck);

        Vehicle olderCar = new Vehicle("Classic car", "1999-02-23",10000,"Toyota Camry",1998,2100000);
        assets.add(olderCar);



        // Display all assets
        System.out.println("=".repeat(80));
        System.out.println("ASSET PORTFOLIO SUMMARY");
        System.out.println("=".repeat(80));

        double totalOriginalCost = 0;
        double totalCurrentValue = 0;

        for (Asset asset : assets) {
            System.out.println("\nDescription: " + asset.getDescription());
            System.out.println("Date Acquired: " + asset.getDateAcquired());
            System.out.printf("Original Cost: $%,.2f%n", asset.getOriginalCost());
            System.out.printf("Current Value: $%,.2f%n", asset.getValue());

            // Use instanceof to detect type and display specific information
            if (asset instanceof House) {
                House house = (House) asset; // Downcast to House
                System.out.println("Address: " + house.getAddress());
                String conditionStr = "";
                switch(house.getCondition()) {
                    case 1: conditionStr = "Excellent"; break;
                    case 2: conditionStr = "Good"; break;
                    case 3: conditionStr = "Fair"; break;
                    case 4: conditionStr = "Poor"; break;
                }
                System.out.println("Condition: " + conditionStr);
                System.out.println("Square Footage: " + house.getSquareFoot() + " sq ft");
                System.out.println("Lot Size: " + house.getLotSize() + " sq ft");
            } else if (asset instanceof Vehicle) {
                Vehicle vehicle = (Vehicle) asset; // Downcast to Vehicle
                System.out.println("Year/Make/Model: " + vehicle.getYear() + " " + vehicle.getMakeModel());
                System.out.printf("Odometer: %,d miles%n", vehicle.getOdometer());
            }

            totalOriginalCost += asset.getOriginalCost();
            totalCurrentValue += asset.getValue();

            System.out.println("-".repeat(80));
        }

        // Display totals
        System.out.println("\n" + "=".repeat(80));
        System.out.printf("TOTAL ORIGINAL COST: $%,.2f%n", totalOriginalCost);
        System.out.printf("TOTAL CURRENT VALUE: $%,.2f%n", totalCurrentValue);
        System.out.printf("NET CHANGE: $%,.2f%n", (totalCurrentValue - totalOriginalCost));
        System.out.println("=".repeat(80));
    }
}