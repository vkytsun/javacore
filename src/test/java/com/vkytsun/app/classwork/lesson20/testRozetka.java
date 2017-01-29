package com.vkytsun.app.classwork.lesson20;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.concurrent.TimeUnit;

public class testRozetka {

    private WebDriver driver;
    private String url = "http://rozetka.com.ua";
    private String text = "Интернет магазин Rozetka.ua";
    private String searchText = "Apple iPhone 6s";

    @Before
    public void setUp() throws Exception{
        driver = new FirefoxDriver();
        //WebDriverWait wait = new WebDriverWait(driver, 30);
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    }
    @Test
    public void testTitle() {
        driver.findElement(By.className("logo"));
        driver.findElement(By.xpath("//div[@class='logo']"));
    }
    @Test
    public void testSearchText() {
        //driver.findElement(By.name("text")).sendKeys(searchText);
        driver.findElement(By.xpath(".//*[@id='rz-search']/form/div[1]/div[2]/input")).sendKeys(searchText);
        driver.findElement(By.xpath("//span[@class='btn-link btn-link-green']")).click();
        driver.findElement(By.xpath("//div[@class='g-i-tile-i-title clearfix']/a[@href='http://rozetka.com.ua/apple_iphone_6s_32gb_rose_gold/p12136258/']"));
    }
    @After
    public void tearDown() {
        driver.quit();
    }


}
