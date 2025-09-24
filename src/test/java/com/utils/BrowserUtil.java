package com.utils;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public abstract class BrowserUtil {
    private WebDriverWait wait;
    private WebDriver driver;

    public BrowserUtil(WebDriver driver){
        this.driver=driver;
        wait=new WebDriverWait(driver, Duration.ofSeconds(30)) ;
    }

    public void clickOnElement(WebElement ele){
        wait.until(ExpectedConditions.elementToBeClickable(ele)).click();
    }

    public void clickOnElement(By locator){
        wait.until(ExpectedConditions.elementToBeClickable(locator)).click();
    }

    public void enterText(WebElement ele,String text){
        wait.until(ExpectedConditions.visibilityOf(ele)).clear();
        wait.until(ExpectedConditions.visibilityOf(ele)).sendKeys(text);
    }
    public String getCurrentPageUrl(String endpoint){
        wait.until(ExpectedConditions.urlContains(endpoint));
        return driver.getCurrentUrl();
    }
}
