package com.ui.stepDefinations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverFactory {

    private static WebDriver driver;
    private static DriverFactory driverFactory;
    private DriverFactory(){

    }

    public static DriverFactory getDriverFactoryInstance(){
        if (driverFactory==null){
            driverFactory=new DriverFactory();
        }
        return driverFactory;
    }

    public static void setUpDriver(){
        if (driver==null){
            driver=new ChromeDriver();
        }

    }

    public static WebDriver getDriver(){
        return driver;
    }

    public static void tearDownDriver(){
        if (driver!=null){
            driver.quit();
        }

    }
}
