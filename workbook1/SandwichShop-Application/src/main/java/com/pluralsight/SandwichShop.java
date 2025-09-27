package com.pluralsight;

import java.util.Scanner;

public class SandwichShop {
    public static void main(String[] args) {
        Scanner myCashier = new Scanner(System.in);

//                          Exercise: Sandwich Shop
// Notes: This will be a point of sales application to calculate the cost of a sandwich.



// Step 1:
// Prompt hte user for the size of the sandwich (1 or 2):

        // a.) 1: Regular: base price $5.45
        System.out.println("What would you like to order?");
        System.out.println("1: A regular sandwich is $5.45");

        // b.) 2: Large: base price $8.95
        System.out.println("2: A large sandwich is $8.95 ");

       // line below checks the line above
        System.out.println("What would you like: 1 or 2");
        double customerWants = myCashier.nextDouble();

       // This line acts as a placeholder
        double customerPrice = 0.0;

// This block of code checks the user's input to give a corresponding output or error message
        if (customerWants == 1) {
            customerPrice = 5.45;
        } else if (customerWants == 2) {
            customerPrice = 8.89;
        } else
            System.out.println("Error: Enter 1 or 2 to receive price.");

        System.out.println(customerPrice);
    }
}

