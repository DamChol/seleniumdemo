package com.example.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAccountPage {

    @FindBy(xpath="//h1[contains(text(),'My account')]/")
    private WebElement myAccountTitle;

    @FindBy(id=("reg_email"))
    private WebElement emailInpuElement;

    @FindBy(id=("reg_password"))
    private WebElement passwordInpuElement;

    @FindBy(name=("register"))
    private WebElement registerButtonElement;

    public WebElement getMyAccountTitle() {
        return myAccountTitle;
    }

    WebDriver driver;

    public MyAccountPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public LoggedUserPage registerUser(String email, String password) {
        
        emailInpuElement.sendKeys(email);
        passwordInpuElement.sendKeys(password);
        registerButtonElement.click();
        return new LoggedUserPage(driver);
    }
}
