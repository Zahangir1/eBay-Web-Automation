package com.eBay.pages;

import org.openqa.selenium.WebDriver;

import com.eBay.model.Locators;

public class HomePage {
	
	 WebDriver driver;
	    public HomePage (WebDriver driver) { this.driver = driver; }

	    public String homePageUrl () {
	        return Locators.homePageUrl;
	    }

	    public String getCurrentUrl () {
	        return driver.getCurrentUrl();
	    }

}
