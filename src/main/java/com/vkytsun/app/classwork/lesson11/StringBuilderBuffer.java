package com.vkytsun.app.classwork.lesson11;


import java.util.Scanner;

public class StringBuilderBuffer {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder("start");
        int startInclusive = 0;
        int endExclusive = 4;
        int indexOffset = 3;
        int charIndex = 4;
        //for (int i = 0; i < 10; i++) {
            //builder = builder.append(startInclusive);
            //builder.delete(startInclusive, endExclusive);
           // builder.insert(indexOffset, " some sub string");
            builder.setCharAt(charIndex, 'a');
            System.out.println(builder.toString());
       // }
    }
    public static void charToString() {
        char[] charArrayToString = {'a','b','5','d'};
        StringBuilder builder = new StringBuilder();
        for (char value : charArrayToString){
            builder.append(value); // append(A) - преобразовать A в строку и добавить в конец;
        }
        System.out.println("String are " + builder.toString());
    }
}
