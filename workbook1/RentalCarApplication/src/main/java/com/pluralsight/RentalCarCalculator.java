package com.pluralsight;

import java.util.Scanner;

public class RentalCarCalculator {

//                    Exercise: Rental Car Company

    public static void main(String[] args) {

// Step 1: Create a Java application named RentalCarCalculator that estimates the
// cost of reserving a rental car. Prompt the user for the following information
        // This line will create the scanner to then collect users info
        Scanner infoCollector = new Scanner(System.in);

        // a.) Pickup date (store as a String)
        System.out.println("Enter pick up date (Ex. (9/26/2025): ");
        String pickUpDate = infoCollector.next();

        // b.) Number of days for the actual rental
        System.out.println("Enter the number of days you will be renting: ");
        int daysRented = infoCollector.nextInt();

        // c.) Whether they want an electronic toll tag at $3.95/day (yes/no)
        System.out.println("Would you like to add a toll tag for $3.95 extra a day? (yes/no): ");
        String tollTag = infoCollector.next();

        // d.) Whether they want a GPS at $2.95/day (yes/no)
        System.out.println("Would you like to add GPS for $2.95 extra a day? (yes/no): ");
        String wantsGPS = infoCollector.next();

        // e.) Whether they want roadside assistance at $3.95/day (yes/no)
        System.out.println("Would you like to add Roadside Assistance for $3.95 extra a day? (yes/no): ");
        String wantsRoadside = infoCollector.next();

        // f.) Their current age
        System.out.println("Enter your age: ");
        int rentersAge = infoCollector.nextInt();

// Step 2: Calculate and display

        // a.) Basic car rental
        double rentalBaseRate = 29.99;
        double rentalCost = rentalBaseRate * daysRented;

        // b.) Options cost
        double tollTagCost = 0.0;
        double gpsCost = 0.0;
        double roadSideCost = 0.0;

        if (tollTag.equals("yes")){
            tollTagCost = 3.95 * daysRented;
        }
        if (wantsGPS.equals("yes")) {
            gpsCost = 2.95 * daysRented;
        }
        if (wantsRoadside.equals("yes")){
            roadSideCost = 3.95 * daysRented;
        }
        double optionsCost = tollTagCost + gpsCost + roadSideCost;

        // c.) Underage driver surcharge
        double underAgeSurcharge = 0.0;
        if (rentersAge<25)
            underAgeSurcharge = rentalBaseRate * 0.3;

        // d.) Total cost
        double totalCost = rentalCost + optionsCost + underAgeSurcharge;

        // e.) Display
        System.out.println("====Rental Car Estimate===");
        System.out.println("Pickup Date: " + pickUpDate);
        System.out.printf("Basic Car Rentals: $%.2f%n", rentalCost);
        System.out.printf("Options Cost: $%.2f%n",optionsCost);
        System.out.printf("Underage SurCharge: $%.2f%n", underAgeSurcharge);
        System.out.println("------------------------------");
        System.out.printf("Total cost: $%.2f%n", totalCost);

    }
}