package com.vkytsun.app.classwork.lesson14;

public class Student2 extends Person{
    private String university;
    private String response = "What the question?";

    public Student2(String name, String university, String response) {
        super(name);
        this.university = university;
        this.response = response;
        //this.name = name;
    }

    @Override
    public String toString() {
        return "Student2{" +
                "university='" + university + '\'' +
                ", response='" + response + '\'' +
                ", name='" + getName() + '\'' +
                '}';
    }
}
