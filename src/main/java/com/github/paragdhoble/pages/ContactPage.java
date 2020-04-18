package com.github.paragdhoble.pages;

import com.github.paragdhoble.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactPage extends TestBase {

    @FindBy(xpath = "(//button[contains(@class,'ui linkedin')])[3]")
    WebElement newContact ;

    @FindBy(xpath = "(//button[contains(@class,'ui linkedin button')])[2]")
    WebElement saveContact ;


    @FindBy (name = "first_name")
    WebElement firstName ;

    @FindBy (name = "last_name")
    WebElement lastName ;

    @FindBy (name = "company")
    WebElement company ;

    public ContactPage (){
        PageFactory.initElements(driver , this);

    }

    //Function

    public void createNewContact (String fName , String lName , String companyName) {
        newContact.click();
        firstName.sendKeys(fName);
        lastName.sendKeys(lName);
        company.sendKeys(companyName);
        saveContact.click();

    }


}


