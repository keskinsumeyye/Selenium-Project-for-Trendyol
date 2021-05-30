package com.trendyol.test;

import com.trendyol.base.BaseTest;
import com.trendyol.page.HomePage;
import org.junit.Before;
import org.junit.Test;

public class HomePageTest extends BaseTest {
    HomePage homePage;
    @Before
    public void before(){
        homePage = new HomePage(driver);
    }

    @Test
    public void HomePageTest(){
        homePage.homePageSteps();
    }
}
