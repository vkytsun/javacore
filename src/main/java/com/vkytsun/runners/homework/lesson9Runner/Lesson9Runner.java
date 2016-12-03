package com.vkytsun.runners.homework.lesson9Runner;

import com.vkytsun.app.homework.lesson9.SortingArray;

import java.util.Scanner;


public class Lesson9Runner {
    //public static void bubbleSort() {
        //int[] array = {-888,11,123,-8,0,55,250,412,33,-421};
        //int temp;
        //SortingArray.bubbleSortMinToMax();
        //SortingArray.bubbleSortMaxToMin();
  //  }
    public static void main(String[] args) {
        int number;
        do {
            System.out.println("\nPlease, enter the number of the task to execute: " + "\n" +
                    "1. Bubble sort of the array by 2 methods" + "\n" +
                    "2. Selection sort of the array" +
                    "" + "\n");
            Scanner scanner = new Scanner(System.in);
            int numberOfTask = scanner.nextInt();
            switch (numberOfTask) {
                case 1:
                    System.out.println("Output array:");
                    int[] array = {-888,11,123,-8,0,55,250,412,33,-421};
                    for (int i = 0; i < array.length; i++) {
                        System.out.print(array[i] + " ");
                    }
                    System.out.println();
                    SortingArray.bubbleSortMinToMax(array);
                    SortingArray.bubbleSortMaxToMin(array);
                    break;

                case 0: break;
                default:
                    System.out.println("You have made incorrect choice.");
            } number = numberOfTask;
        } while (number != 0);
    }
}
