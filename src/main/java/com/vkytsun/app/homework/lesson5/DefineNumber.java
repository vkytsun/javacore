package com.vkytsun.app.homework.lesson5;

import java.util.Scanner;

public class DefineNumber {
    public static int defEvenOdd(int x) {
        int y = x;
        if (x % 2 == 0) {
            System.out.println("You entered even number.");
        } else {
            System.out.println("You entered odd number.");
        }
        return x;
    }

    public static int defBiggerNumber(int a, int b) {
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
