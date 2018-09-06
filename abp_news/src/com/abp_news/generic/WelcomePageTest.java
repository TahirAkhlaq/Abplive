package com.abp_news.generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.galenframework.testng.GalenTestNgTestBase;

public class WelcomePageTest extends GalenTestNgTestBase {

	    @Override
	    public WebDriver createDriver(Object[] args) {
	        return new ChromeDriver();
	    }

	    @Test
	    public void welcomePage_shouldLookGood_onDesktopDevice() throws InterruptedException {
	        load("http://google.com", 800, 568);
	        Thread.sleep(3000);
	        
	    }

	}

