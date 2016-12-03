package com.vkytsun.app.homework.lesson9;

import java.util.Arrays;

/**
 * Написать класс для пузырьковой сортировки с 2 методами, которые будут на входе
 * при вызове принимать одномерный массив int. Один метод должен сортировать от
 * меньшего числа к большему, второй - наоборот. Методы должны возвращать также
 * одномерный массив int. Входной и результирующий массивы вывести классом ArrayPrint
 * (который вы создадите для вывода массивов) результат выводится на экран раннером.
 */
public class SortingArray {
    public static int[] bubbleSortMinToMax(int[] array) {
        int temp;
        System.out.println("Bubble sort of the array from Min to Max number: ");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j+1]) {
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
            //System.out.println("\nInput array" + array);
        }
      return array;
    }
    public static int [] bubbleSortMaxToMin(int[] array) {
        int temp;
        System.out.println("\nBubble sort of the array from Max to Min number: ");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] < array[j+1]) {
                    temp = array[j];
                    array[j] = array [j+1];
                    array[j+1] = temp;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        return array;

    }
}
