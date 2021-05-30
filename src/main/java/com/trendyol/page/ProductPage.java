package com.trendyol.page;

import com.trendyol.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductPage extends BasePage {
    public ProductPage(WebDriver driver) {
        super(driver);
    }

    public ProductPage productPageSteps(){
        getLoginPage().loginPageSteps();
        sendKeys(By.cssSelector("input[class='search-box']"),"bilgisayar" + Keys.ENTER);
        randomClickProduct(By.cssSelector("div[class='prdct-cntnr-wrppr']>div>div>a"));
        switchToWindows();
        hoverElement(By.cssSelector("div[data-index='0']"));
        clickElement(By.cssSelector("button[class='pr-in-btn add-to-bs']"));
        return this;
    }

    public void randomClickProduct(By by){

        if(existElement(By.cssSelector("div[class='popup']"))==true){
            blankSpaceClick();
            System.out.println("var");
        } else {
            System.out.println("yok");
        }
        randomClickElement(by);
    }
}

