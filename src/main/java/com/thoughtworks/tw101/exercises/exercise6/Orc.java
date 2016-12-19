package com.thoughtworks.tw101.exercises.exercise6;

public class Orc implements Monster{

    private String name = "Orc";
    private int hitPoints = 20;

    @Override
    public void takeDamage(int amount) {
    hitPoints -= amount;
    }

    @Override
    public void reportStatus() {
        System.out.println("Current hit points for monster " + name + " : " + hitPoints);
    }
}
