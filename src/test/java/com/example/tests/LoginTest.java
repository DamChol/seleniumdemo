package com.example.tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.example.pages.BasePage;
import com.example.pages.HomePage;
import com.example.pages.LoggedUserPage;

public class LoginTest extends BaseTest {


String baseEmail = "aloalo@alo.pl";
String basePassword = "aloalo@alo.pl";

@Test
public void enterMyAccountPageTest() {

    new HomePage(driver)
        .enterMyAccountPage()
        .getMyAccountTitle();
        
}

@Test(dataProvider="loginData")
public void loginUserTest(String email, String password) {
    BasePage result = new HomePage(driver)
    .enterMyAccountPage()
    .loginUser(email, password);

    if(result instanceof LoggedUserPage) {
        Assert.assertTrue(new LoggedUserPage(driver).getEntryLinkElement().getText().contains("My account") );
    }


}

@DataProvider(name="loginData")
public Object[][] loginData() {
    return new Object[][] {
        {"aloalo3@alo.pl", "aloalo@alo.pl"},
        {"locked_out_email","password"}

    };
}


}
