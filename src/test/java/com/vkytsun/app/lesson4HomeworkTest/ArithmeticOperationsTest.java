package com.vkytsun.app.lesson4HomeworkTest;

import com.vkytsun.app.lesson4Homework.ArithmeticOperations;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by vkytsun on 11/14/16.
 */
public class ArithmeticOperationsTest {
    @Test
    public void multiplyTest() {
        int a = 11, b = 3, expRes = 33;
        Assert.assertEquals(expRes, ArithmeticOperations.multiply(a, b));
    }
    @Test
    public void divisionTest() {
        int a = 100, b = 5, expRes = 20;
        Assert.assertEquals(expRes, ArithmeticOperations.division(a, b));
    }
    @Test
    public void additionTest() {
        int c = 50, d = 32, expRes = 18;
        Assert.assertEquals(expRes, ArithmeticOperations.addition(c, d));
    }
    @Test
    public void subtraction() {
        int e = 99, f = 124, expRes = -25;
        Assert.assertEquals(expRes, ArithmeticOperations.subtraction(e, f));
    }
    public void inkrement() {

    }
}
