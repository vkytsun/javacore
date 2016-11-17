package com.vkytsun.app.homework.lesson5;

import java.util.Scanner;

/**
 * Created by vkytsun on 11/16/16.
 */
public class CircleArea {
        public static final double PI = 3.14d;

    public static void calculateBigger() {
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Please enter circle radius1 ");
        double radius1 = scanner1.nextInt();

        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Please enter circle radius2");
        double radius2 = scanner2.nextInt();

        calculateBiggerArrea(radius1, radius2);
    }
    public static double calculateBiggerArrea(double radius1, double radius2) {
        double circleArea1 = PI * radius1 * radius1;
        double circleArea2 = PI * radius2 * radius2;
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
