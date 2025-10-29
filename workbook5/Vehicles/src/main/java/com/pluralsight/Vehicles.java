package com.pluralsight;

public class Vehicles {
    public static void main(String[] args) {

        Moped slowRide = new Moped();
        slowRide.setColor("Red");
        slowRide.setFuelCapacity(5);
        slowRide.setNumberOfPassengers(2);
        slowRide.setCargoCapacity(10);

        Car car1 = new Car();
        car1.setColor("blue");
        car1.setFuelCapacity(50);
        car1.setNumberOfPassengers(2);
        car1.setCargoCapacity(300);

        SemiTruck bigRig = new SemiTruck();
        bigRig.setColor("black");
        bigRig.setFuelCapacity(300);
        bigRig.setNumberOfPassengers(2);
        bigRig.setCargoCapacity(500000);


        Hovercraft sea_Doo = new Hovercraft();
        sea_Doo.setColor("Green");
        sea_Doo.setFuelCapacity(15);
        sea_Doo.setNumberOfPassengers(2);
        sea_Doo.setCargoCapacity(10);


        // Test the getters - display information
        System.out.println("=== Moped Information ===");
        System.out.println("Color: " + slowRide.getColor());
        System.out.println("Fuel Capacity: " + slowRide.getFuelCapacity() + " liters");
        System.out.println("Passengers: " + slowRide.getNumberOfPassengers() + " people");
        System.out.println("Cargo Capacity: " + slowRide.getCargoCapacity() + " lbs");

        System.out.println("\n=== Car Information ===");
        System.out.println("Color: " + car1.getColor());
        System.out.println("Fuel Capacity: " + car1.getFuelCapacity() + " liters");
        System.out.println("Passengers: " + car1.getNumberOfPassengers() + " people");
        System.out.println("Cargo Capacity: " + car1.getCargoCapacity() + " lbs");

        System.out.println("\n=== Semi Truck Information ===");
        System.out.println("Color: " + bigRig.getColor());
        System.out.println("Fuel Capacity: " + bigRig.getFuelCapacity() + " liters");
        System.out.println("Passengers: " + bigRig.getNumberOfPassengers() + " people");
        System.out.println("Cargo Capacity: " + bigRig.getCargoCapacity() + " lbs");

        System.out.println("\n=== Hovercraft Information ===");
        System.out.println("Color: " + sea_Doo.getColor());
        System.out.println("Fuel Capacity: " + sea_Doo.getFuelCapacity() + " liters");
        System.out.println("Passengers: " + sea_Doo.getNumberOfPassengers() + " people");
        System.out.println("Cargo Capacity: " + sea_Doo.getCargoCapacity() + " lbs");
    }
}