package com.pluralsight;
import java.util.Scanner;

public class CellPhoneApplications {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

/* This line of code uses the method we made called cell phone to collect the users input in the way we structured our cellphone
file.
 */
        CellPhone phone1;
        phone1 = new CellPhone();

        System.out.print("Enter your serial number (ex: 1000000 - 9999999): ");
        phone1.setSerialNumber(scanner.nextInt());
        scanner.nextLine();

        System.out.print("Enter your phone model (ex: IPhone X): ");
        phone1.setModelNumber(scanner.nextLine());

        System.out.print("Enter your carrier name (ex. AT&T): ");
        phone1.setCarrier_Provider(scanner.nextLine());

        System.out.print("Enter your phone number (ex: 888-888-8888): ");
        phone1.setPhoneNumber(scanner.nextLine());

        System.out.print("Enter your full name (ex: John Smith): ");
        phone1.setOwerFullName(scanner.nextLine());

        CellPhone phone2 = new CellPhone();

        System.out.print("\nEnter your serial number (ex: 1000000 - 9999999): ");
        phone2.setSerialNumber(scanner.nextInt());

        System.out.print("Enter your phone model (ex: IPhone X): ");
        phone2.setModelNumber(scanner.nextLine());

        System.out.print("Enter your carrier name (ex. AT&T): ");
        phone2.setCarrier_Provider(scanner.nextLine());

        System.out.print("Enter your phone number (ex: 888-888-8888): ");
        phone2.setPhoneNumber(scanner.nextLine());

        System.out.print("Enter your full name (ex: John Smith): ");
        phone2.setOwerFullName(scanner.nextLine());

        CellPhone phone3 = new CellPhone(1223435,"Samsung G22","Verizon","678-367-9835","Mario Hashimoto"

        );

        System.out.println("\nPhone Details:");
        display(phone1);
        display(phone2);
        display(phone3);

        System.out.println("\nCalling each other:");
        phone1.dail(phone2.getPhoneNumber());
        phone2.dail(phone1.getPhoneNumber());
        phone3.dail(phone2.getPhoneNumber());

        scanner.close();

    }

    public static void display(CellPhone phone) {
        System.out.println("=========================");
        System.out.println("Owner: " + phone.getOwerFullName());
        System.out.println("Model: " + phone.getModelNumber());
        System.out.println("Carrier: " + phone.getCarrier_Provider());
        System.out.println("Phone number: " + phone.getPhoneNumber());
        System.out.println("Serial number: " + phone.getSerialNumber());
    }

}