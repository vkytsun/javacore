package com.vkytsun.app.homework.lesson10;

import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class StringPalindromeTest {

    String isPalindrome = "12321";
    String isPalindrome1 = "qwerewq";
    String isPalindrome2 = "a";
    String isPalindrome3 = "Amy, must I jujitsu my ma?";
    String notPalindrome = "asdaaq";
    boolean expResTrue = true;
    boolean expResFalse = false;

    @Test
    public void stringPalindromeClass(){
        StringPalindrome stringPalindrome = new StringPalindrome();
    }
    @Test
    public void palindromeFirstMethodV1() throws Exception {
        boolean actualResult = StringPalindrome.palindromeFirstMethod(isPalindrome);
        Assert.assertEquals(expResTrue,actualResult);
    }
    @Test
    public void palindromeFirstMethodV2() throws Exception {
        boolean actualResult = StringPalindrome.palindromeFirstMethod(notPalindrome);
        Assert.assertEquals(expResFalse,actualResult);
    }
    @Test
    public void palindromeSecondMethodV1() throws Exception {
        boolean actualResult = StringPalindrome.palindromeSecondMethod(isPalindrome1);
        Assert.assertEquals(expResTrue,actualResult);
    }
    @Test
    public void palindromeSecondMethodV2() throws Exception {
        boolean actualResult = StringPalindrome.palindromeSecondMethod(notPalindrome);
        Assert.assertEquals(expResFalse,actualResult);
    }
    @Test
    public void palindromeThirdMethodV1() throws Exception {
        boolean actualResult = StringPalindrome.palindromeThirdMethod(isPalindrome2);
        Assert.assertEquals(expResTrue,actualResult);
    }

    @Test
    public void palindromeThirdMethodV2() throws Exception {
        boolean actualResult = StringPalindrome.palindromeThirdMethod(notPalindrome);
        Assert.assertEquals(expResFalse,actualResult);
    }
    @Test
    public void palindromeFourthMethodV1() throws Exception {
        boolean actualResult = StringPalindrome.palindromeFourthMethod(notPalindrome);
        Assert.assertEquals(expResFalse,actualResult);
    }
    @Test
    public void palindromeFourthMethodV2() throws Exception {
        boolean actualResult = StringPalindrome.palindromeFourthMethod(isPalindrome);
        Assert.assertEquals(expResTrue,actualResult);
    }
    @Test
    public void palindromeFifthMethodV1() throws Exception {
        boolean actualResult = StringPalindrome.palindromeFifthMethod(isPalindrome3);
        Assert.assertEquals(expResTrue,actualResult);
    }
    @Test
    public void palindromeFifthMethodV2() throws Exception {
        boolean actualResult = StringPalindrome.palindromeFifthMethod(notPalindrome);
        Assert.assertEquals(expResFalse,actualResult);
    }
}