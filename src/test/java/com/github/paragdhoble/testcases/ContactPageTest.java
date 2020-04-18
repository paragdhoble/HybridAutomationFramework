package com.github.paragdhoble.testcases;

import com.github.paragdhoble.base.TestBase;
import com.github.paragdhoble.pages.ContactPage;
import com.github.paragdhoble.pages.HomePage;
import com.github.paragdhoble.pages.LoginPage;
import com.github.paragdhoble.util.TestUtil;
import org.openxmlformats.schemas.drawingml.x2006.main.STAdjAngle;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class ContactPageTest extends TestBase {

    LoginPage loginPage;
    HomePage homePage;
    ContactPage contact;
    String  sheetName =   "Contact" ;

    @BeforeMethod
    public void setup() {
        initialization();
        loginPage = new LoginPage();
        homePage = new HomePage();
        contact = new ContactPage();
        homePage = loginPage.loginValidCredentials(prop.getProperty("username"), prop.getProperty("password"));
        contact = homePage.navigateToContact();
    }

    @DataProvider
    public Object[][] getTestData(){
        Object data[][] = TestUtil.readDataFromExcel(sheetName);
        return data;
    }

    @Test (dataProvider =  "getTestData")
    public void createNewContact(String fName , String lName , String companyName) {
        contact.createNewContact(fName , lName , companyName);

    }

    @AfterMethod
    public void teardown() {
        driver.quit();
    }

}
