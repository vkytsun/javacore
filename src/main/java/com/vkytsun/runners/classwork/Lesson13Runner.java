package com.vkytsun.runners.classwork;


import com.vkytsun.app.classwork.lesson13.Car;
import com.vkytsun.app.classwork.lesson13.Student;

public class Lesson13Runner {
    public static void main(String[] args) {
        //Car car = new Car();
        //System.out.println(car);
        //System.out.println(car.getPrice());
        Student student = new Student();
        student.setName("Jack");
        student.setAge(22);
        student.setFaculty("Fel");
        System.out.println(student.getName());
        System.out.println(student.getAge());
        System.out.println(student.getFaculty());

    }
}
