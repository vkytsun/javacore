package com.vkytsun.app.homework.lesson10;

import com.vkytsun.runners.homework.Lesson10Runner;
import com.vkytsun.runners.homework.Lesson5MenuRunner;
import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class StringPalindromeTest {
    @Test
    public void stringPalindromeClass() {
        StringPalindrome stringPalindrome = new StringPalindrome();
    }
    @Test
    public void palindromeOneSymbol() throws Exception {
        String expectedPalindrome = "x";
        String actualResult = StringPalindrome.palindromeFirstMethod(expectedPalindrome);
        Assert.assertEquals(expectedPalindrome.length(),actualResult.length());
    }
    @Test
    public void palindromeTwoSymbols() {
        String expectedPalindrome = "ab";
        String actualResult = StringPalindrome.palindromeFirstMethod(expectedPalindrome);
        Assert.assertEquals(expectedPalindrome.length(), actualResult.length());
    }
    @Test
    public void palindromeThreeSymbols() {
        String expectedPalindrome = "#@#";
        String actualResult = StringPalindrome.palindromeFirstMethod(expectedPalindrome);
        Assert.assertEquals(expectedPalindrome.length(), actualResult.length());
    }
}