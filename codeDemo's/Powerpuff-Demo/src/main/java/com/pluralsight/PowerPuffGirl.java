package com.pluralsight;

public class PowerPuffGirl {
    // instance variables (typically hidden) this is why we use private instead of public
    private String name;
    private int Health;
    private String OutfitColor;
    private int attackDamage;
    private int power;

    // Constructor
    public PowerPuffGirl(String _name, String _outfitColor) {
        this.name = _name;
        this.OutfitColor = _outfitColor;
        this.power = 100;
        this.attackDamage = 100;
        this.Health = 100;

    }

    public int getHealth() {
        return this.Health;
    }

    public void setHealth(int _newHealth) {
        if (_newHealth > 0 && _newHealth < 100) {
            this.Health = _newHealth;
        }
        System.out.println("Come on, this is not possible");
    }

    public void Heal(int _howMuchHealth) {
        System.out.println("Drinking potion");

        int newHealth = this.Health + _howMuchHealth;
        if (newHealth >= 100) {
            this.setHealth(100);
            System.out.println("FULLY RECOVERED.");
            setHealth(newHealth);
        }

    }

    public String getName() {
        return this.name;
    }

    public int getAttackDamage() {
        return attackDamage;
    }

    public void setAttackDamage(int _HowMuchAttackDamage) {
        this.attackDamage = _HowMuchAttackDamage;
    }
}