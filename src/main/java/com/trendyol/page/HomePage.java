package com.trendyol.page;

import com.trendyol.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {
    public HomePage(WebDriver driver) {
        super(driver);
    }
    public HomePage homePageSteps(){
        clickElement(By.cssSelector("div[class='modal-close']"));
        hoverElement(By.cssSelector("div[class='account-nav-item user-login-container']"));
        clickVisibilityElement(By.cssSelector("div[class='login-button']"));
        return this;
    }
}
