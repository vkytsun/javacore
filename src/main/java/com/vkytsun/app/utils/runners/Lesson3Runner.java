package com.vkytsun.app.utils.runners;

import com.vkytsun.app.utils.convertors.PrimitiveConvertor;

/**
 * Created by vkytsun on 10.11.16.
 */
public class Lesson3Runner {
    public static void main(String[] args) {
        PrimitiveConvertor primitiveConvertor = new PrimitiveConvertor();
        primitiveConvertor.floatToChar(12f);
        primitiveConvertor.intToChar(4);
        primitiveConvertor.charToInt('A');
    }
}
