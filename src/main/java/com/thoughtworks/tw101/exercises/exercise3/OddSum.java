package com.thoughtworks.tw101.exercises.exercise3;

public class OddSum {
   private int sum = 0;

   public int of(int start, int end) {
       int num = start;

       for(int i = start; i <= end; i++){
          if(num % 2 != 0){
             sum += num;
          }
          num++;
       }
       return sum;
    }
}
