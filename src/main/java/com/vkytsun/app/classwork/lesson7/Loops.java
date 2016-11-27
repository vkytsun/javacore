package com.vkytsun.app.classwork.lesson7;

// Самое важное при работе с циклами - это уметь считать и делать троссировку
/* В цикле while {} сначала выполняется условие, а потом код, а в цикле
do {} while - сначала выполняеется код(хотябы 1 раз), а потом проверяется условие
 */
/*
Ask user for number a and b. If a>b - decrease a until it becomes equal to b.
Print a and b every loop. If a<=b - then print a and b, and exit program.
 */
public class Loops {
    public static void counterWhile(int a, int b) {
        while (a > b) {

            System.out.println("a = " + a + ", b = " + b);
            a--;
        }
        System.out.println("a = " + a + ", b = " + b);
    }
    public static void counterFor(int a, int b) {
        for (int i = a; i <= b; i++) {
            System.out.println(i + "");
        }
    }
    public static int counterForEven(int i) {
        int count = 0;
        for (i = 0; i <= 20; i+=2) {
            count++;
            System.out.println("Even number " + i + "");
        }
        return count;
    }
}

