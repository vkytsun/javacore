package com.vkytsun.app.homework.lesson9;

public class ArrayPrint {
    public static int[] bubbleSortMaxToMinArray(int[] sortedMaxArray) {
        for (int i = 0; i < sortedMaxArray.length; i++) {
            System.out.print(sortedMaxArray[i] + " ");
        }
        return sortedMaxArray;
    }
    public static int[] bubbleSortMintoMaxArray(int[] sortedMinArray) {
        for (int i = 0; i < sortedMinArray.length; i++) {
            System.out.print(sortedMinArray[i] + " ");
        }
        return sortedMinArray;
    }
    public static int[] selectionSortMinToMaxArray(int[] sortedMaxArray) {
        for (int i = 0; i < sortedMaxArray.length; i++) {
            System.out.print(sortedMaxArray[i] + " ");
        }
        return sortedMaxArray;
    }
    public static int[] selectionSortMaxToMinArray(int[] sortedMinArray) {
        for (int i = 0; i < sortedMinArray.length; i++) {
            System.out.print(sortedMinArray[i] + " ");
        }
        return sortedMinArray;
    }
}
