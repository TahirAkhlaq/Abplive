package com.abp_news.scripts;


import org.testng.annotations.Test;

import com.abp_news.generic.BaseLib;
import com.abp_news.pom.homepage;

public class hometest extends BaseLib {

	
/*	@Test
	public void linkVerification() throws InterruptedException {
		homepage hp = new homepage(driver);
		wLib.implicitWaitForSeconds(driver, 10);
		hp.linkVerification(driver);

	}
	@Test
	public void socialSiteLinkDirectionVerification() throws InterruptedException {
		homepage hp = new homepage(driver);
		wLib.implicitWaitForSeconds(driver, 10);
		hp.verifySocialLinks(driver);
	}
	
	@Test
	public void languageButtonVerification() {
		homepage hp = new homepage(driver);
		wLib.implicitWaitForSeconds(driver, 10);
		hp.homePageLaguageBtnVerification();
	}

	@Test
	public void blogRedirectionVerification() {
		homepage hp = new homepage(driver);
		wLib.implicitWaitForMinutes(driver, 10);
		hp.VerifyBlogHomepage(driver);
	}
	@Test
	public void trandingVidosRedirection() {
		homepage hp = new homepage(driver);
		wLib.implicitWaitForMinutes(driver, 10);
		hp.trandingVideo();
	}
	@Test
	public void newslatterVerification() {
		homepage hp = new homepage(driver);
		wLib.implicitWaitForMinutes(driver, 10);
		hp.newslatterverify();
		
	}
	
	@Test
	public void searchVerify() throws InterruptedException {
		homepage hp = new homepage(driver);
		wLib.implicitWaitForMinutes(driver, 10);
		hp.searchBox();
	}*/
	@Test
	public void homepageMiddleSection() throws InterruptedException {
		homepage hp = new homepage(driver);
		wLib.implicitWaitForMinutes(driver, 10);
		hp.verifyHomepageSection(driver);
	}
}
