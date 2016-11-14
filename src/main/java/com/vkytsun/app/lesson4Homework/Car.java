package com.vkytsun.app.lesson4Homework;

/**
 * Created by vkytsun on 14.11.16.
 */
public class Car {
    private int priceOfTheCar;
    private String modelOfTheСar;
    public Car(int priceOfTheCar, String modelOfTheСar) {
        this.priceOfTheCar = priceOfTheCar;
        this.modelOfTheСar = modelOfTheСar;
    }
    public int getPriceOfTheCar() {
        return priceOfTheCar;
    }
    public void setPriceOfTheCar(int priceOfTheCar) {
        this.priceOfTheCar = priceOfTheCar;
    }
    public String getModelOfTheСar() {
        return modelOfTheСar;
    }
    public void setModelOfTheСar(String modelOfTheСar) {
        this.modelOfTheСar = modelOfTheСar;
    }
    public void buy(int discount) {
        this.priceOfTheCar = priceOfTheCar - discount;
    }
    public void buyCredit(int percent) {
        this.priceOfTheCar = priceOfTheCar + percent;
    }
}
