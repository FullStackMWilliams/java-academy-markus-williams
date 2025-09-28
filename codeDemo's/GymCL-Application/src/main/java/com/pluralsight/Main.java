package com.pluralsight;
import java.util.Scanner;
/*
                                    Exercise: "Gym" Command-Line Application
 Today I will build a command line application modeled after the last exercise in workbook 1.
 Follow along and use your own variables to practice building a Command-Line Application and java fundamentals.
 Developers instructions: Create a Command line Application that prompts/displays users about sign-up and sign-up cost.
*/

public class Main {
    public static void main(String[] args) {

        // Here I introduced a scanner called gymClerk. This will read the new member's input.
        Scanner gymClerk = new Scanner(System.in);

        // Here I will declare some essential variable for this project

// Step 1: Prompt the user for the following information:

        // a.) Whether user wants to sign-up for a gym membership or not (yes/no) include membership price per month:
        // Include 3-tiers of gym memberships Ex. Bronze,Silver,Gold.:
        System.out.println("Would you like to sign up for a membership today? (yes/no): ");
        String wantsMembership = gymClerk.next();

        System.out.println("Would you like to sign-up for our Bronze package for $35? (yes/no): ");
        String bronzePackage = gymClerk.next();

        System.out.println("would you like to sign up for our Silver package for $55? (yes/no): ");
        String silverPackage = gymClerk.next();

        System.out.println("Would you like to sign-up for our Gold package for $85? (yes/no): ");
        String goldPackage = gymClerk.next();

        // b.) Membership start date (Ex. (9/29/30)):
        System.out.println("Enter today's date (Ex. 9/17/2025): ");
        String signUpDate = gymClerk.next();

        // c.) Member's age:
        System.out.println("Enter your age: ");
        int membersAge = gymClerk.nextInt();

        // d.) If member would like to add a guest pass (yes/no):
        System.out.println("Would you like to add a guest pass for an additional $10 a month (yes/no): ");
        String wantsGuestPass = gymClerk.next();

        // e.) If member wants a personal trainer (yes/no):
        System.out.println("Would you like a personal trainer 3 days a week for an additional $80? a month (yes/no: ");
        String wantsPt = gymClerk.next();

        // f.) If member wants to sign-up for Gym-classes (yes/no):
        System.out.println("Would you like to sign up for Gym-classes for an additional $50? (yes/no): ");
        String wantsClasses = gymClerk.next();

        // g.) If member is a student and or 25 or younger apply 25% discount
        System.out.println("Are you currently enrolled in school? (yes/no): ");
        String memberEnrolled = gymClerk.next();



// Step 2: Calculate and display the following:

        // a.)
        // b.)
        // c.)
        // d.)
        // e.)
    }
}

// Step 3 now in a separate class lets practice methods and oop. Analyze your code and see what process(es) you can turn
// into methods to make your code more maintainable. Also include if/else statements on the membership tiers.
// Include a boolean survey for the member to take after signing up