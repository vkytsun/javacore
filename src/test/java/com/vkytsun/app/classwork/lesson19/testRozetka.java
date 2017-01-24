package com.vkytsun.app.classwork.lesson19;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class testRozetka {

    private WebDriver driver;

    @Before
    public void setUp() throws Exception{
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

    }
    @Test
    public void testTitle() {
        //WebElement element;
        driver.get("http://rozetka.com.ua");
        driver.findElement(By.xpath("//input[@title='Интернет магазин']")).isSelected();
        driver.findElement(By.linkText("Интернет магазин"));
    }
    @After
    public void exit() {
        driver.quit();
    }


}
