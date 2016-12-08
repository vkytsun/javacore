package com.vkytsun.app.classwork.lesson10;

public class StringCarRunner {
    public static void main(String[] args) {
        Car car = new Car();
        CarModifier carModifier = new CarModifier();
        Car car2 = carModifier.changeCar(car);
        System.out.println(car2.name);

    }
}
