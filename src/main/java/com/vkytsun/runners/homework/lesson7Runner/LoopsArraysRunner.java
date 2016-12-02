package com.vkytsun.runners.homework.lesson7Runner;

import com.vkytsun.app.homework.lesson7.EvenOddNumbersArray;
import com.vkytsun.app.homework.lesson7.RandomNumbersArray;
import java.util.Scanner;

public class LoopsArraysRunner {
    public static void main(String[] args) {
        int number;
        do {
            System.out.println("\nPlease, enter the number of the task to execute: " + "\n" +
                    "1. Even numbers of an array[2-20]." + "\n" +
                    "2. Odd numbers of an array[1-99]." + "\n" +
                    "3. Random numbers of an array[0-9]." + "\n" +
                    "4. Min/Max numbers of an array[0-999]." + "\n" +
                    "5. Multi-dimension array[8][5]." + "\n" +
                    "6. Right side format of a multi-dimension array[8][5]." + "\n" +
                    "7. The sum of all the numbers entered by the user." + "\n" +
                    "0. Exit.");
            Scanner scanner = new Scanner(System.in);
            int inputNumber = scanner.nextInt();
            //scanner.next();
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
            } else if (inputNumber == 7) {
                RandomNumbersArray.addNumbers();
            } else if (inputNumber == 0) {
                System.out.println("Good bye!");
            }
            number = inputNumber;
        } while (number != 0);
    }
}
