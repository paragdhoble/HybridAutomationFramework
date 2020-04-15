package com.github.paragdhoble.pages;

import com.github.paragdhoble.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends TestBase {

    //Page Elements - Object Repo
    @FindBy (xpath = "(//span[@class='item-text'])[2]")
    WebElement calendar ;

    @FindBy (xpath = "(//span[@class='item-text'])[3]")
    WebElement contacts ;

    @FindBy (xpath = "(//span[@class='item-text'])[4]")
    WebElement companies;

    @FindBy (xpath = "(//span[@class='item-text'])[5]")
    WebElement deals ;

    @FindBy (xpath = "(//span[@class='item-text'])[6]")
    WebElement tasks ;

    @FindBy (xpath = "(//span[@class='item-text'])[7]")
    WebElement cases ;

    public HomePage (){
        PageFactory.initElements(driver , this);
    }

    //Actions
    public CalendarPage navigateToCalendar (){
        calendar.click();
        return new CalendarPage();
    }

    //This Method is use to Navigate to contact page from home page
    public ContactPage  navigateToContact (){
        contacts.click();
        return new ContactPage();
    }

    //This Method is use to Navigate to companies page from home page
    public CompaniesPage  navigateToCompanies(){
        companies.click();
        deals.click();
        return new CompaniesPage();
    }

    //This Method is use to Navigate to tasks page from home page
    public TasksPage  navigateToTasks(){
        tasks.click();
        return new TasksPage();
    }

    //This Method is use to validate tittle on home page
    public  String validatePageTittle(){
        return driver.getTitle();
    }
}
