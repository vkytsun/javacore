package com.vkytsun.app.classwork.lesson20;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public ResultPage search(String text) {
        driver.findElement(By.id("lst-ib")).sendKeys(text);
        return new ResultPage(driver);
    }

}
