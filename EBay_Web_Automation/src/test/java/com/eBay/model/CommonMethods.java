package com.eBay.model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.google.common.base.Objects;

public class CommonMethods {
	
	WebDriver driver;
    public CommonMethods (WebDriver driver) { this.driver = driver; }

    public String getTitle () {
        return driver.getTitle();
    }

    public void clickOnButton (By btn) {
        driver.findElement(btn).click();
    }

    public String getText(By element) {
        return driver.findElement(element).getText();
    }

    public void back () {
        if (!Objects.equal(driver.getCurrentUrl(), Locators.homePageUrl))
        {
            driver.navigate().back();
        }
    }

}
