package com.pluralsight;
import java.util.Random;

public class MathApp {
    public static void main(String[] args) {

//                             Exercise 3

//           Step 1

        // Write code to find answers to the following questions

        // NOTES: Coding is not just about solving equations, your code should be legible and meaningful.
        // Use comment and line spacing to visually separate each question.

//  Questions:

        // 1.) Create two variables to represent the salary for Bob and Gray, name them  bobSalary and graySalary.
        // Create a new variable named highestSalary.
        // Determine whose salary is greater using Math.max() and store the answer in highestSalary.
        // Set the initial salary variables to any value you want.
        // Print the answer (i.e " The highest salary is...)

        double bobSalary = 46000.00;
        double graySalary = 53000.00;
        double highestSalary = Math.max(graySalary, bobSalary);
        System.out.println(highestSalary);

        // 2.) Find and display the smallest of two variables named carPrice and truckPrice.
        // Set the variables to any value you want.

        double carPrice = 35000.00;
        double truckPrice = 26000.00;
        double cheapestCar = Math.min(carPrice, truckPrice);
        System.out.println(cheapestCar);

        // 3.) Find and display the area of a circle whose radius is 7.25

        double circle = 7.25;
        double solution = Math.PI * circle * circle;
        System.out.println(solution);

        // 4.) Find and display the square root a variable after it is set to "5.0".

        double myNumber = 5.0;
        double answer1 = Math.sqrt(myNumber);
        System.out.println(answer1);

        // 5.) Find and display the distance between the points (5,10) and (85,50).

        double x1 = 5;
        double x2 = 85;
        double y1 = 10;
        double y2 = 50;

        double distance = Math.hypot(x2 - x1, y2 - y1);
        System.out.println("The distance between the two points is: " + distance);

         // 6.) Find and display the absolute (positive) value of a variable after it is set to -3.8.

        double myValue = -3.8;
        double absoluteValue = Math.abs(myValue);
        System.out.println(absoluteValue);

        // 7.) Find and display a random number between 0 and 1

        // I first imported java.util.Random
        double myRandomNum = Math.random();
        System.out.println("Display random number: " + myRandomNum);

        // 8.)  Calculate how many minutes are in 24 days, use a variable for each value you calculate with.


        int numOfDays = 24;
        int hoursInDay = 24;
        int minInHour = 60;

        long minIn24Days = numOfDays * hoursInDay * minInHour;
        System.out.println("There are " + minIn24Days + " minutes in 24 days.");

        // BONUS: How many milliseconds?

        int secInMinutes = 60;
        int milliInSeconds = 1000;
        long milliIn24Days = numOfDays * hoursInDay * minInHour * secInMinutes * milliInSeconds;
        System.out.println("There are " + milliIn24Days + " milliseconds in 24 days.");

    }
    }
