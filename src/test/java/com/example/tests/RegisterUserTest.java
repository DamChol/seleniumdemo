package com.example.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.example.pages.HomePage;
import com.example.pages.LoggedUserPage;
import com.example.pages.MyAccountPage;

public class RegisterUserTest extends BaseTest {

    int randomNr = (int) (Math.random() * 1000);
    String email = "aloalo" + randomNr + "@alo.pl";
    String password = "aloalo@alo.pl";

    @Test
    public void registerUserTest() {

        new HomePage(driver)
                .enterMyAccountPage()
                .registerUser(email, password);

        Assert.assertTrue(new LoggedUserPage(driver).getEntryLinkElement().isDisplayed());
    }

    @Test
    public void registerUserNegativeTest() {

        new HomePage(driver)
                .enterMyAccountPage()
                .registerUser(email, password)
                .logout().
                registerUser(email, password);

        Assert.assertTrue(new MyAccountPage(driver).getAccountRegisteredErrorElement().isDisplayed());
    }

}
