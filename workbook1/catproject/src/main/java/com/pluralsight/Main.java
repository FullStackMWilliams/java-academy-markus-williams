package com.pluralsight;
public class Main {
    public static void main(String[] args) {

                // Variable Examples about a cat

                String catName = "Whiskers";
                int catAge = 3;
                double catWeight = 4.5;
                char catGrade = 'A';
                boolean isHungry = true;
                System.out.println("Age:" + catAge);
                System.out.println("Meet:" + catName + "!");
                System.out.println("Weight:" + catWeight + "kg");
                System.out.println("hungry?:" + isHungry);

                // Boolean Expressions Examples of a cat

                boolean isSleeping = false;
                boolean isPurring = true;
                if (isSleeping) {
                    System.out.println("The cat is sleeping...zzz");
                } else {
                    System.out.println("The cat is awake and wants attention");

                    // Exercise 1: Cat Profile

                    String catsName = "Pillows";
                    int catsAge = 2;
                    String catsColor = "orange";
                    double catsWeight = 5.5;
                    System.out.println(catsName + " is a " + catsAge + "-year-old " + catsColor + " cat " + "who weighs " + catsWeight + " kg");

                    // Exercise 2: Hungry Cat

                    boolean catsHungry = true;
                    if (catsHungry) {
                        System.out.println("The cat is meowing for food!");
                    } else {
                        System.out.println("The cat is full and purring");
                    }

                    // Exercise 3: Bonus Challenge

                    boolean isOutside = true;
                    if (isHungry && isOutside) {
                        System.out.println("The cat is hunting.");
                    } else if (isHungry && !isOutside) {
                        System.out.println("The cat wants you to feed it.");

                    }
                }
            }
        }