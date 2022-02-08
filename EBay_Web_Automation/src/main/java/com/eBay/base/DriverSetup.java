package com.eBay.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverSetup {
	WebDriver driver;

    public WebDriver setUp() {
        WebDriverManager.chromedriver().setup();
        driver= new ChromeDriver();

        return driver;
    }
	
}
