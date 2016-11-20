package com.vkytsun.app.classwork.lesson3;

public class Thermometr {
    public static void main(String[] args) {
        int sensor = - 129;

        byte oldThermometr;
        short newThermometr;

        oldThermometr = (byte) sensor;
        newThermometr = (short) sensor;

        System.out.println("Old thermometr " + oldThermometr);
        System.out.println("New thermometr " + newThermometr);
    }
}
