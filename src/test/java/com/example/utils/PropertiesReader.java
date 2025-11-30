package com.example.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesReader {

    public static String readProperties(String propertyName) throws IOException {
        InputStream inputStream = new FileInputStream("C:\\Users\\damia\\OneDrive\\JavaProjects\\seleniumdemo\\src\\test\\resources\\config.properties");
        Properties properties = new Properties();
        properties.load(inputStream);
        return properties.getProperty(propertyName);
        
    }

}

