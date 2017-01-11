package com.vkytsun.runners.classwork;

import com.vkytsun.app.classwork.lesson15.*;

public class Lesson15Runner {
    public static void main(String[] args) {
        BMW bmw = new BMW("V7");
      //  System.out.println("BMW" + bmw.name);
        Car1 audi = new Audi("A6");
      //  printEmissions(bmw);
        printEmissions(audi);
        Mentor mentor = new Mentor("Vova");
        System.out.println(mentor.toString());
        mentor.lessonFinished("homework");
        mentor.lessonFinished("homework", 15);
    }
    public static void printEmissions(Car1 car1) {
        car1.drive();
    }
}
