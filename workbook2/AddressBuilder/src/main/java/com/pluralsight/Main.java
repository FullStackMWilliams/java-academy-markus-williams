package com.pluralsight;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        StringBuilder stringBuilder_addressCollector = new StringBuilder();
        Scanner address_Scanner = new Scanner(System.in);


        System.out.println("Please enter the following information");

        System.out.print("Full name: ");
        String fullName = address_Scanner.nextLine().trim();
        stringBuilder_addressCollector.append(fullName).append("\n");

        System.out.print("Billing Street: ");
        String billingStreet = address_Scanner.nextLine().trim();

        System.out.print("Billing City: ");
        String billingCity = address_Scanner.nextLine().trim();

        System.out.print("Billing Sate: ");
        String billingState = address_Scanner.nextLine().trim();

        System.out.print("Billing Zip-Code: ");
        String billingZipCode = address_Scanner.nextLine().trim();

        stringBuilder_addressCollector.append("Billing Address: \n");
        stringBuilder_addressCollector.append(billingStreet).append("\n");
        stringBuilder_addressCollector.append(billingCity).append(", ").append(billingState)
                .append(" ").append(billingZipCode).append("\n");

        System.out.print("Shipping Street: ");
        String shippingStreet = address_Scanner.nextLine().trim();

        System.out.print("Shipping City: ");
        String shippingCity = address_Scanner.nextLine().trim();

        System.out.print("Shipping State: ");
        String shippingState = address_Scanner.nextLine().trim();

        System.out.print("Shipping Zip-Code: ");
        String shippingZipCode = address_Scanner.nextLine().trim();

        stringBuilder_addressCollector.append("Shipping Address:\n");
        stringBuilder_addressCollector.append(shippingStreet).append("\n");
        stringBuilder_addressCollector.append(shippingCity).append(", ").append(shippingState)
                .append(" ").append(shippingZipCode).append("\n");

        System.out.println("\nCustomer information");
        System.out.print(stringBuilder_addressCollector.toString());

        address_Scanner.close();

    }
}
