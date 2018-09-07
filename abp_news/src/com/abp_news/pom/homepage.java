package com.abp_news.pom;

import static org.testng.Assert.assertEquals;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class homepage extends menupage {

	@FindBy(how = How.XPATH, using = "//a[@class='navbar-brand sprite logosprite']")
	WebElement logo;
	// Language button Links
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
	@FindBy(how = How.XPATH, using = "//div[@class='col-sm-6 launage_new hidden-sm-down']//a[@class='tabTrackingDesk'][contains(text(),'English')]")
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
	// Newslatter
	@FindBy(how = How.ID, using = "email")
	WebElement emaliField;
	@FindBy(how = How.XPATH, using = "//input[@value='Submit']")
	WebElement submitBtn;
	@FindBy(how =How.XPATH, using = "//p[contains(text(),'Thanks for Subscribing')]")
	WebElement successMsg;

	// Trandind Videos
	@FindBy(how = How.XPATH, using = "//p[@class='heading_vid_trend b_b mb-md-0 mar-b-5']")
	WebElement trandingVdo;
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Trending Videos')]")
	WebElement ValidateTrndVideo;
	// div[@id='web_section_area']//ul//li[1]
	// Review
	@FindBy(how = How.XPATH, using = "//div[@class='_pg']//div[1]//div[1]//a[1]//img[1]")
	WebElement movieReviewImg;
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'MOVIE REVIEWS')]")
	WebElement verifyMovieReview; // new tab,getWindowHandle

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
	@FindBy(how = How.XPATH, using = "//a[@class='view_more_blogger']")
	WebElement viewMorelink;

	// Entertainment
	@FindBy(how = How.XPATH, using = "//h3[contains(text(),'Entertainment')]")
	WebElement entertainment;
	@FindBy(how = How.XPATH, using = "//span[@class='logo']")
	WebElement filmyMonkey;
	// video
	@FindBy(how = How.ID, using = "span_video")
	WebElement videolink;
	@FindBy(how = How.XPATH, using = "//div[@id='infinite_videos']//div[2]//div[2]//ul[1]//li[1]//a[1]")
	WebElement verifyVideo;
	// photo
	@FindBy(how = How.ID, using = "span_photo")
	WebElement photolink;
	@FindBy(how = How.XPATH, using = "//div[@id='infinite_photos']//div[1]//div[2]//ul[1]//li[1]//a[1]")
	WebElement VerifyPhotos;   
	//News
	@FindBy(how = How.XPATH, using = "//span[@id='span_news']")
	WebElement newsLink;
	
	// LiveTv
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Live TV')]")
	WebElement liveTv;
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Live Tv')]")
	WebElement verifyLiveTv;
	
	@FindBy(how = How.XPATH, using = "//div[@class='storyBox no_padding_headings featured_icon m-30'][1]")
	WebElement blogDetails;

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
		Reporter.log("<========================All Language Button Verified Succefully===============================>",
				true);
	}

	public homepage(WebDriver driver) {
		super();
		PageFactory.initElements(driver, this);
	}

	// This Method verify all the social login links
	public void verifySocialLinks(WebDriver driver) throws InterruptedException {
		String parent = driver.getWindowHandle();
		Reporter.log("parent Window is---------->" + parent);
		FbBtn.click();
		twitterBtn.click();
		youTubeBtn.click();
		rssBtn.click();
		movieReviewImg.click();
		Reporter.log("<=========== Clicked on RSS Button============>", true);
		Set<String> allwindows = driver.getWindowHandles();
		int count = allwindows.size();
		Reporter.log("total window  " + count, true);
		for (String child : allwindows) {
			if (!parent.equalsIgnoreCase(child)) {
				driver.switchTo().window(child);
				Reporter.log("***************Child Window Title is  " + driver.getTitle(), true);
				Thread.sleep(2000);
				driver.close();

			}
		}
		driver.switchTo().window(parent);
		Reporter.log("***********Parent Window Title is " + driver.getTitle(), true);
		Reporter.log(
				"<========================All Social Sites links verified Successfully===============================>",
				true);

	}

	public void trandingVideo() {
		trandingVdo.click();
		String actualTxt = ValidateTrndVideo.getText();
		Reporter.log("Getting the Text is =====>" + actualTxt, true);
		assertEquals(actualTxt, "TRENDING VIDEOS");
		Reporter.log("<=====Tranding Video link redirecting Succefully to tranding Videos=====>", true);

	}

	public void VerifyBlogHomepage(WebDriver driver) {
		EbLogs.click();
		String actualTxt = verifyBlogs.getText();
		Reporter.log("Getting the Text is =====>" + actualTxt, true);
		assertEquals(actualTxt, "Blog");
		Reporter.log("<=====Editors blog Link redirecting Succefully to editors Blog=====>", true);
		driver.navigate().back();
		Reporter.log("***** Back To HomePage *****",true);
		
		viewMorelink.click();
		Reporter.log("***** Click on View More Link ***** ", true);
		Reporter.log("***** Found the Blogs as below before Scroll *****", true);
		//Fetching the Blogs name before Scroll
		List<WebElement> blogsName = driver.findElements(By.xpath("//h3[@class='hidden-sm-down heading_limit']"));
		int total_node = blogsName.size();
		
		for (int i = 0; i < total_node; i++) {
			String blog = blogsName.get(i).getText();
			Reporter.log("===> "+blog,true);
			System.out.println(blog);
		}

	}

	public void newslatterverify() {
		emaliField.sendKeys(randomName()+"@abp.in");
		submitBtn.click();
		String s = successMsg.getText();
		Reporter.log("Newslatter responce=====> "+s,true);
		assertEquals(s, "Thanks for Subscribing");
		
	}
	
	public void verifyHomepageSection(WebDriver driver) throws InterruptedException {
		//Verify Video Tab
		videolink.click();
		String s = verifyVideo.getText();
		Reporter.log("getting Text ====> "+s,true);
	//	assertEquals(s, "VIDEO");
		Reporter.log("Successfully redirected to ====> "+videolink.getText(),true);
		
		//Verify Photo Tab
		photolink.click();
		String photoTxt = VerifyPhotos.getText();
		//Reporter.log("Successfully redirected to ====> "+photoTxt,true);
		//assertEquals(photoTxt, "PHOTOS");
		//verify News Tab
		Reporter.log("Successfully redirected to ====> "+photoTxt,true);
		newsLink.click();
		Reporter.log("Successfully redirected to ====> "+newsLink.getText(),true);
		blogDetails.click();
		Reporter.log("***** Detailed News Open Successfully *****",true);
		//Verify LiveTV
		driver.navigate().back();
		liveTv.click();
		Reporter.log("Successfully redirected to ====> "+verifyLiveTv.getText(),true);
		
		
	}
}