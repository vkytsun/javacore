package com.vkytsun.app.classwork.lesson9;

import java.util.Arrays;
/** 1. Create some char Array which contains ASCII chars from code 0 to code 255.
    2. Convert char Array to String using Arrays.toString(charArray) method.
    3. Print this String on display.
*/
public class CharArray {
    public static void main(String[] args) {
        charArrayToString();
    }
    private static char[] charArrayToString() {
        char[] array = new char[255];
        for (int i = 0; i < array.length; i++) {
            array[i] = (char) i;
        }
        System.out.println("Char array:\n" +
                Arrays.toString(array));
        return array;
    }
}
