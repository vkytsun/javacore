package com.vkytsun.app.classwork.lesson11;


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
}
