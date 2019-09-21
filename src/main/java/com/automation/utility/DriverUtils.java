package com.automation.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverUtils {
    static WebDriver driver;

    public static void initDriver() {
            System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://seleniumjava.com/2017/06/05/how-to-create-page-objects-with-selenium-webdriver/");
    }

    public static WebDriver getDriver() {
        if (driver==null) {
            initDriver();
        }
        return  driver;

    }

    public static void tearDown() {
        driver.quit();
    }

    public static void main(String[] args) {
        initDriver();
        tearDown();
    }
}
