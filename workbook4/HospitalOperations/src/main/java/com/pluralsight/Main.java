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


        /// Room test
        Room room105 = new Room(2,140.00,false,false);
        System.out.println("Room test");
        System.out.println("Available: " + room105.isAvailable());
        room105.checkIn();
        room105.checkOut();
        room105.cleanRoom();
        System.out.println("Available: " + room105.isAvailable());


        ///  Employee Punch in and out
        Employee emp1 = new Employee(99,"John Smith","Room Service", 19.50,0);
        System.out.println("\n======= Employee Test =======");
        emp1.punchTimeCard(9.0);
        emp1.punchTimeCard(18.0);

        System.out.println("Total Hours worked: " + emp1.getHoursWorked());
        System.out.println("Total pay: $" + emp1.getTotalPay());


        System.out.println("\n======= Employee test Exercise 3 =========");
        Employee emp = new Employee(105, "John Smith","Housekeeping",18.50,0);

        emp.punchTimeCard();
        try {Thread.sleep(1000);} catch (InterruptedException e) {}
        emp.punchTimeCard();

        emp.punchTimeCard(9.0);
        emp.punchTimeCard(17.5);

        System.out.println("Total Hours Worked: " + emp.getHoursWorked());
        System.out.println("Total Pay: $" + emp.getTotalPay());

        System.out.println("\n===== Hotel test ======");
        Hotel hotel = new Hotel("4 Seasons Resort", 5, 10);
        hotel.bookRoom(2,true);
        hotel.bookRoom(3,false);
        hotel.bookRoom(12,false);

        System.out.println("Available Suites: " + hotel.getAvailableSuites());
        System.out.println("Available Basic Rooms: " + hotel.getAvailableRooms());

    }
}