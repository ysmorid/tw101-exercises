package com.thoughtworks.tw101.exercises.exercise7;

import java.util.Scanner;

public class Input {
    private String userInput;
    private Scanner keyboard = new Scanner(System.in);

    public void getInput(){
        userInput = keyboard.nextLine();
    }

    public int StringToInteger(){
        int stringToInt = Integer.parseInt(userInput);
        return stringToInt;
    }

    public void display(){
        System.out.println(userInput);
    }
}
