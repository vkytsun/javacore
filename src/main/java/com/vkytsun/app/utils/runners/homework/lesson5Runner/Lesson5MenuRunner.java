package com.vkytsun.app.utils.runners.homework.lesson5Runner;

import com.vkytsun.app.homework.lesson5.CircleArea;
import com.vkytsun.app.homework.lesson5.DefineNumber;
import com.vkytsun.app.homework.lesson5.RightAngledTriangle;

import java.util.Scanner;

public class Lesson5MenuRunner {
    public static void calculateArea(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter circle radius. ");
        double r = scanner.nextDouble();
        CircleArea.calcCircleArea(r);
    }
    public static void calculateBiggerArea() {
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Please enter circle radius1. ");
        double r1 = scanner1.nextInt();
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Please enter circle radius2. ");
        double r2 = scanner2.nextInt();
        CircleArea.calcBiggerArea(r1, r2);
    }
    public static void calculateTriangle() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter length of side a. ");
        double a = scanner.nextDouble();
        System.out.println("Please enter length of side b. ");
        double b = scanner.nextDouble();
        System.out.println("Please enter length of side c ");
        double c = scanner.nextDouble();
        RightAngledTriangle.checkRightAngledTriangle(a, b, c);
    }
    public static void defineEvenOdd() {
        System.out.println("Enter number to define even or odd. ");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        DefineNumber.defEvenOdd(x);
    }
    public static void defineBiggerNumber() {
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Enter first number from keyboard. ");
        int a = scanner1.nextInt();
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Enter second number from keyboard. ");
        int b = scanner2.nextInt();
        DefineNumber.defBiggerNumber(a, b);
    }
    public static void main(String[] args) {
        int number;
        do {
            System.out.println("\nPlease, enter the number to choose the task for the application:");
            System.out.println("1. Calculation circle area.");
            System.out.println("2. Comparison two circles area.");
            System.out.println("3. Right-angled triangle.");
            System.out.println("4. Define what an number is even/odd.");
            System.out.println("5. Define what an number is bigger/smaller.");
            System.out.println("0. Exit\n");

            Scanner scanner = new Scanner(System.in);
            int inputNumber = scanner.nextInt();
            if (inputNumber == 1) {
                calculateArea();
            } else if (inputNumber == 2) {
                calculateBiggerArea();
            } else if (inputNumber == 3) {
                calculateTriangle();
            } else if (inputNumber == 4) {
                defineEvenOdd();
            } else if (inputNumber == 5) {
                defineBiggerNumber();
            }
            else if (inputNumber == 0) {
                System.out.println("Cood bye!");
            } else
                System.out.println("Incorrect number. Please, try again.");
            number = inputNumber;
        } while (number != 0);
    }
}

