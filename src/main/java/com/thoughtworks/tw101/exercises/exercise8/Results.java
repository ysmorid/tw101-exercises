package com.thoughtworks.tw101.exercises.exercise8;

public class Results {
    private UserInput input = new UserInput();
    private RandomNumber random = new RandomNumber();
    private int randomNumber = 0;

    public Results(){
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
