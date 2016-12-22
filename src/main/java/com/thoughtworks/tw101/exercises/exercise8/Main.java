package com.thoughtworks.tw101.exercises.exercise8;

// Exercise #8: Create a new version of Exercise #7 where you also record all of the user’s guesses and print them out
// once they guess correctly. Use an ArrayList to store the guesses. Catch the NumberFormatException and handle the case
// where the user entered a String that is not parseable.

public class Main {

    public static void main(String[] args) {
        RandomNumber random = new RandomNumber();
        int number = random.generateRandomNumber();
        UserInput user = new UserInput();
        Results results = new Results(user, number);
        Guesses guess = new Guesses();

        try {
            do {
                user.getInput();
                results.isWithinRange();
                guess.addGuess(user.stringToInteger());
                results.checkGuess();
            }
            while (user.stringToInteger() != number);
            guess.displayGuesses();
        }
        catch (NumberFormatException e) {
            System.out.println("I'm sorry, that is an invalid number format. ");
        }
    }
}
