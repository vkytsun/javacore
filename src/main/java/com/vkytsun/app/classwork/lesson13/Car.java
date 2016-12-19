package com.vkytsun.app.classwork.lesson13;

public class Car {
  //  private int price;
    private String color, model;
    private int price = 10000;

    /*public Car() {
        this.model = "BMW";
        this.color = "red";
        this.price = 100000;
    }
    @Override
    public String toString() {
        return "Car{" +
                "price=" + price +
                ", color='" + color + '\'' +
                ", model='" + model + '\'' +
                '}';
    }*/

    public int getPrice() {
        return price;
    }
    //public void setPrice(int price) {
      //  this.price = price;
    //}

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
