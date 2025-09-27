package com.pluralsight;

public class Format {
    public static void main(String[] args) {
        System.out.println(formatName("Bob", "Smith"));

        String formattedNamed = formatName("Markus", "Williams");
        System.out.println(formattedNamed);


    }

    public static String formatName(String first, String last) {

        return last + ", " + first ;
    }
}
