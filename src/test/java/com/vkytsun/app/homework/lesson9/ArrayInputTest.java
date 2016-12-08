package com.vkytsun.app.homework.lesson9;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayInputTest {
    @Test
    public void arrayInputClass() {
        ArrayInput arrayInput = new ArrayInput();
    }
    @Test
    public void arrayInputLength() throws Exception {
        int[] arrayInput = {23, 14, 6, 0, 44, 78, 91, 34, 66, 12};
        //int [] expectedArray = {12,22,1,4,66,88,90,8,19,82};
        int[] actualResult = ArrayInput.inputArray();
        Assert.assertEquals(arrayInput.length, actualResult.length);
    }
    @Test
    public void arrayInputRange() throws Exception {
        int[] actualResult = ArrayInput.inputArray();
        for (int i = 0; i < 10; i++) {
            Assert.assertTrue(actualResult[i] > 1 && actualResult[i] < 100);
        }
    }
}
