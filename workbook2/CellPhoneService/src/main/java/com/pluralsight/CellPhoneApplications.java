package com.pluralsight;
import java.util.Scanner;

public class CellPhoneApplications {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

/* This line of code uses the method we made called cell phone to collect the users input in the way we structured our cellphone
file.
 */
        CellPhone phone;
        phone = new CellPhone();

        System.out.print("Enter your serial number (ex: 1000000 - 9999999): ");
        int serialNumber = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter your phone model (ex: IPhone X): ");
        String model = scanner.nextLine();

        System.out.print("Enter your carrier name (ex. AT&T): ");
        String carrier = scanner.nextLine();

        System.out.print("Enter your phone number (ex: 888-888-8888): ");
        String phoneNumber = scanner.nextLine();

        System.out.print("Enter your full name (ex: John Smith): ");
        String owerFullName = scanner.nextLine();

        phone.setSerialNumber(serialNumber);
        phone.setModelNumber(model);
        phone.setCarrier_Provider(carrier);
        phone.setPhoneNumber(phoneNumber);
        phone.setOwerFullName(owerFullName);


        System.out.println("\nPhone Details:");
        System.out.println("Serial Number: " + phone.getSerialNumber());
        System.out.println("Model: " +phone.getModelNumber());
        System.out.println("Carrier: " + phone.getCarrier_Provider());
        System.out.println("Phone Number: " + phone.getPhoneNumber());
        System.out.println("Customer full name: " + phone.getOwerFullName());
    }
}