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
    public static int[] selectionSortArray(int[] array) {
        /*По очереди будем просматривать все подмножества элементов массива (0 - последний, 1-последний,
        2-последний,...)*/
        System.out.println("\nSort the array by selection sort: ");
        for (int i = 0; i < array.length; i++) {
            //int min = array[i]; // Предполагаемый минимальный элемент
            int indexMin = i;  // Индекс минимального элемента
            for (int j = i + 1; j < array.length; j++ ) {
                // Если находим новый минимум, то запоминаем его индекс
                if (array[j] < array[indexMin]) {
                    //min = array [j];
                    indexMin = j;
                }
            }
            /*Проверяем, нашёлся ли элемент меньше, чем стоит на текущей позиции.
            Если нашелся, то меняем значения местами*/
            if (i != indexMin) {
                int temp = array[i];
                array[i] = array[indexMin];
                array[indexMin] = temp;
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        return array;
    }
}

