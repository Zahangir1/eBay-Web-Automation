package com.eBay.tests;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.eBay.base.DriverSetup;
import com.eBay.model.CommonMethods;
import com.eBay.model.Locators;
import com.eBay.model.Timeout;
import com.eBay.pages.HomePage;

public class RegistrationTest {
	
	DriverSetup baseTests = new DriverSetup();
    WebDriver driver = baseTests.setUp();
    Timeout timeout = new Timeout();
    CommonMethods commonMethods = new CommonMethods(driver);
    HomePage homePage = new HomePage(driver);

    @BeforeClass
    public void setUp () {
        driver.manage().window().maximize();
        driver.get(homePage.homePageUrl());
    }

    @Test
    public void registrationTest () {
        timeout.timeout();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,350)", "");
        commonMethods.clickOnButton(Locators.registration);
        timeout.timeout();
        commonMethods.clickOnButton(Locators.firstSignUpBtn);
        commonMethods.clickOnButton(Locators.secondSignUpBtn);
        timeout.timeout();
        assertEquals(commonMethods.getText(Locators.signUpPage), Locators.signUpPageText);
    }

    @AfterClass
    public void tearDown() {
        timeout.timeout();
        driver.quit();
    }
}
