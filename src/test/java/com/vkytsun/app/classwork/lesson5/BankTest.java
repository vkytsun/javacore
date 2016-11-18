package com.vkytsun.app.classwork.lesson5;

import org.junit.*;

import static org.junit.Assert.*;


public class BankTest {
   static Bank oshadbank;

    @BeforeClass //must be always static/
    public static void precondition() {
        oshadbank = new Bank("oshadbank");
        System.out.println("Test class was started");
    }

    @Test
    public void verifyForStudent() throws Exception {
        Person student = new Person();
        student.setAge(21);
        student.setSalary(4200);
        student.setWorkFlag(true);
        student.setWorkingTime(2);
        Assert.assertTrue(oshadbank.isLoanCanBeIssued(student));
    }

    @Before
    public void messageStart() {
        System.out.println("Test started");
    }
    @After
    public void messageEnd() {
        System.out.println("Test finished");
    }

    //@Ignore ("Test disabled due to reason #1")
    @Test(timeout = 3000)
    public void verifyForPensioner() {
        Person pensioner = new Person();
        pensioner.setAge(55);
        pensioner.setSalary(5200);
        pensioner.setWorkingTime(25);
        Assert.assertTrue(oshadbank.isLoanCanBeIssued(pensioner));
    }

}