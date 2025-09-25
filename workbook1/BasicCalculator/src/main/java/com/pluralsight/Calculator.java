package com.pluralsight;
import java.awt.image.BandedSampleModel;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

//                  Exercise 3

// Notes: Create a Java Application named BasicCalculator that reads in two floating point numbers and then asks the user whether they want to add, subtract, multiply, or divide the two numbers.
// Notes: For this exercise, only code the questions. We won't calculate add, subtract, multiply, or divide.
// For this exercise, always multiply.

        Scanner readMeBot = new Scanner(System.in);

        System.out.print("Enter first number: ");
        float num1 = readMeBot.nextFloat();

        System.out.print("Enter second number: ");
        float num2 = readMeBot.nextFloat();

        System.out.print("Do you want to Add, Subtract, Multiply or Divide: ");
        String option = readMeBot.next();

        float answer = num1 * num2;

        System.out.printf("The answer is: " + answer);

//  Step 1

        // 1.) Perform the requested operation and display the results

        // Enter the first number: 5
        // Enter the second number: 12
        // Select multiply

        // Answer and or Solution
        // The answer is: 60.0






    }
}