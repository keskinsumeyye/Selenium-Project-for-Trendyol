package com.trendyol.base;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class BaseTest {
    public WebDriver driver;
    public ChromeOptions options;

    @Before
    public void setup(){
        System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver.exe");
        options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        options.addArguments("start-maximized");
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        driver.get("https://www.trendyol.com/");
    }

    @After
    public void tearDown(){
        //driver.quit();
        System.out.println("URL " + driver.getCurrentUrl());
    }
}
