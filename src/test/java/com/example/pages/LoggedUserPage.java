package com.example.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoggedUserPage {

    @FindBy(linkText = "Dashboard")
    private WebElement entryTitleElement;

    @FindBy(xpath = "//li[text()=' An account is already registered with your email address. Please log in.		']")
    private WebElement accountRegisteredErrorElement;

    WebDriver driver;

    public LoggedUserPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public WebElement getEntryTitleElement() {
        return entryTitleElement;
    }

    public WebElement getAccountRegisteredErrorElement() {
        return accountRegisteredErrorElement;
    }

}