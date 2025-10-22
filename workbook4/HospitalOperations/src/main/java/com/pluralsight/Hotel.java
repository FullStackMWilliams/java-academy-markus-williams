package com.pluralsight;

public class Hotel {
    private String name;
    private int numberOfSuites;
    private int numberOfRooms;
    private int bookedSuites;
    private int bookedBasicRooms;

    public Hotel(String name, int numberOfSuites, int numberOfRooms) {
        this(name, numberOfSuites, numberOfRooms, 0, 0);
    }

    public Hotel (String name, int numberOfSuites, int numberOfRooms, int bookedSuites, int bookedBasicRooms) {
        this.name = name;
        this.numberOfSuites = numberOfSuites;
        this.numberOfRooms = numberOfRooms;
        this.bookedSuites = bookedSuites;
        this.bookedBasicRooms = bookedBasicRooms;
    }



    public boolean bookRoom(int numberOfRooms, boolean isSuite) {
        if (isSuite) {
            if (bookedSuites + numberOfRooms <= this.numberOfSuites) {
                bookedSuites += numberOfRooms;
                System.out.println("Booked " + numberOfRooms + " King Suite(s).");
                return true;
            }else {
                System.out.println("Not enough Suites available.");
                return false;
            }
        } else {
            if (bookedBasicRooms + numberOfRooms <= this.numberOfRooms) {
                bookedBasicRooms += numberOfRooms;
                System.out.println("Booked " + numberOfRooms + " Basic Double room(s).");
                return true;
            }else {
                System.out.println("Not enough basic rooms available.");
                return false;
            }
        }
    }

    public int getAvailableSuites() {
        return numberOfSuites - bookedSuites;
    }

    public int getAvailableRooms() {
        return numberOfRooms - bookedBasicRooms;
    }

    public String getName() {
        return name;
    }

    public int getNumberOfSuites() {
        return numberOfSuites;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }
}
