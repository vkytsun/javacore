package com.vkytsun.runners.homework;

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
            int numberOfTask = scanner.nextInt();
            //String inputString = scanner.nextLine();
            //if (inputString.equals(numberOfTask)) {
            //}
            switch (numberOfTask) {
                case 1:
                    EvenOddNumbersArray.evenNumbersArray();
                    break;
                case 2:
                    EvenOddNumbersArray.oddNumbersArray();
                    break;
                case 3:
                    RandomNumbersArray.randomNumberArray();
                    break;
                case 4:
                    RandomNumbersArray.randomNumberMinMaxArray();
                    break;
                case 5:
                    RandomNumbersArray.multiDimensionArray();
                    break;
                case 6:
                    RandomNumbersArray.rightSideFormatArray();
                    break;
                case 7:
                    RandomNumbersArray.addNumbers();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("You have made incorrect choice.");
            } number = numberOfTask;
        } while (number != 0);
    }
}
