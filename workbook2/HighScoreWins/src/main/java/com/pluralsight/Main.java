package com.pluralsight;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner highScore_Collector = new Scanner(System.in);

        System.out.print("Enter team name and score: ");
        String input = highScore_Collector.nextLine().trim();

        String[] gameInfo = input.split("\\|");

        if (gameInfo.length != 2) {
            System.out.println("Invalid format. (Please use Home:Visitors|21:9): ");
            highScore_Collector.close();
        }

    }
}