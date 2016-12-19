package com.thoughtworks.tw101.exercises.exercise5;

public class RectangleAverager {

    public float averageArea(Rectangle[] rectangles) {
        int area = 0;
        int average;

        for(int i = 0; i < rectangles.length; i++){
            area += rectangles[i].area();
        }
        average = area/rectangles.length;
        return average;
    }
}
