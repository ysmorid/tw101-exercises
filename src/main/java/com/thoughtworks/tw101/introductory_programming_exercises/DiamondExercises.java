package com.thoughtworks.tw101.introductory_programming_exercises;

public class DiamondExercises {
    public static void main(String[] args) {
        drawAnIsoscelesTriangle(3);
        drawADiamond(8);
        drawADiamondWithYourName(4);
    }

//    Isosceles Triangle
//    Given a number n, print a centered triangle. Example for n=3:
//              *
//             ***
//            *****
    private static void drawAnIsoscelesTriangle(int n) {
        int starCounter = 1;
        int spaceCounter = n;

        for (int i = 0; i < n; i++){
            for(int k = spaceCounter; k > 0; k--){
                System.out.print(" ");
            }
            for(int j = 0; j < starCounter; j++){
                System.out.print("*");
            }
            spaceCounter --;
            starCounter += 2;
            System.out.println();
        }
    }

//    Diamond
//    Given a number n, print a centered diamond. Example for n=3:
//              *
//             ***
//            *****
//             ***
//              *
    private static void drawADiamond(int n) {
        int starCounter = 1;
        int spaceCounter = n;

        for (int i = 0; i < n; i++){
            for(int k = spaceCounter; k > 0; k--){
                System.out.print(" ");
            }
            for(int j = 0; j < starCounter; j++){
                System.out.print("*");
            }
            if(i != n-1){
                spaceCounter--;
                starCounter += 2;
            }
            System.out.println();
        }

        for (int x = n-1; x > 0; x--){
            spaceCounter++;
            starCounter -= 2;
            for(int y = 0; y < spaceCounter; y++){
                System.out.print(" ");
            }
            for(int z = starCounter; z > 0; z--){
                System.out.print("*");
            }
            System.out.println();
        }
    }

//    Diamond with Name
//    Given a number n, print a centered diamond with your name in place of the middle line. Example for n=3:
//
//             *
//            ***
//           Bill
//            ***
//             *
    private static void drawADiamondWithYourName(int n) {
        int starCounter = 1;
        int spaceCounter = n;

        for (int i = 0; i < n; i++){
            if(i != n-1){
                for(int k = spaceCounter; k > 0; k--){
                    System.out.print(" ");
                }
                for(int j = 0; j < starCounter; j++){
                    System.out.print("*");
                }
                    spaceCounter--;
                    starCounter += 2;
                }
            else {
                for(int l = spaceCounter; l > 0; l--){
                    System.out.print(" ");
                }
                System.out.print("Ylia M");
            }
            System.out.println();
        }

        for (int x = n-1; x > 0; x--){
            spaceCounter++;
            starCounter -= 2;
            for(int y = 0; y < spaceCounter; y++){
                System.out.print(" ");
            }
            for(int z = starCounter; z > 0; z--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
