package com.trendyol.base;

import com.trendyol.page.HomePage;
import com.trendyol.page.LoginPage;
import com.trendyol.page.ProductPage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Random;
import java.util.Set;

public class BasePage {
    WebDriver driver;
    WebDriverWait wait;
    JavascriptExecutor executor;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(this.driver, 30, 500);
    }

    public WebElement findElement(By by){
       return wait.until(ExpectedConditions.presenceOfElementLocated(by));
    }

    public List<WebElement> findElements(By by){
        return wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(by));
    }

    public void clickElement(By by){
        WebElement element = findElement(by);
        wait.until(ExpectedConditions.elementToBeClickable(element)).click();
    }

    public Actions getActions(){
       return new Actions(driver);
    }

    public void hoverElement(By by){
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
        getActions().moveToElement(findElement(by)).build().perform();
    }

    public WebElement visibilityElement(By by){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }


    public void clickVisibilityElement(By by){
        WebElement element = visibilityElement(by);
        wait.until(ExpectedConditions.elementToBeClickable(element)).click();
    }

    public void sendKeys(By by,CharSequence text){
        wait.until(ExpectedConditions.presenceOfElementLocated(by));
        findElement(by).sendKeys(text);
    }

    public void randomClickElement(By by){
        List<WebElement> elements = findElements(by);
        int maxElement = elements.size();
        Random random = new Random();
        int index = random.nextInt(maxElement);
        System.out.println(index);
        elements.get(index).click();
    }

    public void randomHoverElement(By by){
        List<WebElement> elements = findElements(by);
        int maxElement = elements.size();
        Random random = new Random();
        int index = random.nextInt(maxElement);
        System.out.println(index);
        getActions().moveToElement(elements.get(index)).build().perform();
    }

    public HomePage getHomePage(){
        return new HomePage(driver);
    }

    public LoginPage getLoginPage(){
        return new LoginPage(driver);
    }

    public ProductPage getProductPage(){
        return new ProductPage(driver);
    }

    public void switchToWindows(){
        String parentWindow = driver.getWindowHandle();
        Set<String> windows = driver.getWindowHandles();
        for(String window : windows){
            if(!parentWindow.equals(window)){
                driver.switchTo().window(window);
            }
        }
    }

    public void javascriptclicker(By by) {
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        WebElement element = findElement(by);
        executor.executeScript("arguments[0].click();", element);
    }

    public void blankSpaceClick(){
        driver.findElement(By.xpath("//html")).click();
    }

    public boolean existElement(By by){
        Boolean present = driver.findElements(by).size() > 0;
        return present;
    }
}
