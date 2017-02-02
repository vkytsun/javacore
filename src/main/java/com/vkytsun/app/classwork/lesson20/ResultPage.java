package com.vkytsun.app.classwork.lesson20;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ResultPage {
    private WebDriver driver;

    public ResultPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getFirstLink() {
        //driver.findElement(By.id("//*[@id='_fZl']")).click();
        return driver.findElement(By.xpath("//*[@id='sbse0']//span[@class='sbpqs_a']")).getText();
    }
}
