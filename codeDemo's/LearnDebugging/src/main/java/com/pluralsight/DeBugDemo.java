package com.pluralsight;

public class DeBugDemo {
    public static void main(String[] args) {

        int number = 5;
        int result = number * 2;


        System.out.println("Double of number is: " + result);
        if (number > 0) {
            System.out.println("The number is positive");
        }


    }
}