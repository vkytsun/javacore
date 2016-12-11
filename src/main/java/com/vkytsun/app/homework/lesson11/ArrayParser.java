package com.vkytsun.app.homework.lesson11;

import com.vkytsun.app.homework.lesson9.ArrayPrint;
import com.vkytsun.app.homework.lesson9.SortingArray;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Написать класс, который будет считывать данные пользователя - набор цифр через точку с запятой
 * в ряд(такой себе ArrayParser class). После нажатия Enter - формируется массив данных и запрашивается
 * у пользователя направление сортировки (от большего к меньшему или наоборот). Результат сортировки должен быть
 * выведен на экран.
 Те, кто хочет усложнить это задание:
 можете сначала запрашивать у пользователя символ разделителя, и проверять при этом что он ввел именно один символ
 (разделителем может быть любой символ кроме символов дробной части - точка или запятая в зависимости от локали
 пользователя)
 определять тип данных по формату ввода (есть дробная часть - нет дробной части)
 */
public class ArrayParser {
    public static void calcArrayParser() {
        System.out.println("Please, enter numbers, separated by semicolons in a row.");
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        String[] splittedStringArray = inputString.split(";");
        System.out.println("Created array by user:" + "\n" + Arrays.toString(splittedStringArray));

        int[] intArray = new int[splittedStringArray.length];
        for (int i = 0; i < splittedStringArray.length; i++) {
            intArray[i] = Integer.parseInt(splittedStringArray[i]);
            //System.out.print(intArray[i] + " ");
        }
        System.out.println("\nPress 1 - if want sort array from Min to Max." + "\n" +
                "Press 2 - if want sort array from Max to Min.\n");
        Scanner scannerSort = new Scanner(System.in);
        int sort = scannerSort.nextInt();
        if (sort == 1) {
            SortingArray.bubbleSortMinToMax(intArray);
            ArrayPrint.bubbleSortMintoMaxArray(intArray);
            //Arrays.sort(splittedStringArray);
            //System.out.println("Sorted array from Min to Max:" + "\n"+ Arrays.toString(splittedStringArray));
        } else if (sort == 2) {
            SortingArray.bubbleSortMaxToMin(intArray);
            ArrayPrint.bubbleSortMaxToMinArray(intArray);
        }
    }
    public static void extractLettersArray() {


    }
}

