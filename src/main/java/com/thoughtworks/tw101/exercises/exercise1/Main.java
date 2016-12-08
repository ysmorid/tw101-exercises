package com.thoughtworks.tw101.exercises.exercise1;

// Exercise #1: Print all odd numbers from 1 to 100 and their sum.

public class Main {
    public static void main(String[] args) {
        int num = 0;
        int sum = 0;

        for(int i = 0; i <= 100; i++){
            if(num % 2 != 0){
                System.out.println(num);
                sum += num;
            }
            num++;
        }
        System.out.println("The sum of the odd numbers from 1 to 100 is: " + sum);
    }
}
