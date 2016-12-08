package com.vkytsun.runners.homework;

import com.vkytsun.app.utils.convertors.PrimitiveConvertor;


public class Lesson3Runner {
    public static void main(String[] args) {
        PrimitiveConvertor primitiveConvertor = new PrimitiveConvertor();
        primitiveConvertor.floatToChar(12f);
        primitiveConvertor.intToChar(4);
        primitiveConvertor.charToInt('A');
    }
}
