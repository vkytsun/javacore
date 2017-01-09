package com.vkytsun.app.homework.lesson15;

public abstract class Bicycle {
    public void ride() {
        System.out.println("Wroom!");
    }

    public abstract int setSpeed (int speed);

    public abstract int setGear(int gear);
}
