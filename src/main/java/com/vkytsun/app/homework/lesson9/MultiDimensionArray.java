package com.vkytsun.app.homework.lesson9;

import java.sql.Array;
import java.util.Arrays;

/**
 * Создать двумерный массив из 5 строк по 8 столбцов в каждой из случайных целых чисел из отрезка [-99;99].
 * Вывести массив на экран. После на отдельной строке вывести на экран значение максимального элемента этого
 * массива (его индекс не имеет значения).
 */
public class MultiDimensionArray {
    public static int[][] multiDimensionArrayMaxElement() {
        int[][] array = new int[5][8];
        System.out.println("\nMulti-dimension array[5][8] is: ");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (Math.random() * 199 - 99);
                System.out.printf("%4d", array[i][j]);
            }
            System.out.println();
        }
        int maxNumber = array[0][0];
        int minNumber = array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (maxNumber < array[i][j]) {
                    maxNumber = array[i][j];
                }
                else if (minNumber > array[i][j]) {
                    minNumber = array[i][j];
                }
            }
        }
        System.out.println("\nMaximum number of an array is: " + maxNumber);
        System.out.println("Minimum number of an array is: " + minNumber);
        return array;
    }
}
