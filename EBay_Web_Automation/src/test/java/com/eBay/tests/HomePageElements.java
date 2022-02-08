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

public class HomePageElements {
	
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

    //Deals
    @Test (priority = 1)
    public void dailyDealsTest () {
        timeout.timeout();
        commonMethods.clickOnButton(Locators.dailyDeals);
        timeout.timeout();
        String deals = commonMethods.getText(Locators.deals);
        assertEquals(deals, Locators.dealsText);
        System.out.println("Successfully visit " + deals);
    }

    //help & contact
    @Test (priority = 2)
    public void helpAndContact () {
        driver.navigate().back();
        timeout.timeout();
        commonMethods.clickOnButton(Locators.helpAndContact);
        timeout.timeout();
        String customerAndServicesText = commonMethods.getText(Locators.customerServiceId);
        assertEquals(customerAndServicesText, Locators.customerServicesText);
        System.out.println("Successfully visit " + customerAndServicesText);
    }

    //sell
    @Test (priority = 3)
    public void sellTest () {
        driver.navigate().back();
        timeout.timeout();
        commonMethods.clickOnButton(Locators.sell);
        timeout.timeout();
        String sellText = commonMethods.getText(Locators.sellingPath);
        assertEquals(sellText, "You are on selling home page\n" + Locators.sellText);
        System.out.println("Successfully visit " + sellText);
    }
    //electronics
    @Test (priority = 4)
    public void electronicsTest () {
        driver.navigate().back();
        timeout.timeout();
        commonMethods.clickOnButton(Locators.electronics);
        timeout.timeout();
        String electronicsText = commonMethods.getText(Locators.electronicsPath);
        assertEquals(electronicsText, Locators.electronicsText);
        System.out.println("Successfully visit " + electronicsText);
    }
    //fashion
    @Test (priority = 5)
    public void fashionTest () {
        driver.navigate().back();
        timeout.timeout();
        commonMethods.clickOnButton(Locators.fashion);
        timeout.timeout();
        String fashionText = commonMethods.getText(Locators.fashionPath);
        assertEquals(fashionText,Locators.fashionText);
        System.out.println("Successfully visit " + fashionText);
    }
    //healthAndBeauty
    @Test (priority = 6)
    public void healthAndBeautyTest () {
        driver.navigate().back();
        timeout.timeout();
        commonMethods.clickOnButton(Locators.healthAndBeauty);
        timeout.timeout();
        String healthAndBeautyText = commonMethods.getText(Locators.healthAndBeautyPath);
        assertEquals(healthAndBeautyText, Locators.healthAndBeautyText);
        System.out.println("Successfully visit " + healthAndBeautyText);
    }

    //homeAndGarden
    @Test (priority = 7)
    public void homeAndGardenTest () {
        driver.navigate().back();
        timeout.timeout();
        commonMethods.clickOnButton(Locators.homeAndGarden);
        timeout.timeout();
        String homeAndGardenText = commonMethods.getText(Locators.homeAndGardenPath);
        assertEquals(homeAndGardenText, Locators.homeAndGardenText);
        System.out.println("Successfully visit " + homeAndGardenText);
    }
    //sports
    @Test (priority = 8)
    public void sportsTest () {
        driver.navigate().back();
        timeout.timeout();
        commonMethods.clickOnButton(Locators.sports);
        timeout.timeout();
        String sportsText = commonMethods.getText(Locators.sportsPath);
        assertEquals(sportsText, Locators.sportsText);
        System.out.println("Successfully visit " + sportsText);
    }
    //collectiblesAndArtPage
    @Test (priority = 9)
    public void collectiblesAndArtPageTest () {
        driver.navigate().back();
        timeout.timeout();
        commonMethods.clickOnButton(Locators.collectiblesAndArtPage);
        timeout.timeout();
        String collectiblesAndArtPageText = commonMethods.getText(Locators.collectiblesAndArtPagePath);
        assertEquals(collectiblesAndArtPageText, Locators.collectiblesAndArtPageText);
        System.out.println("Successfully visit " + collectiblesAndArtPageText);
    }
    //industrialEquipmentPage
    @Test (priority = 10)
    public void industrialEquipmentPageTest () {
        driver.navigate().back();
        timeout.timeout();
        commonMethods.clickOnButton(Locators.industrialEquipmentPage);
        timeout.timeout();
        String industrialEquipmentPageText = commonMethods.getText(Locators.industrialEquipmentPagePath);
        assertEquals(industrialEquipmentPageText, Locators.industrialEquipmentPageText);
        System.out.println("Successfully visit " + industrialEquipmentPageText);
    }
    //motorsPage
    @Test (priority = 11)
    public void motorsPageTest () {
        //driver.navigate().back();
        timeout.timeout();
        commonMethods.clickOnButton(Locators.motorsPage);
        timeout.timeout();
        //String motorsPageText = commonMethods.getText(Locators.motorsPagePath);
        assertEquals(driver.getCurrentUrl(), Locators.motorsPageUrl);
        System.out.println("Successfully visit Motor Page");
    }

    @AfterClass
    public void tearDown() {
        driver.navigate().back();
        timeout.timeout();
        driver.quit();
    }

}
