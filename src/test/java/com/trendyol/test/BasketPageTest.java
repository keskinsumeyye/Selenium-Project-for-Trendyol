package com.trendyol.test;

import com.trendyol.base.BaseTest;
import com.trendyol.page.BasketPage;
import org.junit.Before;
import org.junit.Test;

public class BasketPageTest extends BaseTest {
    BasketPage basketPage;
    @Before
    public void before(){
        basketPage = new BasketPage(driver);
    }

    @Test
    public void basketPageTest(){
        basketPage.basketPageSteps();
    }

}
