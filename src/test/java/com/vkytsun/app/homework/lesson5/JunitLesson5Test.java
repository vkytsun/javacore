package com.vkytsun.app.homework.lesson5;

import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class JunitLesson5Test {
    @Test
    public void calcCircleAreaEquals() {
        double pi = 3.14, r = 8, expRes = 200.96;
        double actualResult = CircleArea.calcCircleArea(r);
        Assert.assertEquals(Double.doubleToLongBits(expRes), Double.doubleToLongBits(actualResult));
    }
    @Test
    public void calcCircleAreaFalse() {
        double PI = 3.14, r = 10, circleArea = 314;
        double actualResult = CircleArea.calcCircleArea(r);
        Assert.assertFalse(circleArea == 1000);
    }
    @Test
    public void calcCircleAreaNull() {
        double pi = 3.14, r = 8, expRes = 200.96;
            double actualResult = CircleArea.calcCircleArea(r);
        Assert.assertNotNull(actualResult);
    }
    @Test
    public void checkAreaEquals() {
        double PI = 3.14d, r1 = 1, r2 = 10, circleArea2 = 314.0 ;
        double actualResult = CircleArea.calcBiggerArea(r1,r2);
        Assert.assertEquals(circleArea2, actualResult, 1e-5);
    }
    @Test
    public void calcBiggerAreaFalse1() {
        double PI = 3.14d, r1 = 100, r2 = 11, circleArea1 = 31400;
        double actual3 = CircleArea.calcBiggerArea(r1,r2);
        Assert.assertFalse(circleArea1 == 12326);
    }
    @Test
    public void calcBiggerAreaFalse2() {
        double PI = 3.14d, r1 = 10, r2 = 1, circleArea2 = 314;
        double actual3 = CircleArea.calcBiggerArea(r1,r2);
        Assert.assertFalse(circleArea2 == 200);
    }
    @Test
    public void pythagoreanTheoremEquals() {
        double a = 3, b = 4, c = 5;
        double actualResult = RightAngledTriangle.pythagoreanTheorem(a, b);
        Assert.assertEquals(Double.doubleToLongBits(c), Double.doubleToLongBits(actualResult));
    }
    @Test
    public void pythagoreanTheoremNotEquals() {
        double a = 3, b = 4, c = 8;
        double actualResult = RightAngledTriangle.pythagoreanTheorem(a, b);
        Assert.assertNotEquals(Double.doubleToLongBits(c), Double.doubleToLongBits(actualResult));
    }
    @Test
    public void evenOdd() {
        int x = 5;
        int actualResult = DefineNumber.defEvenOdd(x);
        Assert.assertEquals(x, actualResult);
    }
    @Test
    public void biggerNumber() {
        int a = -23, b = 23;
        int actualResult = DefineNumber.defBiggerNumber(a,b);
        Assert.assertEquals(b, actualResult);
    }
    @Test
    public void biggerNumberNotEquals() {
        int a = 123, b = 230;
        int actualResult = DefineNumber.defBiggerNumber(a,b);
        int expectedResul = a;
        Assert.assertNotEquals(expectedResul, actualResult);
    }
}
