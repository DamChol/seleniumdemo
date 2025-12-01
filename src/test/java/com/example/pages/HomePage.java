package com.example.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage {


    @FindBy(xpath="//div[@class='container']//span[contains(text(),'My account')]")
    private WebElement myAccountElement;
    
    @FindBy(xpath="//div[contains(text(),'Design your')]")
    private WebElement homePageTitleElement;

    @FindBy(xpath="//nav[@id='topbar-nav']//span[text()='Shop']")
    private WebElement shopLinkElement;
    

public HomePage(WebDriver driver) {
    super(driver);
    PageFactory.initElements(driver, this);
}

public WebElement getHomePageTitle() {
    return homePageTitleElement;
}

public WebElement getMyAccountElement() {
    return myAccountElement;
}


public MyAccountPage enterMyAccountPage() {
    myAccountElement.click();
    return new MyAccountPage(driver);
} 

public ShopPage getIntoShop() {
    shopLinkElement.click();
    return new ShopPage(driver);
}

}


