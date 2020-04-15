package com.github.paragdhoble.testcases;

import com.github.paragdhoble.base.TestBase;
import com.github.paragdhoble.pages.HomePage;
import com.github.paragdhoble.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePageTest extends TestBase {
    LoginPage loginPage ;
    HomePage homePage ;

    public HomePageTest () {
        super();
    }

    @BeforeMethod
    public void setUp(){
        initialization();
        loginPage = new LoginPage() ;
        homePage = new HomePage() ;
        loginPage.loginValidCredentials(prop.getProperty("username") , prop.getProperty("password"));

    }

    @Test
    public void validateTittleHomePage (){
      String HomePageTittle =  homePage.validatePageTittle();
        Assert.assertEquals(HomePageTittle , "Cogmento CRM");
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}

