package com.example.tests;

import org.testng.annotations.Test;

import com.example.pages.HomePage;

public class LoginTest extends BaseTest {

@Test
public void enterMyAccountPageTest() {

    new HomePage(driver)
        .enterMyAccountPage()
        .getMyAccountTitle();
        
}

}
