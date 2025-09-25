package com.pluralsight;

import java.util.Scanner;

public class movieNight {
    public static void main(String[] args) {

//                                Mini Exercise - Movie Night

//   Exercise 1

        // Step 1: Create a new java class with main method. (Remember to change class name. Ex: "movieNight")

        //  Step 2: Declare variables for:

// 1.) movie title (String)
        String movieTitle = "John Wick 3";

// 2.) number of friends (int)
        int numOfFriends = 4;

// 3.) Pizza price per piece (double)
        double pizzaSlice_perPrice = 2.99;

//. 4) Whether you have popcorn (boolean)
        boolean hasPopcorn = true;


//   Exercise 2

        // Step 1: Print a short plan for your movie night.

        System.out.println(movieTitle + " starts at 7. We need to be there at 6:15 if we want pizza.");

//   Exercise 3

        // Step 1: Calculate and print the total pizza cost (include yourself)

        int Me = 1;
        System.out.println(pizzaSlice_perPrice * (Me + numOfFriends));

//   Exercise 4

        // Step 1
// bonus: Use and if statement to print a fun message if there's popcorn.
        if (hasPopcorn) {
            System.out.println("We made it in time to get popcorn.");
        } else {
            System.out.println("We didn't make it in time for popcorn");
        }

//   Exercise 5

        // Step 1
// Now print were watching [ movie title ] with [number] friends.
        System.out.println("We're watching " + movieTitle + " with " + numOfFriends + " friends." );

// Print pizza costs [price] each.
        System.out.println(pizzaSlice_perPrice);

// Popcorn? [true/false]
        System.out.println(hasPopcorn);

// Total pizza cost: $[calculated amount]
        System.out.println("$" + (pizzaSlice_perPrice * numOfFriends));

// Print Popcorn time! only if hasPopcorn is true
        if (hasPopcorn) {
            System.out.println("Popcorn time!");
        } else {
            System.out.println("No popcorn");
        }

//         Bonus Challenges: Scanner Practice

        // Creating a scanner object
        Scanner myScanner = new Scanner(System.in);

// Challenge 1: Use a scanner to ask the user

        // a.) Movie title
        System.out.println("Enter favorite movie: ");
        String userMovie_title = myScanner.next();

        // b. Number of friends
        System.out.println("How many friends are going? ");
        int usersFriends = myScanner.nextInt();

        // c.) Pizza price per piece
        System.out.println("How much is each slice of pizza");
        float usersPizza_price_perSlice = myScanner.nextFloat();

        // d.) whether there's popcorn or not
        System.out.println("Is there popcorn? (true/false) ");
        boolean usersHas_popcorn = myScanner.nextBoolean();

// Challenge 2: Round the pizza cost

        // a.) Rounded pizza cost
        double usersPizza_cost = usersPizza_price_perSlice * usersFriends;
        System.out.println(Math.round(usersPizza_cost));

// Challenge 3: Dynamic message

        // a.) Write if/else state if pizza is above 30
        if (usersPizza_cost>30)
            System.out.println("Whoa! that's expensive pizza.");
        else
            System.out.println("Nice budget-friendly movie night");

// Challenge 4: Add drinks

        // a.) Add a drink price variable
        double drinkPrice = 4.99;
        double total$_ofMovieNight = usersPizza_cost + (drinkPrice * usersFriends);
        System.out.println(Math.round(total$_ofMovieNight));

// Challenge 5: String Formatting

        // a.) Use String formatting to create a nice output Ex.: "Movie: Scary movie 3 | Number of guest: 4 | Total cost: $45.63

    }
}