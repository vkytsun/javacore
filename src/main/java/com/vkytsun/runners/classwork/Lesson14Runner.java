package com.vkytsun.runners.classwork;

import com.vkytsun.app.classwork.lesson14.Student2;
import com.vkytsun.app.classwork.lesson14.Teacher;

public class Lesson14Runner {
    public static void main(String[] args) {
        Student2 student2 = new Student2("Vasya", "NAU", "fine");
        System.out.println(student2.toString());
        Teacher teacher = new Teacher("Kolyan", "N1");
        System.out.println(teacher.toString());
    }


}
