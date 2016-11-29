package com.vkytsun.runners.homework.lesson7Runner;


import com.vkytsun.app.homework.lesson7.EvenOddNumbersArray;
import com.vkytsun.app.homework.lesson7.RandomNumbersArray;

import java.util.Scanner;

public class LoopsArraysRunner {
    public static void main(String[] args) {
        int number;
        do {
            System.out.println("\nPlease, enter the number of the task to execute; ");
            System.out.println("1. Even numbers of an array[2-20].");
            System.out.println("2. Odd numbers of an array[1-99].");
            System.out.println("3. Random numbers of an array[0-9].");
            System.out.println("4. Min/Max numbers of an array[0-999].");
            System.out.println("5. Multi-dimension array[8][5].");
            System.out.println("6. Right side format of a multi-dimension array[8][5].");
            System.out.println("0. Exit.");
            Scanner scanner = new Scanner(System.in);
            int inputNumber = scanner.nextInt();
            if (inputNumber == 1) {
                EvenOddNumbersArray.evenNumbersArray();
            } else if (inputNumber == 2) {
                EvenOddNumbersArray.oddNumbersArray();
            } else if (inputNumber == 3) {
                RandomNumbersArray.randomNumberArray();
            } else if (inputNumber == 4) {
                RandomNumbersArray.randomNumberMinMaxArray();
            } else if (inputNumber == 5) {
                RandomNumbersArray.multiDimensionArray();
            } else if (inputNumber == 6) {
                RandomNumbersArray.rightSideFormatArray();
            } else if (inputNumber == 0) {
                System.out.println("Good bye!");
            }
            number = inputNumber;
        } while (number != 0);
    }
}
