package com.vkytsun.app.lesson5Classwork;

public class Person {
    private int age, workingTime;
    private boolean workFlag, feedbackFlag;
    private double salary;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWorkingTime() {
        return workingTime;
    }

    public void setWorkingTime(int workingTime) {
        this.workingTime = workingTime;
    }

    public boolean isWorkFlag() {
        return workFlag;
    }

    public void setWorkFlag(boolean workFlag) {
        this.workFlag = workFlag;
    }

    public boolean isFeedbackFlag() {
        return feedbackFlag;
    }

    public void setFeedbackFlag(boolean feedbackFlag) {
        this.feedbackFlag = feedbackFlag;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
