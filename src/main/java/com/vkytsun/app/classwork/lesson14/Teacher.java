package com.vkytsun.app.classwork.lesson14;

public class Teacher extends Person{
    private String school;

    public Teacher(String name, String school) {
        super(name);
        this.school = school;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "school='" + school + '\'' +
                ",name='" + getName() + '\'' +
                '}';
    }

    final public String getSchool() {
        return school;
    }

    final public void setSchool(String school) {
        this.school = school;
    }
}
