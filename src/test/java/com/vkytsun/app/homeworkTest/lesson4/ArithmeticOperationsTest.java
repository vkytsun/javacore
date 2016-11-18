package com.vkytsun.app.homeworkTest.lesson4;

import com.vkytsun.app.homework.lesson4.ArithmeticOperations;
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
    public void subtractionTest() {
        int e = 99, f = 124, expRes = -25;
        Assert.assertEquals(expRes, ArithmeticOperations.subtraction(e, f));
    }
    @Test
    public void minTest() {
        int x = 22, y = 299, expRes = 22;
        Assert.assertEquals(expRes, ArithmeticOperations.min(x, y));
    }
    @Test
    public void maxTest() {
        int x = 125, y = 229, z = -100, expRes = 229;
        Assert.assertEquals(expRes, ArithmeticOperations.max(x, y, z));
    }
    @Test
    public void sqrtTest() {
        double x = 81.0, expRes = 9.0;
        Assert.assertEquals(Double.doubleToLongBits(expRes), Double.doubleToLongBits(ArithmeticOperations.sqrt(x)));
    }
    @Test
    public void checkNullTest() {
        int a = 11, b = 4, expRes = 44;
        Assert.assertNotNull(expRes);
    }
    @Test
    public void checkTrueTest() {
        Assert.assertFalse("not same", false);
    }
    @Test
    public void inkrementTest() {
        int h = 10, k = 5, expRes = 16;
        Assert.assertEquals(expRes, ArithmeticOperations.inkrement(h, k));
    }
    @Test
    public void dekrementTest() {
        int m = 20, n = 8, expRes = 13;
        Assert.assertEquals(expRes, ArithmeticOperations.dekrement(m, n));
    }
 }