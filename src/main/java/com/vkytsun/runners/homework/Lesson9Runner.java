package com.vkytsun.runners.homework;

import com.vkytsun.app.homework.lesson9.*;

import java.util.Scanner;

public class Lesson9Runner {
    public static void main(String[] args) {
        int number;
        do {
            System.out.println("\n\nPlease, enter the number of the task to execute: " + "\n" +
                    "1. Bubble sort of the array. " + "\n" +
                    "2. Selection sort of the array." + "\n" +
                    "3. Maximum element of the multi-dimension array[5][8]." + "\n" +
                    "4. Multiplication table [2..9]" + "\n" +
                    "0. Exit.\n");
            Scanner scanner = new Scanner(System.in);
            int numberOfTask = scanner.nextInt();
            switch (numberOfTask) {
                case 1:
                    int[] array = ArrayInput.inputArray();
                    int[] sortedArrayMax = SortingArray.bubbleSortMinToMax(array);
                    ArrayPrint.bubbleSortMintoMaxArray(sortedArrayMax);
                    int[] sortedArrayMin = SortingArray.bubbleSortMaxToMin(array);
                    ArrayPrint.bubbleSortMaxToMinArray(sortedArrayMin);
                    break;
                case 2:
                    int[] array2 = ArrayInput.inputArray();
                    int[] sortedArrayUp = SortingArray.selectionSortMaxToMin(array2);
                    ArrayPrint.selectionSortMaxToMinArray(sortedArrayUp);
                    int [] sortedArrayDown = SortingArray.selectionSortMinToMax(array2);
                    ArrayPrint.selectionSortMinToMaxArray(sortedArrayDown);
                    break;
                case 3: MultiDimensionArray.multiDimensionArrayMaxElement();
                    break;
                case 4:
                    MultiplyTab.multiplyTabArray();
                    break;
                case 0: break;
                default:
                    System.out.println("You have made incorrect choice.");
            } number = numberOfTask;
        } while (number != 0);
    }
}
