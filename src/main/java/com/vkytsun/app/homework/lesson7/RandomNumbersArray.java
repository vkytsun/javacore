package com.vkytsun.app.homework.lesson7;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

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
                //randomArray[i][j] = 10 + new Random().nextInt(90);
                randomArray[i][j] = (int)(Math.random() * 90 + 10);
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
                System.out.printf("%4d", randomArray[i][j]);
            }
            System.out.println();
        }
    }
        public static void numbers() {
       /* int intValue = 0;
        boolean string = true;

        System.out.println("Please, enter the number or 'exit'.");
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        int inputNumber = scanner.nextInt();
        if () {
        sum += Integer.parseInt();
        }
        else if (!string.toLowerCase().equals("exit")) {
        }
        System.out.println("The sum of all the numbers entered by the user. " + sum );
    */}
}
