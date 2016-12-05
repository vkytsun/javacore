package com.vkytsun.app.homework.lesson9;


public class ArrayInput {
    public static int[] inputArray() {
        System.out.println("Array before selection sort: ");
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            int randomNumbers = (int) (Math.random() * 100 + 1);
            array[i] = randomNumbers;
            System.out.print(array[i] + " ");
        }
        System.out.println();
        return array;
    }
}
