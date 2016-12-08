package com.vkytsun.app.homework.lesson9;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;


public class MultiDimensionArrayTest {
    @Test
    public void MultiDimensionArrayClass() {
        MultiDimensionArray multiDimensionArray = new MultiDimensionArray();
    }
    @Test
    public void multiDimensionArrayRange() throws Exception {
        int[][] actualResult = MultiDimensionArray.multiDimensionArrayMaxElement();
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 8; j++) {
                Assert.assertTrue(actualResult[i][j] > -99 && actualResult[i][j] < 99);
            }

        }
    }
    @Test
    public void multiDimensionArrayLength() throws Exception {
        int[][] expectedResult = new int[5][8];
        int[][] actualResult = MultiDimensionArray.multiDimensionArrayMaxElement();
        Assert.assertEquals(expectedResult.length, actualResult.length);
    }
}