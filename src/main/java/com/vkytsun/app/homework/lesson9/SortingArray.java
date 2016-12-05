package com.vkytsun.app.homework.lesson9;

import java.util.Arrays;

public class SortingArray {
   // static int[] array = {-888,11,123,-8,0,55,250,412,33,-421};

    public static int[] bubbleSortMinToMax(int[] array) {
        int temp;
        System.out.println("\nBubble sort of the array from Min to Max number: ");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j+1]) {
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
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
        return array;
    }
    public static int[] selectionSortMinToMax(int[] array) {
        System.out.println("\nSelection sort of the array from Min to Max number: ");
        for (int i = 0; i <array.length; i++) {
            int indexMax = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[indexMax]) {
                    indexMax = j;
                }
            }
            if (i != indexMax) {
                int temp = array[i];
                array[i] = array[indexMax];
                array[indexMax] = temp;
            }
        } return array;
    }
    public static int[] selectionSortMaxToMin(int[] array) {
        /*По очереди будем просматривать все подмножества элементов массива (0 - последний, 1-последний,
        2-последний,...)*/
        System.out.println("\nSelection sort of the array from Max to Min number: ");
        for (int i = 0; i < array.length; i++) {
            //int min = array[i]; // Предполагаемый минимальный элемент
            int indexMin = i;  // Индекс минимального элемента
            for (int j = i + 1; j < array.length; j++ ) {
                // Если находим новый минимум, то запоминаем его индекс
                if (array[j] > array[indexMin]) {
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
        } return array;
    }
}

