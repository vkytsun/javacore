package com.vkytsun.app.lesson3;

/**
 * Created by vkytsun on 08.11.16.
 */
public class NarrowingCasting {
    public static void main(String[] args) {
        double d = 3.14159d;
        float f = 0.0f;

        f = (float) d;

        System.out.println(f);
    }
}
