package com.vkytsun.app.utils.runners.homework.lesson3Runner.lesson5Runner;

import com.vkytsun.app.homework.lesson5.CircleArea;
import com.vkytsun.app.homework.lesson5.CircleRadius;
import com.vkytsun.app.homework.lesson5.RightAngledTriangle;

import java.util.Scanner;

public class Lesson5Runner {

    public static void main(String[] args) {
        System.out.println("Enter number of the operation which you want execute:");
        System.out.println("1. Calculation circle area.");
        System.out.println("2. Comparison two circles area.");
        System.out.println("3. Calculation sides of right-angled triangle.");
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextInt();

        numberOperation(a);
    }
    public static double numberOperation(double a) {

        if (a == 1){
            CircleRadius.calculate();
        } else {
            if (a == 2) {
                CircleArea.calculateBigger();
            } else {
                if (a == 3) {
                    RightAngledTriangle.calculateTriangle();
                } else {
                    System.out.println("incorrect number. Please, try again.");
                }
            }
        }
        return a;
    }

}

