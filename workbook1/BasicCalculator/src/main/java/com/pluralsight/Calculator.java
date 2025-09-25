package com.pluralsight;
import java.awt.image.BandedSampleModel;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

/*
                  Exercise 3
 Notes: Create a Java Application named BasicCalculator that reads in two floating point numbers and then asks the user whether they want to add, subtract, multiply, or divide the two numbers.
 Notes: For this exercise, only code the questions. We won't calculate add, subtract, multiply, or divide.
 For this exercise, always multiply.
 Calculator code
 This line initializes the Scanner function in Java
*/

        // Calculator code
        // This line initializes the Scanner function in Java
        Scanner readMeBot = new Scanner(System.in);

        // This brick of code allows the user to input their first number
        System.out.print("Enter first number: ");
        float num1 = readMeBot.nextFloat();

        // This brick of code allows the user to input there second number
        System.out.print("Enter second number: ");
        float num2 = readMeBot.nextFloat();

        // This brick allows the user to choose what operator they want to use
        System.out.print("Do you want to Add, Subtract, Multiply or Divide: ");
        String option = readMeBot.next();

        // This line equates the user's input numbers
        float answer = num1 * num2;

        // Finally this line prints the answer
        System.out.printf("The answer is: " + answer);

/*
          Step 1
         1.) Perform the requested operation and display the results
         Enter the first number: 5
         Enter the second number: 12
         Select multiply
         Answer and or Solution
         The answer is: 60.0
        */


    }
}