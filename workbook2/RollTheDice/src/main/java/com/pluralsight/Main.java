package com.pluralsight;
public class Main {
    public static void main(String[] args) {

        Dice dice = new Dice();

        int twoCounter = 0;
        int fourCounter = 0;
        int sixCounter = 0;
        int sevenCounter = 0;

        for (int i = 1; i <= 100; i++) {

            int diceRoll_1 = dice.roll();
            int diceRoll_2 = dice.roll();

            int sum = diceRoll_1 + diceRoll_2;
            System.out.println("Roll " + i + ": " + diceRoll_1 + " - " + diceRoll_2 + "|" + " Sum: " + sum);

            if (sum == 2) {
                twoCounter++;
            } else if (sum == 4) {
                fourCounter++;
            } else if (sum == 6) {
                sixCounter++;
            }else if (sum == 7) {
                sevenCounter++;
            }
        }

        System.out.println("\n Summary of Rolls:");
        System.out.println("Number of times 2 was rolled: " + twoCounter);
        System.out.println("Number of times 4 was rolled: " + fourCounter);
        System.out.println("Number of times 6 was rolled: " + sixCounter);
        System.out.println("Number of times 7 was rolled: " + sevenCounter);
    }
}