package com.vkytsun.app.homework.lesson5;

import java.util.Scanner;

/**
 * Created by vkytsun on 11/17/16.
 */
public class RightAngledTriangle {
    public static void calculateTriangle() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter cathenus length А ");
        double A = scanner.nextDouble();
        System.out.println("Please enter cathenus length B ");
        double B = scanner.nextDouble();
        PythagoreanTheorem(A, B);
    }
    public static double PythagoreanTheorem(double A, double B) {
        double C = Math.sqrt(A * A + B * B);
        if (C > A && C > B && A > 0 && B > 0) {
            System.out.println("Hypotenuse of right-angled triangle is: " + C%1000);
        } else {
            if (A <= 0 && B <= 0) {
                System.out.println("Incorrect values of cathenus lengthes A and B");
            } else {
                if (A <= 0) {
                    System.out.println("Incorrect value cathenus length A");
                } else {
                    if (B <= 0 ){
                        System.out.println("Incorrect value cathenus length B");
                    }
                }
            }
        }
        return C;
    }

}