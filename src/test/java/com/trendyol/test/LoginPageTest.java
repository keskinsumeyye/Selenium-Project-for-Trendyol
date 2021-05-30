package com.trendyol.test;

import com.trendyol.base.BaseTest;
import com.trendyol.page.LoginPage;
import org.junit.Before;
import org.junit.Test;

public class LoginPageTest extends BaseTest {
    LoginPage loginPage;

    @Before
    public void before(){
        loginPage = new LoginPage(driver);
    }
    @Test
    public void loginPageTest(){
        loginPage.loginPageSteps();

    }
}
