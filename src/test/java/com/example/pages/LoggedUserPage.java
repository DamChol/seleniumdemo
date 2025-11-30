package com.example.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoggedUserPage {

    @FindBy(linkText = "Dashboard")
    private WebElement entryLinkElement;

    @FindBy(linkText = "Logout")
    private WebElement logoutLinkElement;

    WebDriver driver;

    public LoggedUserPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public WebElement getEntryLinkElement() {
        return entryLinkElement;
    }
    
    public MyAccountPage logout() {
        logoutLinkElement.click();
        return new MyAccountPage(driver);
    }

}