package com.ui.stepDefinations;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;

public class CucumberHooks {
WebDriver driver;
    @Before
    public void initializeDriver(){
        DriverFactory.setUpDriver();
        driver=DriverFactory.getDriver();
       driver.manage().window().maximize();

    }
    @After
    public void quitDriver(){
        DriverFactory.tearDownDriver();
    }

}