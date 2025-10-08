package com.pluralsight;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class SearchEngineLogger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        logAction("Application lunch");
        boolean running = true;

        while (running) {
            System.out.print("Enter a search term (or type \"exit\" to quit): ");
            String users_input = scanner.nextLine().trim();
            if (users_input.equals("exit")) {
                logAction("Application exited");
                System.out.println("Goodbye.");
                running = false;
            } else if (!users_input.isEmpty()) {
                logAction("User search for: " + users_input);
                System.out.println("Search for \"" + users_input + "\"....");
            }else {
                System.out.println("Please enter a valid search term.");
            }
        }
        scanner.close();
    }

    private static void logAction(String action) {
        try(PrintWriter writer = new PrintWriter(new FileWriter("logs.txt",true))) {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
            String timestamp = LocalDateTime.now().format(formatter);
            writer.printf("[%s] %s%n",timestamp,action);
        }catch (IOException e) {
            System.out.println("Error logging file: " + e.getMessage());
        }
    }
}