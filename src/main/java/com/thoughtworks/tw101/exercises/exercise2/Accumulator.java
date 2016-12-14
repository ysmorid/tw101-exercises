package com.thoughtworks.tw101.exercises.exercise2;

public class Accumulator {
   private int counter = 0;

   public Accumulator(){
   }

   public void increment(){
      counter++;
   }

   public void total(){
      System.out.println("You have called increment " + counter + " times.");
   }
}
