package com.pluralsight;
import java.util.Scanner;

public class FullNameParser {
    public static void main(String[] args) {

        Scanner myName_collector = new Scanner(System.in);

        System.out.print("Enter your full name (Ex: John Henry Smith): ");
        String usersName_input = myName_collector.nextLine().trim();

        String[] partsOfName = myName_collector.delimiter().split(usersName_input);

        String firstName = "";
        String middleName = "";
        String lastName = "";


        if (partsOfName.length == 2) {
            firstName = partsOfName[0];
            middleName = "(none)";
            lastName = partsOfName[1];
        } else if (partsOfName.length == 3) {
            firstName = partsOfName[0];
            middleName = partsOfName[1];
            lastName = partsOfName[2];
        } else {
            System.out.println("Invalid format. Please enter either 'first, last' or 'first, middle, last");
            myName_collector.close();
            return;
        }

        System.out.println("First name: " + firstName);
        System.out.println("Middle name: " + middleName);
        System.out.println("Last name: " + lastName);

        myName_collector.close();

    }
}
