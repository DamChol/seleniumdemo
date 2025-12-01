package com.example.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumHelper {

    public static void waitForClicable(WebElement element, WebDriver driver) {
        WebDriverWait wait = new WebDriverWait(driver,10L);
        wait.until(ExpectedConditions.elementToBeClickable(element));
        
    }
}
