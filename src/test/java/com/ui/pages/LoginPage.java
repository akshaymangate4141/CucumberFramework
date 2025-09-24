package com.ui.pages;

import com.constant.ConfigKey;
import com.utils.BrowserUtil;
import com.utils.TestUtil;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public final class LoginPage extends BrowserUtil {

    private WebDriver driver;

    @FindBy(id = "username")
    private WebElement txt_username;
    @FindBy(id = "password")
    private WebElement txt_password;
    @FindBy(xpath = "//span[contains(text(),'Sign in')]/ancestor::button")
    private WebElement btn_signin;

    public LoginPage(WebDriver driver){
        super(driver);
        PageFactory.initElements(driver,this);
    }

    public DashboardPage doLogin(){
        enterText(txt_username, TestUtil.getValueFromPropertiesFile(ConfigKey.FD_USER));
        enterText(txt_password,TestUtil.getValueFromPropertiesFile(ConfigKey.PASSWORD));
        clickOnElement(btn_signin);
        return new DashboardPage(driver);

    }





}
