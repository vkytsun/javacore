package com.vkytsun.app.homework.lesson7;


import java.util.Arrays;
import java.util.Random;

public class RandomNumbersArray {
    public static void randomNumberArray() {
        int a = 0;
        Random randomNumber = new Random();
        int[] randomArray = new int[15];
        System.out.println("\nRandom numbers of an array[0-9] are: ");
        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = randomNumber.nextInt(10);
            System.out.print(randomArray[i] + " ");
            if (randomArray[i] % 2 == 0) {
                a++;
            }
        }
        System.out.println("\nEven numbers of an array[0-9] are: " + a);

    }
    public static void randomNumberMinMaxArray() {
        Random randomNumber = new Random();
        int[] randomArray = new int[15];
        System.out.println("\nRandom numbers of an array[0-999] are: ");
        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = randomNumber.nextInt(1000);
            System.out.print(randomArray[i] + " ");
        }
        int maxNumber = randomArray[0];
        int minNumber = randomArray[0];
        for (int i = 0; i < randomArray.length; i++) {
            if (maxNumber < randomArray[i]) {
                maxNumber = randomArray[i];
            }
            else if (minNumber > randomArray[i]) {
                minNumber = randomArray[i];
            }
        }
        System.out.println("\nMaximum number of an array is: " + maxNumber);
        System.out.println("Minimum number of an array is: " + minNumber);
    }
    public static void multiDimensionArray() {
        int[][] randomArray = new int[8][5];
        System.out.println("\nMulti-dimension array[8][5] is: ");
        for (int i = 0; i < randomArray.length; i++) {
            for (int j = 0; j < randomArray[i].length; j++) {
                randomArray[i][j] = 10 + new Random().nextInt(90);
                //intArrayRandom[i][j] = (int)(Math.random() * 90 + 10);
            }
            //Output array as single string with comma delimiter
            System.out.println(Arrays.toString(randomArray[i]));
        }
    }
    public static void rightSideFormatArray() {
        int[][] randomArray = new int[8][5];
        System.out.println("\nMulti-dimension array[8][5] is: ");
        for (int i = 0; i < randomArray.length; i++) {
            for (int j = 0; j < randomArray[i].length; j++) {
                randomArray[i][j] = 1 + new Random().nextInt(999);
                // not format yet by right side
                System.out.println(randomArray[i][j]);
            }
        }
    }
}
