package com.utils;

import com.constant.ConfigKey;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class TestUtil {

    public static String getValueFromPropertiesFile(ConfigKey key) {
        try {
            Properties p = new Properties();
            FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "src/test/resources/configFiles/qaConfig.properties");
            p.load(fis);
            return p.getProperty(key.toString());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
