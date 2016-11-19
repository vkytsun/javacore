package com.vkytsun.app.homework.lesson5;

import java.util.Scanner;

public class BiggerNumber {

    public static void biggerSmallerNumber() {
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Enter first number from keyboard.");
        int a = scanner1.nextInt();
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Enter second number from keyboard.");
        int b = scanner2.nextInt();

        calcBiggerNumber(a, b);
    }
    public static int calcBiggerNumber(int a, int b) {
        if (a > b) {
            System.out.println("First number is bigger, second - smaller.");
        return a;
        } else if (a == b){
            System.out.println("Numbers are equals.");
            return (a = b);
        } else {
            System.out.println("Second number is bigger, first - smaller.");
        return b;
        }
    }
}
