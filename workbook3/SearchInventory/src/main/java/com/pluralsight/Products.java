package com.pluralsight;

public class Products implements Comparable<Products> {
    private int id;
    private String name;
    private double price;

    public Products(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public  int compareTo(Products other) {
        return this.name.compareToIgnoreCase(other.name);
    }
    public String toString() {
        return String.format("%d | %-25s | $%.2f", id, name,price);
    }
}
