package com.example.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.example.models.Customer;

public class AdressDetailsPage extends BasePage {

    public AdressDetailsPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "billing_first_name")
    private WebElement firstNameInputElement;

    @FindBy(id = "billing_last_name")
    private WebElement lastNameInputElement;

    @FindBy(id = "billing_company")
    private WebElement companyInputElement;

    @FindBy(id = "billing_country")
    private WebElement countrySelectElement;

    @FindBy(id = "billing_address1")
    private WebElement addressInputElement;

    @FindBy(id = "billing_address2")
    private WebElement address2InputElement;

    @FindBy(id = "billing_postcode")
    private WebElement postCodeInputElement;

    @FindBy(id = "billing_city")
    private WebElement cityInputElement;

    @FindBy(id = "billing_phone")
    private WebElement phoneInputElement;

    @FindBy(id = "billing_email")
    private WebElement emailInputElement;

    @FindBy(id = "order_comments")
    private WebElement commentsInputElement;

    @FindBy(id = "place_order")
    private WebElement placeOrderButtonElement;

    public OrderDetailsPage fillAddressDetails(Customer customer, String comments) {
        firstNameInputElement.sendKeys(customer.getFirstName());
        lastNameInputElement.sendKeys(customer.getLastName());
        companyInputElement.sendKeys(customer.getCompanyName());
        Select countrySelect = new Select(countrySelectElement);
        countrySelect.selectByVisibleText(customer.getCountry());
        addressInputElement.sendKeys(String.format("%s %s",customer.getStreet(),customer.getFlatNumber()));
        postCodeInputElement.sendKeys(customer.getZipCode());
        cityInputElement.sendKeys(customer.getCity());
        phoneInputElement.sendKeys(customer.getPhone());
        emailInputElement.sendKeys(customer.getEmail());
        commentsInputElement.sendKeys(comments);
        placeOrderButtonElement.click();

        return new OrderDetailsPage(driver);
}
}
