package com.thoughtworks.tw101.exercises.exercise8;

public class Results {
    private UserInput input;
    private int randomNumber;

    public Results(UserInput input, int randomNumber) {
        this.input = input;
        this.randomNumber = randomNumber;
    }

    public void isWithinRange() {
        while (input.stringToInteger() < 1 || input.stringToInteger() > 100) {
            System.out.println("I'm sorry, that is an invalid number.  Please try again. ");
            input.getInput();
        }
    }

    public void checkGuess(){
        if(input.stringToInteger() > randomNumber){
            System.out.println("I'm sorry.  Your guess is too high.  Guess again!");
        }
        else if(input.stringToInteger() < randomNumber){
            System.out.println("I'm sorry.  Your guess is too low.  Guess again!");
        }
        else
            System.out.println("You guessed correctly! Congratulations!!");
    }

    public void guessUntilCorrect() {
        do {
            input.getInput();
            isWithinRange();
            checkGuess();
        }
        while (input.stringToInteger() != randomNumber);
    }
}
