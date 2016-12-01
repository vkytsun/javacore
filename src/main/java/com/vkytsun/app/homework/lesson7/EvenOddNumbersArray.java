package com.vkytsun.app.homework.lesson7;


import java.util.Arrays;

public class EvenOddNumbersArray {
    public static void evenNumbersArray() {
        int[] evenArray = new int[10];
        System.out.println("Even numbers of an array[2-20] into a string are: " );
        for (int i = 2, a = 0; i <= 20; i++) {
            if (i % 2 == 0) {
                evenArray[a] = i;
                 a++;
            }
        }
        //all even numbers in one string
        for (int arrElement : evenArray) {
            System.out.print(arrElement + " ");
        }
        //each number in new line
        System.out.println("\nEven numbers of an array[2-20] into a column are: ");
        for (int arrElement : evenArray) {
            System.out.println(arrElement);
        }
    }
    public static void oddNumbersArray() {
        int a = 0;
        int[] oddArray = new int[50];
        System.out.println("\nOdd numbers of an array[1-99]: ");
        for (int i = 1; i <= 99; i+=2) {
            oddArray[a] = i;
            System.out.print(oddArray[a] + " ");
        }
        System.out.println("\nOdd numbers of an array[1-99] into a reverse order:  ");
        for (int i = 99; i >= 1; i-=2) {
            oddArray[a] = i;
            System.out.println(oddArray[a]);
        }
    }
}


