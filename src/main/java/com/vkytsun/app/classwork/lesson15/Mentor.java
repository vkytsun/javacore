package com.vkytsun.app.classwork.lesson15;

public class Mentor extends Teacher {
    public Mentor(String name) {
        super(name);
    }

    public String lessonFinished(String homework, int number){
        System.out.println(homework + " " + number);
        return "work" + homework + number;
    }
 }
