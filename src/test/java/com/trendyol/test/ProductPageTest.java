package com.trendyol.test;

import com.trendyol.base.BaseTest;
import com.trendyol.page.ProductPage;
import org.junit.Before;
import org.junit.Test;

public class ProductPageTest extends BaseTest {
    ProductPage productPage;
    @Before
    public void before(){
        productPage = new ProductPage(driver);
    }
    @Test
    public  void productPageTest(){
        productPage.productPageSteps();
        System.out.println("URL " + driver.getCurrentUrl());
    }
}
