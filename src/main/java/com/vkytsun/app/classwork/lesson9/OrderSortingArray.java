package com.vkytsun.app.classwork.lesson9;

import java.lang.reflect.Array;
import java.util.Arrays;

public class OrderSortingArray {
    public static void main(String[] args) {
        int[] array = {5, 12, -4, 25, 1};
        bubbleSort(array);
        bubbleSort2();
        methodSort();
        stringMethodSort();
    }
    private static int[] bubbleSort(int[] intArray) {
        int n = intArray.length;
        int tempInt;
        System.out.println("Bubble sort:");
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (intArray[j-1] > intArray[j]) {
                    tempInt = intArray[j-1];
                    intArray[j-1] = intArray[j];
                    intArray[j] = tempInt;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(intArray[i] + " ");
        }
        return intArray;
    }
    private static int[] bubbleSort2() {
        /* Внешний цикл каждый раз сокращает фрагмент массива, так как внутренний цикл
        каждый раз ставит в конец фрагмента максимальный элемент */
        int temp, i, j;
        System.out.println("\nBubble sort:");
        int[] intArray = {22,33,1234,-23,231,-34,0,12};
                for (i = 0; i < intArray.length; i++) {
                    /*Сравниваем элементы попарно, если они имеют неправильный порядок, то меняем местами*/
                    for (j = 0; j < intArray.length-1; j++) {
                        if (intArray[j] < intArray[j+1]) {
                            temp = intArray[j];
                            intArray[j] = intArray[j+1];
                            intArray[j+1] = temp;
                        }
                    }
                }
                for (i = 0; i < intArray.length; i++) {
                    System.out.print(intArray[i] + " ");
                }
                return intArray;
    }
    /* в начале файла предварительно нужно подключить библиотеку  java.util. */
    private static int[] methodSort() {
        int[] array = {22,3,1,-2,-11,332};
        Arrays.sort(array);
        System.out.println("\n" + "\nSorted array: " +
        Arrays.toString(array));
        return array;
    }
    private static String[] stringMethodSort() {
        String[] arrayCar = {"Ford", "BMW", "Mercedes", "Audi", "Opel"};
        Arrays.sort(arrayCar);
        System.out.println("Models of the cars are: ");
        for (int i = 0; i < arrayCar.length; i++) {
            System.out.println(arrayCar[i] + " ");
        } return arrayCar;
    }
}