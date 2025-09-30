package com.pluralsight;
import java.util.Scanner;
public class FullNameApplication {
    public static void main(String[] args) {

        Scanner nameCollector = new Scanner(System.in);


        System.out.println("Enter your name");

        System.out.print("First name: ");
        String firstname = nameCollector.next().trim();

        System.out.print("Last name: ");
        String lastname = nameCollector.next().trim();

        System.out.print("Middle name: ");
        String middleName = nameCollector.next().trim();

        System.out.print("Suffix: ");
        String suffix = nameCollector.next();

        String fullName = firstname;

        if (!middleName.isEmpty()){
            fullName = fullName + " " + middleName;
        }

        // Here I re-declared the variable full name to include the middle name if not empty
        fullName = fullName + " " + lastname;

        if (!suffix.isEmpty()) {
            fullName = suffix + ". " + fullName;
        }

        System.out.println("Full name: " + fullName);





    }
}