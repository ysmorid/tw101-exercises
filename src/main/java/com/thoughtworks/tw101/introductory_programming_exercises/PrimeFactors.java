package com.thoughtworks.tw101.introductory_programming_exercises;

//  Prime Factors Exercise
//  Write a method generate(int n) that given an integer N will return a list of integers such that the numbers
//  are the factors of N and are arranged in increasing numerical order.
//
//  For example, generate(1) should return an empty list and generate(30) should return the numbers: 2,3,5.

import java.util.ArrayList;
import java.util.List;

public class PrimeFactors {
    public static void main(String[] args) {
        List<Integer> primeFactors = generate(30);
        System.out.print(primeFactors);
    }

    private static List<Integer> generate(int n) {
        List<Integer> prime = new ArrayList<>();
        int num = n;
        int j = 0;
        int counter = 2;

        for(int i = 0; i < num; i++){
            if(num % counter == 0){
                prime.add(counter);
                num /= counter;
                j++;
            }
            else
                counter++;
        }
        if(num != 1) {
            prime.add(num);
        }

        return prime;
    }
}
