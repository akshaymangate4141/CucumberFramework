package com.utils;

import com.constant.ConfigKey;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.FileInputStream;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class TestUtil {

    public static String getValueFromPropertiesFile(ConfigKey key) {
        try {
            Properties p = new Properties();
            FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "/src/test/resources/configFiles/qaConfig.properties");
            p.load(fis);
            return p.getProperty(key.toString());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static String takeScreenshot(WebDriver driver) {
        try {

            TakesScreenshot ts = (TakesScreenshot) driver;
            File source = ts.getScreenshotAs(OutputType.FILE);
            String destFolderPath = System.getProperty("user.dir") + "//screenshots";
            File destFolder = new File(destFolderPath);
            if (!destFolder.exists()) {
                FileHandler.createDir(destFolder);
            }
            LocalDate date = LocalDate.now();
            String currentTimeStamp = date.format(DateTimeFormatter.ofPattern("MMM dd yyyy hh:mm"));
            String scrrenshotPath = destFolderPath + "//" + currentTimeStamp + ".png";
            File target = new File(scrrenshotPath);
            source.renameTo(target);
            return scrrenshotPath;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
