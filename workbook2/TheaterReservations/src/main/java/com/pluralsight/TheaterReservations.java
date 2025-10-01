package com.pluralsight;

import java.time.LocalDate;
import java.util.Scanner;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class TheaterReservations {
    public static void main(String[] args) {

        Scanner myMovie_Clerk = new Scanner(System.in);

        System.out.println("Please enter your name: ");
        String fullName = myMovie_Clerk.nextLine().trim();

        String[] nameParts = fullName.split("\\s+");
        if (nameParts.length < 2) {
            System.out.println("Invalid name format. Please include both first and last name.");
            myMovie_Clerk.close();
            return;
        }
        String firstName = nameParts[0];
        String lastName = nameParts[nameParts.length - 1];

        System.out.println("What date will you be coming (MM/dd/YYYY): ");
        String dateInformation = myMovie_Clerk.nextLine().trim();

        if (!dateInformation.matches("\\d{1,2}/\\d{1,2}/\\d{4}")) {
            System.out.println("Invalid date format. Please use MM/dd/yyyy.");
            myMovie_Clerk.close();
            return;

        }

        String[] dateParts = dateInformation.split("/");
        int month = Integer.parseInt(dateParts[0]);
        int day = Integer.parseInt(dateParts[1]);
        int year = Integer.parseInt(dateParts[2]);

        if (month < 1 || month > 12 || day < 1 || day > 31 ) {
            System.out.println("Invalid date values. Please enter a valid month/day.");
            myMovie_Clerk.close();
            return;
        }

        LocalDate showDate = LocalDate.of(year, month, day);

        System.out.println("How many tickets would you like? ");
        int ticketCount = myMovie_Clerk.nextInt();

        String ticketWord = (ticketCount == 1) ? "ticket":"tickets";

        System.out.println(ticketCount + " " + ticketWord + " reserved for " + showDate + " under " + lastName + ", " + firstName);
        myMovie_Clerk.close();

    }
}