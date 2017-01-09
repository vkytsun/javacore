package com.vkytsun.app.homework.lesson15;

public class CustomBicycle extends Bicycle{
    //private int speed;
    //private int gear;

    @Override
    public void ride() {
        //super.ride();
        System.out.println("Wshhhh!");
    }

    @Override
    public int setSpeed(int speed) {
        //this.speed = speed;
        System.out.println("Speed is " + speed);
        return speed;
    }

    @Override
    public int setGear(int gear) {
        //this.gear = gear;
        System.out.println("Gear is " + gear);
        return gear;
    }
}
