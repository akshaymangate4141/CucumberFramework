package com.ui.stepDefinations;

import com.ui.pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

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

    public static void setUpDriver(String browser){
        if (driver==null){
            switch (browser.toLowerCase()){
                case "chrome":driver=new ChromeDriver();
                break;
                case "firefox":driver=new FirefoxDriver();
                break;
                case "edge":driver=new FirefoxDriver();
                break;

                default:
                    System.out.println("Invalid Browser");
            }
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

    public static LoginPage getLoginPageInstance(){
        return new LoginPage(driver);
    }
}
