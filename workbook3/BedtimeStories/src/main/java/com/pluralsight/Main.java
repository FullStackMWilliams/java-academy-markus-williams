package com.pluralsight;

import java.util.Scanner;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lineNumber = 1;


        System.out.println("Type a bed time story name out of the following 3 stories.");
        System.out.println("1.Goldilocks.txt");
        System.out.println("2.Hansel_and_Gretel.txt");
        System.out.println("3.Mary_had_a_Little_Lamb");
        String fileName = scanner.nextLine();

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;

            while ((line = reader.readLine()) != null) {
                System.out.println(lineNumber + ". " + line);
                lineNumber++;
            }

        }catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
            System.out.println("Please make sure the file is in the same folder as the program.");
        }
        scanner.close();

    }
}