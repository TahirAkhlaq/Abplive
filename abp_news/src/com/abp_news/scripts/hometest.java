package com.abp_news.scripts;


import org.testng.annotations.Test;

import com.abp_news.generic.BaseLib;
import com.abp_news.pom.homepage;

public class hometest extends BaseLib {

	@Test
	public void linkVerification() throws InterruptedException {
		homepage hp = new homepage(driver);
		wLib.implicitWaitForSeconds(driver, 10);
	//	hp.linkVerification(driver);
	//	hp.homePageLaguageBtnVerification();
		//hp.verifySocialLinks(driver);
		//hp.trandingVideo();
		//hp.VerifyBlogHomepage(driver);
		//hp.newslatterverify();
		hp.verifyHomepageSection(driver);

		
		
	}
	

}
