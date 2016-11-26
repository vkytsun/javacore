package com.vkytsun.app.homework.lesson5;

import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class JunitLesson5Test {
    @Test
    public void lesson5Class() {
        CircleArea circle = new CircleArea();
        DefineNumber number = new DefineNumber();
        RightAngledTriangle triangle = new RightAngledTriangle();
    }
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
    public void checkAreaEqualsArea1() {
        double PI = 3.14d, r1 = 10, r2 = 1, circleArea1 = 314.0 ;
        double actualResult = CircleArea.calcBiggerArea(r1,r2);
        Assert.assertEquals(circleArea1, actualResult, 1e-5);
    }
    @Test
    public void checkAreaEqualsArea2() {
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
    public void rightAngledTriangleA() {
        double a = 5, b = 4, c = 3;
        double actualResult = RightAngledTriangle.checkRightAngledTriangle(a, b, c);
        Assert.assertEquals(a, actualResult, 1e-5);
    }
    @Test
    public void rightAngledTriangleB() {
        double a = 4, b = 5, c = 3;
        double actualResult = RightAngledTriangle.checkRightAngledTriangle(a, b, c);
        Assert.assertEquals(b, actualResult, 1e-5);
    }
    @Test
    public void rightAngledTriangleC() {
        double a = 3, b = 4, c = 5;
        double actualResult = RightAngledTriangle.checkRightAngledTriangle(a, b, c);
        Assert.assertEquals(c, actualResult, 1e-5);
    }
    @Test
    public void rightAngledTriangleNotEqualsA() {
        double a = 13, b = -4, c = 1;
        double actualResult = RightAngledTriangle.checkRightAngledTriangle(a, b, c);
        Assert.assertNotEquals(a, actualResult, 1e-5);
    }
    @Test
    public void rightAngledTriangleNotEqualsB() {
        double a = 3, b = 14, c = -2;
        double actualResult = RightAngledTriangle.checkRightAngledTriangle(a, b, c);
        Assert.assertNotEquals(b, actualResult, 1e-5);
    }
    @Test
    public void rightAngledTriangleNotEqualsC() {
        double a = -3, b = 4, c = 15;
        double actualResult = RightAngledTriangle.checkRightAngledTriangle(a, b, c);
        Assert.assertNotEquals(c, actualResult, 1e-5);
    }
    @Test
    public void odd() {
        int x = 5;
        int actualResult = DefineNumber.defEvenOdd(x);
        Assert.assertEquals(x, actualResult);
    }
    @Test
    public void even() {
        int x = 88;
        int actualResult = DefineNumber.defEvenOdd(x);
        Assert.assertEquals(x, actualResult);
    }
    @Test
    public void biggerNumberFirst() {
        int a = 121, b = 32;
        int actualResult = DefineNumber.defBiggerNumber(a,b);
        Assert.assertEquals(a, actualResult);
    }
    @Test
    public void biggerNumberSecond() {
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
