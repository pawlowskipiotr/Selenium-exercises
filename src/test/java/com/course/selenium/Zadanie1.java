package com.course.selenium;

import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class Zadanie1 {
    WebDriver driver = Helper.initializeDriver("FIREFOX");


    @Test
    public void mystore_test() {
        Helper.setUp(driver, "https://mystore-testlab.coderslab.pl/index.php");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //wyszukiwanie elementów na homepage
        WebElement signInButton = driver.findElement(By.xpath("//a[@title='Log in to your customer account']"));
        signInButton.click();

        //Wyszukiwanie elementów na podstronie rejestracji
        WebElement createAccountButton = driver.findElement(By.xpath("//a[contains(text(),'No account? Create one here')]"));
        createAccountButton.click();

        //Powrót do strony głównej
        driver.navigate().back();
        driver.navigate().back();
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}
