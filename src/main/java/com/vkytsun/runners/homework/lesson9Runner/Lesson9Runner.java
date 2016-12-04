package com.vkytsun.runners.homework.lesson9Runner;

import com.vkytsun.app.homework.lesson9.MultiDimensionArray;
import com.vkytsun.app.homework.lesson9.MultiplyTab;
import com.vkytsun.app.homework.lesson9.SortingArray;

import java.util.Scanner;


public class Lesson9Runner {
    public static void arrayPrint() {
        int[] array = {-888,11,123,-8,0,55,250,412,33,-421};
        System.out.println("Input array before bubble sort: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        SortingArray.bubbleSortMinToMax(array);
        SortingArray.bubbleSortMaxToMin(array);
    }
    public static void selectionSortArrayPrint() {
        int[] array = {11,0,-34,-88,777,255,55,-4};
        System.out.println("Input array before selection sort: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        SortingArray.selectionSortArray(array);
    }
    public static void main(String[] args) {
        int number;
        do {
            System.out.println("\nPlease, enter the number of the task to execute: " + "\n" +
                    "1. Bubble sort of the array by 2 methods." + "\n" +
                    "2. Selection sort of the array." + "\n" +
                    "3. Maximum element of the multi-dimension array[5][8]." + "\n" +
                    "4. Multiplication table [2..9]" + "\n" +
                    "0. Exit.");
            Scanner scanner = new Scanner(System.in);
            int numberOfTask = scanner.nextInt();
            switch (numberOfTask) {
                case 1: arrayPrint();
                    break;
                case 2: selectionSortArrayPrint();
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
