package com.thoughtworks.tw101.exercises.exercise7;

public class Result {
    private Input input = new Input();
    private Randomizer random = new Randomizer();
    private int randomNumber = 0;

    public Result(){
        randomNumber = random.generateRandomNumber();
    }

    public void isWithinRange(){
        while(input.StringToInteger() < 1 || input.StringToInteger() > 100){
            System.out.println("I'm sorry, that is an invalid number.  Please try again. ");
            input.getInput();
        }
    }

    public void checkGuess(){
        if(input.StringToInteger() > randomNumber){
            System.out.println("I'm sorry.  Your guess is too high.  Guess again!");
        }
        else if(input.StringToInteger() < randomNumber){
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
        while (input.StringToInteger() != randomNumber);
    }
}
