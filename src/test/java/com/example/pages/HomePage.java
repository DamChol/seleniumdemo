package com.example.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {


    @FindBy(xpath="//div[@class='container']//span[contains(text(),'My account')]")
    private WebElement myAccountLink;
    
    @FindBy(xpath="//div[contains(text(),'Design your')]")
    private WebElement homePageTitle;
    
//     @FindBy(linkText="http://seleniumdemo.com/?page_id=7")
//     private WebElement myAccountLink;
    
//     @FindBy(linkText="http://seleniumdemo.com/?page_id=7")
//     private WebElement myAccountLink;


WebDriver driver;

public HomePage(WebDriver driver) {
    this.driver = driver;
    PageFactory.initElements(driver, this);
}

public WebElement getHomePageTitle() {
    return homePageTitle;
}


public MyAccountPage enterMyAccountPage() {
    myAccountLink.click();
    return new MyAccountPage(driver);
} 

}


