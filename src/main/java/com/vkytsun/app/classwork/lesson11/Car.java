package com.vkytsun.app.classwork.lesson11;

public class Car {
        String name = "BMW";

    @Override //аннотація,метод, який наслідується від класу обжект
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                '}';
    }
}
