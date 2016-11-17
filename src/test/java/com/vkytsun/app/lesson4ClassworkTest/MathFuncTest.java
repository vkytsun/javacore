package com.vkytsun.app.lesson4ClassworkTest;

import com.vkytsun.app.classwork.lesson4.MathFunc;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by vkytsun on 11.11.16.
 */
public class MathFuncTest {
    @Test  //JUnit framework annotation
    public void multiplyTest() {
        int a = 3, b = 2, expRes = 6;
        Assert.assertEquals(expRes, MathFunc.multiply(a,b));
    }
}
