package com.ui.pages;

import com.utils.BrowserUtil;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public final class DashboardPage extends BrowserUtil {

    private WebDriver driver;

    public DashboardPage(WebDriver driver){
        super(driver);
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//span[contains(text(),'Create Job')]/ancestor::a")
    private WebElement link_createJob;

    public void goToCreateJobPage(){
        clickOnElement(link_createJob);

    }

    public String getDahboardPageUrl(){
        return getCurrentPageUrl("dashboard");
    }

}
