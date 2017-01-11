package com.vkytsun.app.classwork.lesson15;

public abstract class Car1 {
    public String name = "Car";

    public abstract void drive();

    protected int openDoors() {
        return 3;
    }

    public Car1(String name) {
        this.name = name;
    }

}
