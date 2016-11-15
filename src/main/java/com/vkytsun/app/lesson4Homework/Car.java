package com.vkytsun.app.lesson4Homework;

/**
 * Created by vkytsun on 14.11.16.
 */
public class Car {
    private int priceOfTheCar;
    private String modelOfTheСar;
    public Car(int a, String Ford) {
        priceOfTheCar = a;
        modelOfTheСar = Ford;
    }
    public int getPriceOfTheCar() {
        return priceOfTheCar;
    }
    public void setPriceOfTheCar(int a) {
        priceOfTheCar = a;
    }
    public String getModelOfTheСar() {
        return modelOfTheСar;
    }
    public void setModelOfTheСar(String Ford) {
        modelOfTheСar = Ford;
    }
    public void buy(int a, int discount) {
        priceOfTheCar = a - discount;
    }
    public void buyCredit(int a, int percent) {
        priceOfTheCar = a + percent;
    }
}
