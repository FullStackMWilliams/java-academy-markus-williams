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
            try{
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
        System.out.println("\nType anything you want.(type exit to quit)");
        do {
            if (!myCounter.equals(Ign))
            System.out.println("This will print once, even though k = " + k);
            k--;
        } while (k > 0);
    }







    }


