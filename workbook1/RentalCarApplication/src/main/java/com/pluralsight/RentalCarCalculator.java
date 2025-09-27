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
        System.out.println("Would you like to add a toll tag for $3.95 extra a day?: ");
        boolean tollTag = infoCollector.nextBoolean();

        // d.) Whether they want a GPS at $2.95/day (yes/no)
        System.out.println("Would you like to add GPS for $2.95 extra a day?: ");
        boolean wantsGPS = infoCollector.nextBoolean();

        // e.) Whether they want roadside assistance at $3.95/day (yes/no)
        System.out.println("Would you like to add Roadside Assistance for $3.95 extra a day?: ");
        boolean wantsRoadside = infoCollector.nextBoolean();

        // f.) Their current age
        System.out.println("Enter your age: ");
        int rentersAge = infoCollector.nextInt();

    }
}