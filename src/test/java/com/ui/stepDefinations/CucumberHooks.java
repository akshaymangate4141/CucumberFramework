package com.ui.stepDefinations;

import com.constant.ConfigKey;
import com.utils.TestUtil;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;

public class CucumberHooks {
    WebDriver driver;

    @Before
    public void initializeDriver() {
        DriverFactory.setUpDriver(TestUtil.getValueFromPropertiesFile(ConfigKey.BROWSER));
        driver = DriverFactory.getDriver();
        driver.manage().window().maximize();

    }

    @After
    public void quitDriver() {
      DriverFactory.tearDownDriver();
    }

}