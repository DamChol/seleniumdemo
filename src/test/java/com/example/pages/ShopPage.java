package com.example.pages;

import javax.xml.xpath.XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sun.org.apache.xalan.internal.xsltc.compiler.util.ResultTreeType;

public class ShopPage extends BasePage{

    
    @FindBy(xpath="//h2[text()='BDD Cucumber']/../following-sibling::*[1]")
    private WebElement cucumberAddToCardButton;

    @FindBy(xpath="div[@class='topbar-navbar__wrapper desktop-sticky']//i[@class='icn-shoppingcart']")
    private WebElement viewShoppingCartButton1;

    @FindBy(xpath="//a[@class='button wc-forward']")
    private WebElement viewShoppingCartButton2;
    
    
    public ShopPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public ShopPage addProductToCart(String productName) {

        String element = String.format("//h2[text()='%s']/../following-sibling::*[1]",productName);
        driver.findElement(By.xpath(element)).click();
        return this;
    }

    public CartPage viewCart() {
        Actions actions = new Actions(driver);
        actions.moveToElement(viewShoppingCartButton1).perform();
        viewShoppingCartButton2.click();
        return new CartPage(driver);

    }

}
