package com.vkytsun.runners.classwork;

import com.vkytsun.app.classwork.lesson16.Holidays;

public class Lesson16Runner {
    public static void main(String[] args) {
        for (Holidays holidays : Holidays.values()) {
            System.out.println(holidays.toString());
        }
    }
}
