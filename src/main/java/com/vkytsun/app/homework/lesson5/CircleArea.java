package com.vkytsun.app.homework.lesson5;

import java.util.Scanner;

public class CircleArea {
    public static final double PI = 3.14d;
    public static double calcCircleArea(double r){
        double circleArea = PI * r * r;
        System.out.println("Area is " + circleArea%1000);
        return circleArea;
    }
    public static double calcBiggerArea(double r1, double r2) {
        double circleArea1 = PI * r1 * r1;
        double circleArea2 = PI * r2 * r2;
        if (circleArea1 > circleArea2) {
            System.out.println("Area1 is bigger ");
            System.out.println("Area2 is smaller ");
            return circleArea1;
        }
        else {
            System.out.println("Area2 is bigger ");
            System.out.println("Area1 is smaller ");
        }
        return circleArea2;
    }
}
