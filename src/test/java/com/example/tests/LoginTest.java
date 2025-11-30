package com.example.tests;

import org.testng.annotations.Test;

import com.example.pages.HomePage;

public class LoginTest extends BaseTest {


String baseEmail = "aloalo@alo.pl";
String basePassword = "aloalo@alo.pl";

@Test
public void enterMyAccountPageTest() {

    new HomePage(driver)
        .enterMyAccountPage()
        .getMyAccountTitle();
        
}

@Test
public void loginUserTest() {
    new HomePage(driver)
    .enterMyAccountPage()
    .loginUser(baseEmail, basePassword);

}

}
