package com.course.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;


public class Helper {

        public static WebDriver initializeDriver(String webdriver) {
        switch (webdriver) {
            case "CHROME": {
                WebDriver driver = new ChromeDriver();
                return driver;
            }
            case "FIREFOX": {
                WebDriver driver = new FirefoxDriver();
                return driver;
            }
            default:
                throw new WebDriverException("Browser name not found! Cannot initialize browser driver");
        }

    }

    public static void setUp(WebDriver driver, String url) {
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get(url);
    }
}

