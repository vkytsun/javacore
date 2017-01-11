package com.vkytsun.app.classwork.lesson15;

public class Teacher {
    protected String name;

    public Teacher(String name) {
        this.name = name;
    }

    public String lessonFinished(String homework){
        return "work" + homework;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Teacher)) return false;

        Teacher teacher = (Teacher) o;

        return name != null ? name.equals(teacher.name) : teacher.name == null;

    }

    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                '}';
    }
}
