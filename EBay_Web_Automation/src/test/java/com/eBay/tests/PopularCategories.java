package com.eBay.tests;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.eBay.base.DriverSetup;
import com.eBay.model.CommonMethods;
import com.eBay.model.Locators;
import com.eBay.model.Timeout;
import com.eBay.pages.HomePage;

public class PopularCategories {
	
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

    //sneakers
    @Test(priority = 1)
    public void sneakersTest () {
        timeout.timeout();
        commonMethods.clickOnButton(Locators.sneakers);
        timeout.timeout();

        assertEquals(homePage.getCurrentUrl(), Locators.sneakersUrl);
        System.out.println("Successfully visit sneakers");
    }

    //koreanBeauty
    @Test (priority = 2)
    public void koreanBeauty () {
        commonMethods.back();
        timeout.timeout();
        commonMethods.clickOnButton(Locators.koreanBeauty);
        timeout.timeout();

        assertEquals(homePage.getCurrentUrl(), Locators.koreanBeautyUrl);
        System.out.println("Successfully visit koreanBeauty");
    }

    //wristWatches
    @Test (priority = 3)
    public void wristWatches () {
        commonMethods.back();
        timeout.timeout();
        commonMethods.clickOnButton(Locators.wristWatches);
        timeout.timeout();

        assertEquals(homePage.getCurrentUrl(), Locators.wristWatchesUrl);
        System.out.println("Successfully visit wristWatches");
    }
    //fishing
    @Test (priority = 4)
    public void fishing () {
        commonMethods.back();
        timeout.timeout();
        commonMethods.clickOnButton(Locators.fishing);
        timeout.timeout();

        assertEquals(homePage.getCurrentUrl(), Locators.fishingUrl);
        System.out.println("Successfully visit fishing");
    }
    //collectibles
    @Test (priority = 5)
    public void collectibles () {
        commonMethods.back();
        timeout.timeout();
        commonMethods.clickOnButton(Locators.collectibles);
        timeout.timeout();

        assertEquals(homePage.getCurrentUrl(), Locators.collectiblesUrl);
        System.out.println("Successfully visit collectibles");
    }
    //smartPhones
    @Test (priority = 6)
    public void healthAndBeautyTest () {
        commonMethods.back();
        timeout.timeout();
        commonMethods.clickOnButton(Locators.smartPhones);
        timeout.timeout();

        assertEquals(homePage.getCurrentUrl(), Locators.smartPhonesUrl);
        System.out.println("Successfully visit smartPhones");
    }

    //popularSell
    @Test (priority = 7)
    public void homeAndGardenTest () {
        commonMethods.back();
        timeout.timeout();
        commonMethods.clickOnButton(Locators.popularSell);
        timeout.timeout();

        assertEquals(homePage.getCurrentUrl(), Locators.popularSellUrl);
        System.out.println("Successfully visit popularSell" );
    }

    @AfterClass
    public void tearDown() {
        timeout.timeout();
        driver.quit();
    }
}
