package com.vkytsun.app.homework.lesson15;

public class CustomBicycle extends Bicycle{
    private int speed;
    private int gear;

    @Override
    public void ride() {
        super.ride();
        System.out.println("Wshhhh!");
    }

    @Override
    public void setSpeed() {
        this.speed = 100;
        System.out.println("Speed is " + speed);
    }

    @Override
    public void setGear() {
        this.gear = 4;
        System.out.println("Gear is " + gear);
    }
}
