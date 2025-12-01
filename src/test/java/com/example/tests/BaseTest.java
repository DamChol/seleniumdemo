package com.example.tests;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.example.utils.DriverFactory;

public class BaseTest {

    WebDriver driver;

    @BeforeTest
    public void setup() throws IOException {
        driver = DriverFactory.getDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("http://seleniumdemo.com");
        // driver.manage().window().fullscreen();
}

    @AfterTest
    public void tearDown() {
        driver.quit();
        driver = null;
    }

}
