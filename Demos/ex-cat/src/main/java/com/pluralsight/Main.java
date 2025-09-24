package com.pluralsight;
public class Main {
    public static void main(String[] args) {

        // Data Types and Variables: About Me Exercise

        String favColor = "purple";
        String favArtist = "Pual Desmond";
        boolean ateToday = true;
        String fullname = "Markus Williams";
        System.out.println("Hi I'm " + fullname + "." + " My favorite color is " + favColor + ".");
        String newfavColor = "blue";


        // Boolean Practice Exercise

        boolean isHappy = true;
        boolean eatenBreakfast = false;

        if (isHappy && eatenBreakfast)
            System.out.println("Nice Job");
        else if (!isHappy && !eatenBreakfast)
            System.out.println("Do something about that!");
        else if (isHappy && !eatenBreakfast)
            System.out.println("You could be hungry.");
        {

        }
    }
}