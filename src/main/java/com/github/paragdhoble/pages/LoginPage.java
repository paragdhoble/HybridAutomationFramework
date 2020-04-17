package com.github.paragdhoble.pages;

import com.github.paragdhoble.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends TestBase {


    //Page Factory

    @FindBy(name = "email")
    WebElement username;

    @FindBy(name = "password")
    WebElement password;

    @FindBy(xpath = "//div[contains(@class,'ui fluid')]")
    WebElement signinbutton;


    //Constructor to initializing the page objects
    public LoginPage() {
        PageFactory.initElements(driver, this);
    }


    // return HomePage : After login the page will redirect to the Landing page i.e HomePage.
    public HomePage loginValidCredentials(String userid, String pass) {
        username.sendKeys(userid);
        password.sendKeys(pass);
        signinbutton.click();
        return new HomePage();
    }


}