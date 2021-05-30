package com.trendyol.page;

import com.trendyol.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BasketPage extends BasePage {
    public BasketPage(WebDriver driver) {
        super(driver);
    }

    public BasketPage basketPageSteps(){
        getProductPage().productPageSteps();
        clickElement(By.cssSelector("a[class='goBasket']"));
        clickElement(By.cssSelector("button[class='ty-numeric-counter-button']"));
        clickElement(By.cssSelector("div[class='pb-basket-item-actions']>button"));
        clickElement(By.cssSelector("button[class='btn-item btn-remove']"));
        return this;
    }
}
