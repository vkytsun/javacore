package com.vkytsun.app.classwork.lesson17;

public class ArraySorterGenericsClasswork<T> {
    public <T extends Comparable<T>, Number> T[] bubbleSortMigenToMax(T[] array) {
        T temp;
        System.out.println("\nBubble sort of the array from Min to Max number: ");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j+ 1].compareTo(array[j]) < 0) {
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        return array;
    }
}
