package com.vkytsun.app.classwork.lesson20;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class GoogleTestPage {
    private FirefoxDriver driver;
    @Before
    public void setUp() {
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://google.com");
    }
    @After
    public void tearDown() {
        driver.close();
    }
    @Test
    public void testSearch() {
        HomePage home = new HomePage(driver);
        ResultPage result = home.search("automated testing info");
        Assert.assertTrue(result.getFirstLink().contains("automated"));
    }
}
