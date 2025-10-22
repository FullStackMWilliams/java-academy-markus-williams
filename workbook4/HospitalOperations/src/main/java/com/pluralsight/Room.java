package com.pluralsight;

public class Room {
    private int numberOfBeds;
    private double price;
    private boolean isOccupied;
    private boolean isDirty;

    public Room(int numberOfBeds, double price, boolean isOccupied, boolean isDirty) {
        this.numberOfBeds = numberOfBeds;
        this.price = price;
        this.isOccupied = isOccupied;
        this.isDirty = isDirty;
    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public double getPrice() {
        return price;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public boolean isDirty() {
        return isDirty;
    }

    public boolean isAvailable() {
        return !isDirty && !isOccupied;
    }

    public void checkIn() {
        if (isAvailable()) {
            isOccupied = true;
            isDirty = true;
            System.out.println("Room checked in.");
        } else {
            System.out.println("Room not available for check-in. It might be occupied or needs cleaning.");
        }
    }

    public void checkOut() {
         if (isOccupied) {
             isOccupied = false;
             isDirty = true;
             System.out.println("Guested checked out. Room marked dirty.");
         } else {
            System.out.println("Cannot check out.Room is already vacant.");
         }
    }

    public void cleanRoom(){
        if (isDirty) {
            isDirty = false;
            System.out.println("Room cleaned and ready for the next guest!");
        } else {
            System.out.println("Room is already clean.");
        }
    }

    public void setOccupied(boolean occupied) { this.isOccupied = occupied; }
    public void setDirty(boolean dirty) { this.isDirty = dirty; }
}