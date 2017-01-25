package com.vkytsun.app.classwork.lesson20;


import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class testRozetka {

    private WebDriver driver;
    private String text = "Интернет магазин";
    private String searchText = "Iphone 6s";

    @Before
    public void setUp() throws Exception{
        driver = new FirefoxDriver();
        //WebDriverWait wait = new WebDriverWait(driver, 30);
        driver.get("http://rozetka.com.ua");
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);


    }
    @Test
    public void testTitle() {
        driver.findElement(By.className("logo"));
        driver.findElement(By.xpath("//div[@class='logo']"));
        //Assert.assertTrue(driver.getCurrentUrl().contains(text));
        //Assert.assertTrue(driver.findElement(By.cssSelector("title")).getText().contains(text));
    }
/*    @Test
    public void testSearchText() {
        driver.findElement(By.xpath())
    }*/
    @After
    public void tearDown() {
        driver.quit();
    }


}
