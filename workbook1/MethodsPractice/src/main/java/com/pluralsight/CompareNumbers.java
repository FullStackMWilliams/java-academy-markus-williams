package com.pluralsight;

public class CompareNumbers {
    public static void main(String[] args) {
        System.out.println(isEven(3));
        System.out.println(isPositive(-4));
        System.out.println(isEven(6));
        System.out.println(isPositive(9));
    }

    public static boolean isEven (int number) {
        return number % 2 == 0;

    }

    public static boolean isPositive (int number) {
        return number > 0;
    }
}

