package com.pluralsight;

public class Main {
    public static void main(String[] args) {

        Room room1 = new Room(2, 124.00, false, false);
        System.out.println("Room available: " + room1.isAvailable());

        Reservation reservation1 = new Reservation("king",3,true);
        System.out.println("Room type: " + reservation1.getRoomType());
        System.out.println("Price per night: $" + reservation1.getPrice());
        System.out.println("Total Reservation: $" + reservation1.getReservationTotal());

        Employee employee1 = new Employee(101, "John Smith", "Front desk", 20.00,45);
        System.out.println("\nEmployee: " + employee1.getName());
        System.out.println("Regular Hours: " + employee1.getRegularHours());
        System.out.println("Overtime Hours: " + employee1.getOverTimeHours());
        System.out.println("Total Pay: $" + employee1.getTotalPay());
    }
}