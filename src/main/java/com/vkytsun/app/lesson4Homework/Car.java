package com.vkytsun.app.lesson4Homework;

/**
 * Created by vkytsun on 14.11.16.
 */
public class Car {
    private int priceOfTheCar;
    private String modelOfTheСar;
    public Car(int price, String model) {
        priceOfTheCar = price;
        modelOfTheСar = model;
    }
    public int getPriceOfTheCar() {
        return priceOfTheCar;
    }
    public void setPriceOfTheCar(int price) {
        priceOfTheCar = price;
    }
    public String getModelOfTheСar() {
        return modelOfTheСar;
    }
    public void setModelOfTheСar(String model) {
        modelOfTheСar = model;
    }
    public void buy(int price, int discount) {
        priceOfTheCar = price - discount;
    }
    public void buyCredit(int price, int percent) {
        priceOfTheCar = price + percent;
    }
}
