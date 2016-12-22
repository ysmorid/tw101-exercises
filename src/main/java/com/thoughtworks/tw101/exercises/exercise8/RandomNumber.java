package com.thoughtworks.tw101.exercises.exercise8;

import java.util.Random;

public class RandomNumber {

    private Random random = new Random();
    private final int min = 1;
    private final int max = 100;

    public int generateRandomNumber(){
        return random.nextInt((max-min) + 1) + min;
    }
}

