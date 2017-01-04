package com.thoughtworks.tw101.exercises.exercise8;

import java.util.ArrayList;

public class Guesses {
    private ArrayList<Integer> guesses = new ArrayList<>();

    public void addGuess(int guess){
        guesses.add(guess);
    }
    
    public void displayGuesses(){
        System.out.println("Here are all of your valid guesses: ");
        for (int guess : guesses) {
            System.out.print(guess + ", ");
        }
    }

}
