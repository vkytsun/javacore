package com.vkytsun.app.classwork.lesson11;

/**
 * Created by vkytsun on 09.12.16.
 */
public class ArrayStringToChar {
    public static void main(String[] args) {
        char[] charArrayToString = {'a','4','b','1','d'};
        StringBuilder builder = new StringBuilder();
        for (char value: charArrayToString) {
            builder.append(value);
            System.out.println(value);
        }
    }
}
