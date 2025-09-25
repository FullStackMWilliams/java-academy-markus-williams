package com.pluralsight;

public class movieNight {
    public static void main(String[] args) {

 //                               Mini Exercise - Movie Night

 // Exercise 1

 //step 1
 // Create a new java class with main method.

        // step 2
//  Declare variables for:

// 1.) movie title (String)
String movieTitle = "John Wick 3";

// 2.) number of friends (int)
int numOfFriends = 4;

// 3.) Pizza price per piece (double)
double pizzaSlice_perPrice = 2.99;

//. 4) Whether you have popcorn (boolean)
boolean hasPopcorn = true;


// Exercise 2
        // step 1
        // Print a short plan for your movie night.
        System.out.println(movieTitle + " starts at 7. We need to be there at 6:15 if we want pizza.");

// Exercise 3
// step 1
// Calculate and print the total pizza cost (include yourself)
int Me = 1;
        System.out.println(pizzaSlice_perPrice * (Me + numOfFriends));

// Exercise 4
// Step 1
// bonus: Use and if statement to print a fun message if there's popcorn.
         if (hasPopcorn)
             System.out.println("We made it in time to get popcorn.");
         else
             System.out.println("We didn't make it in time for popcorn");




    // exercise 5
// step 1
// now print were watching [ movie title ] with [number] friends.
// pizza costs [price] each.
// Popcorn? [true/false]
// Total pizza cost: $[calculated amount]
// Print Popcorn time! only if hasPopcorn is true





 // Bonus Challenge


        }
    }
