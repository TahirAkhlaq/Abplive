package com.abp_news.pom;

import static org.testng.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.server.handler.GetAllWindowHandles;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class homepage extends menupage {

	@FindBy(how = How.XPATH, using = "//a[@class='navbar-brand sprite logosprite']")
	WebElement logo;
	// Language Links
	@FindBy(how = How.ID, using = "closeNotification")
	WebElement closeNotification;
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'हिन्दी')]")
	WebElement hindiBtn;
	@FindBy(how = How.XPATH, using = "//span[text()='भारत']")
	WebElement verifyHindi;
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'বাংলা')]")
	WebElement banglaBtn;
	@FindBy(how = How.XPATH, using = "//a[@class='fatafat-title hidden-sm-down']")
	WebElement verifyBangla;
	@FindBy(how = How.XPATH, using = "//div[@class='col-sm-6 launage_new hidden-sm-down']//a[@class='tabTrackingDesk'][contains(text(),'Marathi')]")
	WebElement marathiBtn;
	@FindBy(how = How.XPATH, using = "//div[@class='_lu hidden-md-down']//span[@class='_fc'][contains(text(),'लाईव्ह अपडेट')]")
	WebElement verifyMarati;
	@FindBy(how = How.XPATH, using = "//div[@class='col-sm-6 launage_new hidden-sm-down']//a[@class='tabTrackingDesk'][contains(text(),'Punjabi')]")
	WebElement panjabiBtn;
	@FindBy(how = How.XPATH, using = "//span[text()='ਭਾਰਤ']")
	WebElement verifyPunjabi;
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'ગુજરાતી')]")
	WebElement gujratiBtn;
	@FindBy(how = How.XPATH, using = "//a[@title='ગુજરાત']")
	WebElement verifyGujrat;
	@FindBy(how = How.XPATH, using = "//div[@class='col-sm-6 launage_new hidden-sm-down']//a[@class='tabTrackingDesk'][contains(text(),'English')]" )
	WebElement engBtn;
	// Social Links
	@FindBy(how = How.XPATH, using = "//div[@class='header_social hidden-sm-down']//a[@class='sprite fb']")
	WebElement FbBtn;
	@FindBy(how = How.XPATH, using = "//a[@class='sprite gplus']")
	WebElement youTubeBtn;
	@FindBy(how = How.XPATH, using = "//div[@class='header_social hidden-sm-down']//a[@class='sprite twitter']")
	WebElement twitterBtn;
	@FindBy(how = How.XPATH, using = "//div[@class='header_social hidden-sm-down']//a[@class='sprite yt']")
	WebElement rssBtn;
	
	@FindBy(how = How.ID, using = "email")
	WebElement emaliField;
	@FindBy(how = How.XPATH, using = "//input[@value='Submit']")
	WebElement submitBtn;

	// Trandind Videos
	@FindBy(how = How.XPATH, using = "//p[@class='heading_vid_trend b_b mb-md-0 mar-b-5']")
	WebElement trandingVdo;
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Trending Videos')]")
	WebElement ValidateTrndVideo;

	// Review
	@FindBy(how = How.XPATH, using = "//div[@class='_pg']//div[1]//div[1]//a[1]//img[1]")
	WebElement reviewImg;
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'MOVIE REVIEWS')]")
	WebElement movReview; // new tab,getWindowHandle

	// cricket
	@FindBy(how = How.XPATH, using = "//h3[contains(text(),'Cricket')]")
	WebElement cricket;
	@FindBy(how = How.XPATH, using = "//a[@href='/en']") // new tab,getWindowHandle
	WebElement verifyCricket;

	// Editorial Blogs
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Editorial Blogs')]")
	WebElement EbLogs;
	@FindBy(how = How.XPATH, using = "//li//h1[1]")
	WebElement verifyBlogs;

	// Entertainment
	@FindBy(how = How.XPATH, using = "//h3[contains(text(),'Entertainment')]")
	WebElement entertainment;
	@FindBy(how = How.XPATH, using = "//span[@class='logo']")
	WebElement filmyMonkey;
	// video
	@FindBy(how = How.ID, using = "span_video")
	WebElement videolink;
	@FindBy(how = How.XPATH, using = "//div[@id='infinite_videos']//div[1]//div[2]//ul[1]//li[1]//a[1]")
	WebElement verifyVideo;
	// photo
	@FindBy(how = How.ID, using = "span_photo")
	WebElement photolink;
	@FindBy(how = How.XPATH, using = "//div[@id='infinite_photos']//div[2]//div[2]//ul[1]//li[1]//a[1]")
	WebElement VerifyPhotos;
	// LiveTv
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Live TV')]")
	WebElement liveTv;
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Live Tv')]")
	WebElement verifyLiveTv;

	public void homePageLaguageBtnVerification() {
		logo.isDisplayed();
		Reporter.log("Logo is displayed", true);
		hindiBtn.click();
		String actualtext = verifyHindi.getText();
		assertEquals(actualtext, "भारत");
		Reporter.log("Hindi link verified---->" + actualtext, true);
		banglaBtn.click();
		String actualBanglaTxt = verifyBangla.getText();
		assertEquals(actualBanglaTxt, "শিরোনাম");
		Reporter.log("Bangla Link Verified------>" + actualBanglaTxt, true);
		marathiBtn.click();
		closeNotification.click();
		String actualMarathiTxt = verifyMarati.getText();
		assertEquals(actualMarathiTxt, "लाईव्ह अपडेट");
		Reporter.log("Marathi Link Verified------>" + actualMarathiTxt, true);
		panjabiBtn.click();
		String actualpunjabiTxt = verifyPunjabi.getText();
		assertEquals(actualpunjabiTxt, "ਭਾਰਤ");
		Reporter.log("punjabi Link Verified------>" + actualpunjabiTxt, true);
		gujratiBtn.click();
		String actualGujratTxt = verifyGujrat.getText();
		assertEquals(actualGujratTxt, "ગુજરાત");
		Reporter.log("Gujrati Link Verified------>" + actualGujratTxt, true);
		engBtn.click();
		Reporter.log("<========================All Language Button Verified Succefully===============================>",true);
	}

	public homepage(WebDriver driver) {
		super();
		PageFactory.initElements(driver, this);
	}

	public void verifySocialLinks(WebDriver driver) throws InterruptedException {
		String parent = driver.getWindowHandle();
		Reporter.log("parent Window is---------->" + parent);
		FbBtn.click();
		twitterBtn.click();
		youTubeBtn.click();
		rssBtn.click();
		Reporter.log("<=========== Clicked on RSS Button============>",true);
		Set<String> allwindows = driver.getWindowHandles();
		int count = allwindows.size();
		Reporter.log("total window  " + count, true);
		for (String child : allwindows) {
			if (!parent.equalsIgnoreCase(child)) {
				driver.switchTo().window(child);
				Reporter.log("***************Child Window Title is  " + driver.getTitle(),true);
				Thread.sleep(2000);
				driver.close();
				
			}
		}
		driver.switchTo().window(parent);
		Reporter.log("***********Parent Window Title is "+driver.getTitle(),true);
		Reporter.log("<========================All Social Sites links verified Successfully===============================>",true);	
		
	}

}
