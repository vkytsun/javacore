package com.vkytsun.app.homework.lesson5;


import java.util.Scanner;

public class EvenOdd {
    public static void defineEvenOdd() {
        System.out.println("Enter number to define even or odd");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();

        defEvenOdd(x);
    }
    public static int defEvenOdd(int x) {
        int y = x;
        if (x % 2 == 0) {
            System.out.println("You entered even number.");
        } else {
            System.out.println("You entered odd number.");
        }
        return x;
    }
}

