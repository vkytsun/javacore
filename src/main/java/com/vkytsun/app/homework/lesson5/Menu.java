package com.vkytsun.app.homework.lesson5;

import java.util.Scanner;


public class Menu {
    public static void menuRunner() {
        int number;
        do {
        System.out.println("\nPlease, enter the number to choose the task for the application:");
        System.out.println("1. Calculation circle area.");
        System.out.println("2. Comparison two circles area.");
        System.out.println("3. Calculation sides of right-angled triangle.");
        System.out.println("4. Define what an number is even/odd");
        System.out.println("5. Define what an number is bigger/smaller");
        System.out.println("0. Exit\n");

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

            if (a == 1) {
                CircleArea.calculate();
            } else if (a == 2) {
                    CircleAreaBigger.calculateBigger();
                } else if (a == 3) {
                        RightAngledTriangle.calculateTriangle();
                    } else if (a == 4) {
                            EvenOdd.defineEvenOdd();
                        } else if (a == 5) {
                            BiggerNumber.biggerSmallerNumber();
                        }
                          else if (a == 0) {
                                System.out.println("Cood bye!");
                            } else
                                System.out.println("incorrect number. Please, try again.");
            number = a;
        } while (number != 0);
    }

}