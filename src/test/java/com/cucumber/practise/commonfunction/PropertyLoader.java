package com.cucumber.practise.commonfunction;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyLoader {
    private Properties properties = new Properties();

    public PropertyLoader(String propertyFilePath) {
        try {
            FileInputStream fis = new FileInputStream(propertyFilePath);
            properties.load(fis);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    public String getProperty(String key) {
        return properties.getProperty(key);
    }
}
