package com.thoughtworks.tw101.exercises.exercise8;

public class Results {
    private UserInput input;
    private int randomNumber;
    private int inputAsInt;

    public Results(UserInput input, int randomNumber) {
        this.input = input;
        this.randomNumber = randomNumber;
        inputAsInt = input.stringToInteger();
    }

    private void isWithinRange() {
        while (inputAsInt < 1 || inputAsInt > 100) {
            System.out.println("I'm sorry, that is an invalid number.  Please try again. ");
            input.getInput();
        }
    }

    protected void checkGuess(){
        if(inputAsInt > randomNumber){
            System.out.println("I'm sorry.  Your guess is too high.  Guess again!");
        }
        else if(inputAsInt < randomNumber){
            System.out.println("I'm sorry.  Your guess is too low.  Guess again!");
        }
        else
            System.out.println("You guessed correctly! Congratulations!!");
    }

    protected void checkInputIsValid(){
        try{
            input.getInput();
            isWithinRange();
        }
        catch (NumberFormatException e) {
            System.out.println("I'm sorry, that is an invalid number format. Please try again using digits only.");
            checkInputIsValid();
        }
    }
}
