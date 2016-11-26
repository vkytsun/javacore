package com.vkytsun.app.homework.lesson5;

import java.util.Scanner;


public class RightAngledTriangle {

    public static double checkRightAngledTriangle(double a, double b, double c) {
        if (a > 0 && b > 0 && c > 0) {
            if (a > b && a > c) {
                if (a == Math.sqrt(b * b + c * c)) {
                    System.out.println("Triangle is right-angled.");
                    return a;
                } else
                    System.out.println("It is not right-angled triangle.");
                return a;
            }
            else {
            if (b > a && b > c) {
                if (b == Math.sqrt(a * a + c * c)) {
                    System.out.println("Triangle is right-angled.");
                    return b;
                } else
                    System.out.println("It is not right-angled triangle.");
                return b;
            }
            else {
                if ( c > a && c > b) {
                    if (c == Math.sqrt(a * a + b * b)) {
                        System.out.println("Triangle is right-angled.");
                        return c;
                    } else
                        System.out.println("It is not right-angled triangle.");
                    return c;
                } else
                    System.out.println("It is not right-angled triangle.");
                return 0;
                }
            }
        }
        else
            System.out.println("You entered incorrect values. Triangle is not right-angled.");
        return 0;
    }
}
