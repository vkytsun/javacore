package com.vkytsun.app.homework.lesson5;

import java.util.Scanner;

public class CircleAreaBigger {
        public static final double PI = 3.14d;

    public static void calculateBigger() {
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Please enter circle radius1 ");
        double r1 = scanner1.nextInt();

        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Please enter circle radius2");
        double r2 = scanner2.nextInt();

        calcBiggerArrea(r1, r2);
    }
    public static double calcBiggerArrea(double r1, double r2) {
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
