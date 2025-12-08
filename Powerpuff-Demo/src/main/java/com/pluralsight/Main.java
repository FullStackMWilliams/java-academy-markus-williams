package com.pluralsight;

public class Main {
    public static void main(String[] args) {

        // power puff fighting game
        // Features we want to include

        PowerPuffGirl butterCup = new PowerPuffGirl("Buttercup", "Green");
        System.out.println(butterCup.getHealth());
        butterCup.setHealth(300);
        System.out.println("Buttercup drink this!");
        butterCup.Heal(200);
        butterCup.setAttackDamage(878);
        System.out.println("Buttercup took 200 attack damage");
        butterCup.Heal(200);

    }
}