package com.vkytsun.runners.classwork;

import com.vkytsun.app.classwork.lesson17.ArraySorterGenericsClasswork;

import java.util.Arrays;

public class Lesson17Runner {
    //public Integer[] array = new Integer[10];

    public static void main(String[] args) {
        Integer[] arrayInteger = {3,4,-10,34,100};
        ArraySorterGenericsClasswork arraySorterGenericsClasswork = new ArraySorterGenericsClasswork();
        arraySorterGenericsClasswork.bubbleSortMigenToMax(arrayInteger);
        System.out.println(Arrays.toString(arraySorterGenericsClasswork.bubbleSortMigenToMax(arrayInteger)));
    }
}
