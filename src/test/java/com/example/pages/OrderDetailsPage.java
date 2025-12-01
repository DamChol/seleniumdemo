package com.example.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class OrderDetailsPage extends BasePage{

    public OrderDetailsPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }


}
