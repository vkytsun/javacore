package com.vkytsun.app.classwork.lesson18;

import org.junit.After;
import org.junit.Before;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;
import java.util.Date;
import java.io.File;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.*;
import static org.openqa.selenium.OutputType.*;

public class test2 {
    FirefoxDriver wd;
    
    @Before
    public void setUp() throws Exception {
        wd = new FirefoxDriver();
        wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    }
    
    @Test
    public void test2() {
        wd.get("http://kinosvit.tv/");
        wd.findElement(By.xpath("//div[@id='sidebar']//span[.='Драмы']")).click();
        wd.findElement(By.linkText("Вестерн")).click();
        wd.findElement(By.xpath("//div[@id='sidebar']//span[.='Комедии']")).click();
        wd.findElement(By.linkText("Детектив К: тайна затерянного острова / Joseon myungtamjung: nobui ddal (2015) Скачать торрент")).click();
    }

    @After
    public void tearDown() {
        wd.quit();
    }
    
    public static boolean isAlertPresent(FirefoxDriver wd) {
        try {
            wd.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }
}
