package com.vkytsun.app.classwork.lesson15;

public class Audi extends Car1{
    private String name;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Audi)) return false;

        Audi audi = (Audi) o;

        return name != null ? name.equals(audi.name) : audi.name == null;

    }

    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }

    public Audi(String name) {
        super(name);
    }

    @Override
    public void drive() {
        System.out.println("90 emissions");
    }
}
