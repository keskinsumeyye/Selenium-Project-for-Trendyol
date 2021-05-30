package com.trendyol.page;

import com.trendyol.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public LoginPage loginPageSteps(){
        getHomePage().homePageSteps();
        sendKeys(By.id("login-email"),"sumeyyekou@gmail.com");
        sendKeys(By.id("login-password-input"),"@gmailA2");
        clickElement(By.cssSelector("button[type='submit']"));
       // randomHoverElement(By.cssSelector("ul[class='main-nav']>li>a"));
        return this;
    }
}
