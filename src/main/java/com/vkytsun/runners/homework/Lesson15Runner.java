package com.vkytsun.runners.homework;

import com.vkytsun.app.homework.lesson15.Bicycle;
import com.vkytsun.app.homework.lesson15.BicycleWithRing;
import com.vkytsun.app.homework.lesson15.BicycleWithRingInterface;
import com.vkytsun.app.homework.lesson15.CustomBicycle;

public class Lesson15Runner {
    public static void main(String[] args) {
        Bicycle bicycle = new CustomBicycle();
        bicycle.ride();
        bicycle.setGear();
        bicycle.setSpeed();
        //CustomBicycle customBicycle = new CustomBicycle();
        //customBicycle.setSpeed(120);
        //customBicycle.setGear(3);
        BicycleWithRingInterface ring = new BicycleWithRing();
        ring.ring();
    }
}
