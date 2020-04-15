package com.github.paragdhoble.testcases;

import com.github.paragdhoble.base.TestBase;
import com.github.paragdhoble.pages.HomePage;
import com.github.paragdhoble.pages.LoginPage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginPageTest extends TestBase {
    LoginPage loginPage;
    HomePage homePage;


    /*why Super? -
     1. In initialization method we use properties.
     2. To initialize the constructor of properties in TestBase we use  super keyword.*/
    public LoginPageTest() {
        super();
    }

    @BeforeMethod
    public void setup() {
        initialization();
        loginPage = new LoginPage();
    }


    @Test
    public void loginValidation() {
        homePage = loginPage.loginValidCredentials(prop.getProperty("username"), prop.getProperty("password"));
    }

    @AfterMethod
    public void teardown() {
        driver.quit();
    }
}
