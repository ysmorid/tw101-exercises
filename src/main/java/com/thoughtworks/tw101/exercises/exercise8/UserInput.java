package com.thoughtworks.tw101.exercises.exercise8;

import java.util.Scanner;

public class UserInput {
    private String userInput;
    private Scanner keyboard = new Scanner(System.in);

    public void getInput(){
        System.out.println("Please guess a number between 1 - 100: ");
        userInput = keyboard.nextLine();
    }

    public int stringToInteger(){
        return Integer.parseInt(userInput);
    }

    public void display(){

        System.out.println(userInput);
    }
}
