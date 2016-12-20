package com.thoughtworks.tw101.exercises.exercise7;

import java.util.Random;

public class Randomizer {
    private Random random = new Random();
    private int number = 0;
    private final int min = 1;
    private final int max = 100;

    public void getRandomNumber(){
    number = random.nextInt((max-min) + 1) + min;
    }

    public void displayRandomNumber(){
        getRandomNumber();
        System.out.println(number);
    }
}
