package com.vkytsun.app.classwork.lesson15;

public class BMW {
    private Engine bmwEngine;

    public BMW(String name) {
        bmwEngine = new Engine();
        bmwEngine.setTypeOfCylinder(name);
    }

    public void drive() {
        System.out.println("94 emissions");
    }

}
