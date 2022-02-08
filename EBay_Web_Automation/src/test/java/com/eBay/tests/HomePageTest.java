package com.eBay.tests;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.eBay.base.DriverSetup;
import com.eBay.model.CommonMethods;
import com.eBay.model.Timeout;
import com.eBay.pages.HomePage;

public class HomePageTest {
	
	DriverSetup baseTests = new DriverSetup();
    WebDriver driver = baseTests.setUp();
    Timeout timeout = new Timeout();
    CommonMethods commonMethods = new CommonMethods(driver);
    HomePage homePage = new HomePage(driver);

    @BeforeClass
    public void setUp () {
        driver.get(homePage.homePageUrl());
        timeout.timeout();
        driver.manage().window().maximize();
    }

    @Test
    public void homePageTest() {
        timeout.timeout();
        String title = commonMethods.getTitle();
        assertEquals(title, "Electronics, Cars, Fashion, Collectibles & More | eBay");
    }

    @AfterClass
    public void tearDown() {
        timeout.timeout();
        driver.quit();
    }
}
