package com.thoughtworks.tw101.exercises.exercise8;

public class Results {
    private UserInput input;
    private int randomNumber;

    public Results(UserInput input, int randomNumber) {
        this.input = input;
        this.randomNumber = randomNumber;
    }

    private void isWithinRange(int inputAsInt) {
        while (inputAsInt < 1 || inputAsInt > 100) {
            System.out.println("I'm sorry, that is an invalid number.  Please try again. ");
            input.getInput();
            inputAsInt = input.stringToInteger();
        }
    }

    public void checkGuess(int inputAsInt){
        if(inputAsInt > randomNumber){
            System.out.println("I'm sorry.  Your guess is too high.  Guess again!");
        }
        else if(inputAsInt < randomNumber){
            System.out.println("I'm sorry.  Your guess is too low.  Guess again!");
        }
        else
            System.out.println("You guessed correctly! Congratulations!!");
    }

    public void checkInputIsValid(){
        try{
            input.getInput();
            isWithinRange(input.stringToInteger());
        }
        catch (NumberFormatException e) {
            System.out.println("I'm sorry, that is an invalid number format. Please try again using digits only.");
            checkInputIsValid();
        }
    }
}
