package com.vkytsun.app.lesson4HomeworkTest;

import com.vkytsun.app.lesson4Homework.InkrementDekrement;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by vkytsun on 11/14/16.
 */
public class InkrementDekrementTest {
    @Test
    public void inkrementTest() {
        int h = 10, k = 5, expRes = 16;
        Assert.assertEquals(expRes, InkrementDekrement.inkrement(h, k));
    }
    @Test
    public void dekrementTest() {
        int m = 20, n = 8, expRes = 13;
        Assert.assertEquals(expRes, InkrementDekrement.dekrement(m, n));
    }
}
