package com.vkytsun.app.homework.lesson5;

import java.util.Scanner;

/**
 * Created by vkytsun on 11/16/16.
 */
public class Menu {
    public static void menuRunner() {
        System.out.println("Enter number of the operation which you want execute:");
        System.out.println("1. Calculation circle area.");
        System.out.println("2. Comparison two circles area.");
        System.out.println("3. Calculation sides of right-angled triangle.");
        System.out.println("4. Define if number even or odd");
        System.out.println("5. Exit");

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        numberOperation(a);
    }

    public static int numberOperation(int a) {

        if (a == 1) {
            CircleRadius.calculate();
        } else {
            if (a == 2) {
                CircleArea.calculateBigger();
            } else {
                if (a == 3) {
                    RightAngledTriangle.calculateTriangle();
                } else {
                    if (a == 4) {
                        EvenOdd.defineEvenOdd();
                    } else {
                        if (a == 5) {
                            System.out.println("Cood bye!");
                        }
                        else {
                            System.out.println("incorrect number. Please, try again.");
                        }
                    }
                }

            }
        }
        return a;
    }
}
