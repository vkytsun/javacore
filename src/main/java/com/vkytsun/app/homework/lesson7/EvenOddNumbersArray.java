package com.vkytsun.app.homework.lesson7;


import java.util.Arrays;

public class EvenOddNumbersArray {
    public static void evenNumbersArray() {
        int a = 0;
        int[] evenArray = new int[10];
        System.out.println("Even numbers of an array[2-20] into a string are: " );
        for (int i = 2; i <= 20; i+=2) {
            evenArray[a] = i;
            System.out.print(evenArray[a] + " ");
        }
        //all even numbers in one string - not working
        /*for (int arrElement : evenArray) {
            System.out.println(arrElement + " ");
        }
        //each number in new line - not working
        for (int arrElement : evenArray) {
            System.out.println("\n" + arrElement);
        }*/
        System.out.println("\nEven numbers of an array[2-20] into a column are: ");
        for (int i = 2; i <= 20; i+=2) {
            evenArray[a] = i;
            System.out.println(evenArray[a]);
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


