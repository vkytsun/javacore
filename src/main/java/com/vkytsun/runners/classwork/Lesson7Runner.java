package com.vkytsun.runners.classwork;

import com.vkytsun.app.classwork.lesson7.Loops;

import java.sql.Array;
import java.util.Arrays;

/**
 * Created by vkytsun on 26.11.16.
 */
public class Lesson7Runner {
    public static void main(String[] args) {
        Loops.counterWhile(4,2);
        Loops.counterFor(1,10);
        int a = 1;
        System.out.println("Origin value a = " + a);
        System.out.println("Post-increment a = " + a++);
        System.out.println("After post-increment a = " + a);
        System.out.println("Pre-increment a = " + ++a);
        System.out.println("After pre-increment a = " + --a);

        Loops.counterForEven(20);

        // Массив - это обьект, контейнер, который содержит определенный набор индексерованных значений одного типа
        int[] intArray = {1, 2, 3};
        for (int j = 0; j < intArray.length; j++) {
            System.out.println("элементы одномерного массива " + intArray[j]);
            //output array as single string with comma delimiter;
            System.out.println(Arrays.toString(intArray));
        }

        //for each loop - simpler way to iterate all elements in array;
       for (int arrElement : intArray) {
            System.out.println(arrElement);
        }
        //Run thorough multi-dimension array
        int[][] intArray2 = new int[2][3];
        for (int j = 0; j < intArray2.length; j++) {
            for (int k = 0; k < intArray2[j].length; k++) {
                intArray2[j][k] = j * k;
                System.out.println("\t" + intArray2[j][k]);
            }
        }

    }

}
