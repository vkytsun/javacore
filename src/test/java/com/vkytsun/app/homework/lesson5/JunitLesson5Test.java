package com.vkytsun.app.homework.lesson5;

import com.vkytsun.app.homework.lesson5.CircleArea;
import com.vkytsun.app.homework.lesson5.CircleRadius;
import com.vkytsun.app.homework.lesson5.EvenOdd;
import com.vkytsun.app.homework.lesson5.RightAngledTriangle;
import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class JunitLesson5Test {
    @Test
    public void calcCircleAreaEquals() {
        double pi = 3.14, r = 8, expRes = 200.96;
        double actualResult = CircleRadius.calcCircleArea(pi,r);
        Assert.assertEquals(Double.doubleToLongBits(expRes), Double.doubleToLongBits(actualResult));
    }
    @Test
    public void calcCircleAreaNull() {
        double pi = 3.14, r = 8, expRes = 200.96;
            double actualResult = CircleRadius.calcCircleArea(pi,r);
        Assert.assertNotNull(actualResult);
    }
    @Test
    public void checkAreaEquals() {
        double pi = 3.14, r1 = 1, r2 = 10, expRes1 = 3.140, expRes2 = 314.0 ;
        double actualResult1 = CircleRadius.calcCircleArea(pi, r1);
        double actualResult2 = CircleRadius.calcCircleArea(pi, r2);
        Assert.assertEquals(expRes1, actualResult1, 1e-5);
        Assert.assertEquals(expRes2, actualResult2, 1e-5);
    }
    @Test
    public void checkAreaNotEquals() {
        double pi = 3.14, r1 = 11, r2 = 16, expRes1 = 314, expRes2 = 706.5;
        double actualResult1 = CircleRadius.calcCircleArea(pi, r1);
        double actualResult2 = CircleRadius.calcCircleArea(pi, r2);
        Assert.assertNotEquals(expRes1, actualResult1, 1e-5);
        Assert.assertNotEquals(expRes2, actualResult2, 1e-5);
    }
    @Test
    public void pythagoreanTheoremEquals() {
        double a = 3, b = 4, c = 5;
        double actualResult = RightAngledTriangle.PythagoreanTheorem(a, b);
        Assert.assertEquals(Double.doubleToLongBits(c), Double.doubleToLongBits(actualResult));
    }
    @Test
    public void pythagoreanTheoremNotEquals() {
        double a = 3, b = 4, c = 8;
        double actualResult = RightAngledTriangle.PythagoreanTheorem(a, b);
        Assert.assertNotEquals(Double.doubleToLongBits(c), Double.doubleToLongBits(actualResult));
    }
    @Test
    public void evenOdd() {
        int x = 5;
        int actualResult = EvenOdd.defEvenOdd(x);
        Assert.assertEquals(x, actualResult);
    }
}
