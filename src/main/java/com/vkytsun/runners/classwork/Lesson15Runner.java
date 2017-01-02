package com.vkytsun.runners.classwork;

import com.vkytsun.app.classwork.lesson15.Audi;
import com.vkytsun.app.classwork.lesson15.BMW;
import com.vkytsun.app.classwork.lesson15.Car1;

public class Lesson15Runner {
    public static void main(String[] args) {
        Car1 bmw = new BMW();
        Car1 audi = new Audi();
        printEmissions(bmw);
        printEmissions(audi);
    }
    public static void printEmissions(Car1 car1) {
        car1.drive();
    }
}
