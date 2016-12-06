package com.vkytsun.app.homework.lesson9;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayInputTest {
    @Test
    public void inputArray() throws Exception {
        int [] expectedArray = {12,22,1,4,66,88,90,8,19,82};
        int [] actualResult = ArrayInput.inputArray();
        Assert.assertFalse(expectedArray == actualResult);
    }

}