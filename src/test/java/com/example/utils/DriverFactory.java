package com.example.utils;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {

    private static WebDriver driver;

    public static WebDriver getDriver() throws IOException {
        if (driver == null) {
        String browser = PropertiesReader.readProperties("browser");
        switch (browser.toLowerCase()) {
        case "chrome": 
        WebDriverManager.chromedriver().setup();
        return new ChromeDriver();
        case "firefox":
        WebDriverManager.firefoxdriver().setup();
        return new FirefoxDriver();
        default:
        WebDriverManager.chromedriver().setup();
        return new ChromeDriver();
    }
}
    return driver;
    
    }
}
