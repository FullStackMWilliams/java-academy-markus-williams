package com.pluralsight;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Mini-Exercise: Create a loop that will display this 10 times including the nr.: "1. I will be a good developer".
        // 2. "I will be a good developer

        for (int i = 1; i <= 10; i++) {
            System.out.println("I will be a good developer");
        }


        // exercise 2: write a program that uses a for loop to print the numbers from 81 down to 1. For each number, display
        //
        for (int counter = 81; counter >= 1; counter--)
            System.out.println(counter + " more days left at Year Up untied");


        // 1. FOR LOOP
        // Use when you know how many times you want to repeat
        System.out.println("For Loop: Counting from 1 to 5");
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0)
                System.out.println("Even Iteration " + i);
        }

        // 2. WHILE LOOP
        // Use when you don't know how many times in advance
        System.out.println("\nWhile Loop: Counting down from 5");
        int j = 5;
        while (j > 0) {
            System.out.println("Countdown: " + j);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            j--;
        }

        // 3. DO...WHILE LOOP
        // Always runs at least once, even if condition is false
        Scanner myCounter = new Scanner(System.in);
        String input;
        do {
            System.out.println("\nType anything you want on the next line.(type exit to quit):");
            input = myCounter.nextLine();
        } while (!input.equalsIgnoreCase("exit"));

        validateEmails("mwilliams@my.yearupunited.org");

    }

    public static void validateEmails (String myEmail_address) {

        Scanner emailClerk = new Scanner(System.in);
        myEmail_address = "rmailijard@yearup,org";

        System.out.println("Enter your email address: ");
        String correctEmail = emailClerk.next();
        if (correctEmail.equalsIgnoreCase(myEmail_address))
            System.out.println("correct email address!");
        else
            System.out.println("wrong email.Retry.");




        Boolean isThisValid = ValidateEmailAdres("rmailjard@sasa.org");

        ValidateEmailAdres("rmailjard@yEARup.OrG");
        ValidateEmailAdres("rmailjard@yxxxxxRup.OrG");
        ValidateEmailAdres("rmailjard@yxxxxxRup.OrG");
        ValidateEmailAdres("rmailjard@yxxxxxRup.OrG");
        ValidateEmailAdres("rmailjard@yxxxxxRup.OrG");

        LogginChecker();



    }

    private static void LogginChecker() {

        Scanner read = new Scanner(System.in);

        System.out.println("What is your password");
        String password = read.nextLine();
        String correctPassword = "1234";
        if(password.equals(correctPassword))
        {
            System.out.println("That is correct, you are logged in");
        }
        else
        {
            System.out.println("That is incorrect, try again");
        }

    }

    public static Boolean ValidateEmailAdres(String mail) {

        boolean isValid;
        String lowercased = mail.toLowerCase();
        int AtPosition = lowercased.indexOf("@");//9
        String extraction = lowercased.substring(AtPosition + 1);//cuts the text between 0 and 9
        System.out.println(extraction);

        if (extraction.equals("yearup.org")) {
            isValid = true;
        }
        else
        {
            isValid = false;
        }
        return isValid;


    }
}






