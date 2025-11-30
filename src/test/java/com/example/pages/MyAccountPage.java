package com.example.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import sun.jvm.hotspot.oops.Instance;

public class MyAccountPage extends BasePage {

    @FindBy(xpath="//h1[contains(text(),'My account')]/")
    private WebElement myAccountTitle;

    @FindBy(id=("reg_email"))
    private WebElement emailInpuElement;

    @FindBy(id=("reg_password"))
    private WebElement passwordInpuElement;

    @FindBy(name=("register"))
    private WebElement registerButtonElement;

     @FindBy(xpath = "//li[text()=' An account is already registered with your email address. Please log in.		']")
    private WebElement accountRegisteredErrorElement;

    public WebElement getMyAccountTitle() {
        return myAccountTitle;
    }

    public MyAccountPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public WebElement getAccountRegisteredErrorElement() {
        return accountRegisteredErrorElement;
    }

    public BasePage registerUser(String email, String password) {
        
        emailInpuElement.sendKeys(email);
        passwordInpuElement.sendKeys(password);
        registerButtonElement.click();
        if ( BasePage.class.isInstance(this)) {
        return this;
        } else {
            return new LoggedUserPage(driver);
        }
    }
    
}
