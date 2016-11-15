package com.vkytsun.app.lesson5Classwork;

public class Main {
    public static void main(String[] args) {
        /** создаем новые обькты */
        Bank oshadbank = new Bank("Oshadbank");
        Bank privatebank = new Bank("Privatebank");
        Bank pumb = new Bank("PUMB");

        /* oshadbank.showName();
        privatebank.showName();
        pumb.showName();

        System.out.println("USD_RATE: " + Bank.getUsdRate());
        */

        Person richMan = new Person();
        richMan.setAge(72);
        richMan.setFeedbackFlag(true);
        richMan.setSalary(30000);
        richMan.setWorkFlag(false);
        richMan.setWorkingTime(0);

        Person nishebrod = new Person();
        nishebrod.setAge(28);
        nishebrod.setFeedbackFlag(false);
        nishebrod.setSalary(1000);
        nishebrod.setWorkFlag(false);
        nishebrod.setWorkingTime(1);

        Person teenager = new Person();
        teenager.setAge(16);

        Person pensioner = new Person();
        pensioner.setAge(75);
        pensioner.setSalary(1200);
        pensioner.setWorkingTime(25);

        Person student = new Person();
        student.setAge(21);
        student.setSalary(4200);
        student.setWorkFlag(true);
        student.setWorkingTime(2);

        System.out.println("Loan accepted: " + privatebank.isLoanCanBeIssued(richMan));
    }
}
