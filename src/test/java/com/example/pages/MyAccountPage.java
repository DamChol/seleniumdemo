package com.example.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAccountPage extends BasePage {

    @FindBy(xpath="//h1[contains(text(),'My account')]/")
    private WebElement myAccountTitle;

    @FindBy(id=("reg_email"))
    private WebElement emailRegInputElement;

    @FindBy(id=("reg_password"))
    private WebElement passwordRegInputElement;

    @FindBy(name=("register"))
    private WebElement registerRegButtonElement; 

    @FindBy(id=("username"))
    private WebElement emailLogInputElement;

    @FindBy(id=("password"))
    private WebElement passwordLogInputElement;

    @FindBy(name=("login"))
    private WebElement loginButtonElement; 
    

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
        
        emailRegInputElement.sendKeys(email);
        passwordRegInputElement.sendKeys(password);
        registerRegButtonElement.click();
        if ( BasePage.class.isInstance(this)) {
        return this;
        } else {
            return new LoggedUserPage(driver);
        }
    }

    public BasePage loginUser(String email, String password) {
        emailLogInputElement.sendKeys(email);
        passwordLogInputElement.sendKeys(password);
        loginButtonElement.click();
        if ( BasePage.class.isInstance(this)) {
        return this;
        } else {
            return new LoggedUserPage(driver);
        }



    }
    
}
