package com.vkytsun.app.homework.lesson4;


public class ArithmeticOperations {
    public static int multiply(int a, int b) {
        return a * b;
    }
    public static int division(int a, int b) {
        return a / b;
    }
    public static int addition(int a, int b) {
        System.out.println("Addition of two numbers is " + (a + b));
        return a + b;
    }
    public static int subtraction(int a, int b) {
        System.out.println("Subtraction of two numbers is " + (a - b));
        return a - b;
    }
    public static int min(int x, int y) {
        return Math.min(x, y);
    }
    public static int max(int x, int y, int z) {
        return Math.max(x, Math.max(y, z));
    }
    public static double sqrt(double x) {
        double result = Math.sqrt(x);
        System.out.println("sqrt is " + result);
        return result;
    }
    public static double pow(double x, double y) {
        double result = Math.pow(x, y);
        System.out.println("pow is " + result);
        return result;
    }
    public static int checkNull(int a, int b) {
        return a * b;
    }
    public static boolean checkTrue(boolean man, boolean women) {
        return false;
    }
    public static int inkrement(int h, int k) {
        return h++ + ++k;
    }
    public static int dekrement(int m, int n) {
        return m-- - --n;
    }
}
