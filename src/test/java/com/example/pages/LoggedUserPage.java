package com.example.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoggedUserPage extends BasePage {

    @FindBy(linkText = "Dashboard")
    private WebElement entryLinkElement;

    @FindBy(linkText = "Logout")
    private WebElement logoutLinkElement;

    public LoggedUserPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public WebElement getEntryLinkElement() {
        return entryLinkElement;
    }
    
    public MyAccountPage logout() {
        logoutLinkElement.click();
        return new MyAccountPage(driver);
    }

}