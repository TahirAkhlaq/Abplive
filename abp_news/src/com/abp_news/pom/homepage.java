package com.abp_news.pom;

import static org.testng.Assert.assertEquals;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.asserts.SoftAssert;

public class homepage extends menupage {

	@FindBy(how = How.XPATH, using = "//a[@class='navbar-brand sprite logosprite']")
	private WebElement logo;
	// Language button Links
	@FindBy(how = How.ID, using = "closeNotification")
	private WebElement closeNotification;
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'हिन्दी')]")
	private WebElement hindiBtn;
	@FindBy(how = How.XPATH, using = "//span[text()='भारत']")
	private WebElement verifyHindi;
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'বাংলা')]")
	private WebElement banglaBtn;
	@FindBy(how = How.XPATH, using = "//a[@class='fatafat-title hidden-sm-down']")
	private WebElement verifyBangla;
	@FindBy(how = How.XPATH, using = "//div[@class='col-sm-6 launage_new hidden-sm-down']//a[@class='tabTrackingDesk'][contains(text(),'Marathi')]")
	private WebElement marathiBtn;
	@FindBy(how = How.XPATH, using = "//div[@class='_lu hidden-md-down']//span[@class='_fc'][contains(text(),'लाईव्ह अपडेट')]")
	private WebElement verifyMarati;
	@FindBy(how = How.XPATH, using = "//div[@class='col-sm-6 launage_new hidden-sm-down']//a[@class='tabTrackingDesk'][contains(text(),'Punjabi')]")
	private WebElement panjabiBtn;
	@FindBy(how = How.XPATH, using = "//span[text()='ਭਾਰਤ']")
	private WebElement verifyPunjabi;
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'ગુજરાતી')]")
	private WebElement gujratiBtn;
	@FindBy(how = How.XPATH, using = "//a[@title='ગુજરાત']")
	private WebElement verifyGujrat;
	@FindBy(how = How.XPATH, using = "//div[@class='col-sm-6 launage_new hidden-sm-down']//a[@class='tabTrackingDesk'][contains(text(),'English')]")
	private WebElement engBtn;

	// Social Links
	@FindBy(how = How.XPATH, using = "//div[@class='header_social hidden-sm-down']//a[@class='sprite fb']")
	private WebElement FbBtn;
	@FindBy(how = How.XPATH, using = "//a[@class='sprite gplus']")
	private WebElement youTubeBtn;
	@FindBy(how = How.XPATH, using = "//div[@class='header_social hidden-sm-down']//a[@class='sprite twitter']")
	private WebElement twitterBtn;
	@FindBy(how = How.XPATH, using = "//div[@class='header_social hidden-sm-down']//a[@class='sprite yt']")
	private WebElement rssBtn;
	// Newslatter
	@FindBy(how = How.ID, using = "email")
	private WebElement emaliField;
	@FindBy(how = How.XPATH, using = "//input[@value='Submit']")
	private WebElement submitBtn;
	@FindBy(how = How.XPATH, using = "//p[contains(text(),'Thanks for Subscribing')]")
	private WebElement successMsg;

	// Tranding Videos
	@FindBy(how = How.XPATH, using = "//p[@class='heading_vid_trend b_b mb-md-0 mar-b-5']")
	private WebElement trandingVdo;
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Trending Videos')]")
	private WebElement ValidateTrndVideo;

	// Review
	@FindBy(how = How.XPATH, using = "//div[@class='_pg']//div[1]//div[1]//a[1]//img[1]")
	private WebElement movieReviewImg;
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'MOVIE REVIEWS')]")
	private WebElement verifyMovieReview; // new tab,getWindowHandle

	// cricket
	@FindBy(how = How.XPATH, using = "//h3[contains(text(),'Cricket')]")
	private WebElement cricket;
	@FindBy(how = How.XPATH, using = "//a[@href='/en']") // new tab,getWindowHandle
	private WebElement verifyCricket;

	// Editorial Blogs
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Editorial Blogs')]")
	private WebElement EbLogs;
	@FindBy(how = How.XPATH, using = "//li//h1[1]")
	private WebElement verifyBlogs;
	@FindBy(how = How.XPATH, using = "//a[@class='view_more_blogger']")
	private WebElement viewMorelink;

	// Entertainment
	@FindBy(how = How.XPATH, using = "//h3[contains(text(),'Entertainment')]")
	private WebElement entertainment;
	@FindBy(how = How.XPATH, using = "//span[@class='logo']")
	private WebElement filmyMonkey;
	// video
	@FindBy(how = How.ID, using = "span_video")
	private WebElement videolink;
	@FindBy(how = How.XPATH, using = "//div[@id='infinite_videos']//div[1]//div[2]//ul[1]//li[1]//a[1]")
	private WebElement verifyVideo;
	@FindBy(how = How.XPATH, using = "//div[@class='row mar0 marginSides ListNews']//div[1]//div[2]//div[2]//h3[1]")
	private WebElement vdolinkstep2;
	@FindBy(how = How.XPATH, using = "//h1[@class='vid_headline']")
	private WebElement vdoDescription;
	// photo
	@FindBy(how = How.ID, using = "span_photo")
	private WebElement photolink;
	@FindBy(how = How.XPATH, using = "//div[@id='infinite_photos']//div[1]//div[1]//div[1]//a[1]//div[1]//div[1]//div[1]")
	private WebElement VerifyPhotos;
	// div[@id='infinite_photos']//div[1]//div[1]//div[1]//a[1]//div[1]//div[1]//div[1]
	// DetailedPhoto
	@FindBy(how = How.XPATH, using = "//div[@class='breadcrumb clearfix hidden-sm-down']//ul")
	private WebElement detailedPhotos;
	// News
	@FindBy(how = How.XPATH, using = "//span[@id='span_news']")
	private WebElement newsLink;

	// LiveTv
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Live TV')]")
	private WebElement liveTv;
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Live Tv')]")
	private WebElement verifyLiveTv;

	@FindBy(how = How.XPATH, using = "//div[@class='storyBox no_padding_headings featured_icon m-30'][1]")
	private WebElement blogDetails;
	// Search
	@FindBy(how = How.ID, using = "searchHere")
	private WebElement srchBtn;
	@FindBy(how = How.ID, using = "search_box_id")
	private WebElement search_box;
	@FindBy(how = How.ID, using = "searchHeading")
	private WebElement srchResult;
	@FindBy(how = How.XPATH, using = "//a[@class='amp_re']")
	private WebElement headingfontSize;
	@FindBy(how = How.XPATH, using = "//i[@class='sprite menu-bars']")
	private WebElement hamBurgerLink;
	@FindBy(how = How.ID, using = "google_ads_iframe_/2599136/English_HP_Medium_0__container__")
	private WebElement adsRHSd;
	@FindBy(how = How.ID, using = "google_ads_iframe_/2599136/English_HP_728x90_0")
	private WebElement headerAds;

	public void homePageLaguageBtnVerification() {
		Reporter.log("****************homePageLaguageBtnVerification Method Executing*****************", true);
		logo.isDisplayed();
		Reporter.log("Logo is displayed", true);
		hindiBtn.click();
		String actualtext = verifyHindi.getText();
		// assertEquals(actualtext, "भारत");
		Reporter.log("Hindi link verified---->" + actualtext, true);
		banglaBtn.click();
		String actualBanglaTxt = verifyBangla.getText();
		// assertEquals(actualBanglaTxt, "শিরোনাম");
		Reporter.log("Bangla Link Verified------>" + actualBanglaTxt, true);
		marathiBtn.click();
		closeNotification.click();
		String actualMarathiTxt = verifyMarati.getText();
//		assertEquals(actualMarathiTxt, "लाईव्ह अपडेट");
		Reporter.log("Marathi Link Verified------>" + actualMarathiTxt, true);
		panjabiBtn.click();
		String actualpunjabiTxt = verifyPunjabi.getText();
//		assertEquals(actualpunjabiTxt, "ਭਾਰਤ");
		Reporter.log("punjabi Link Verified------>" + actualpunjabiTxt, true);
		gujratiBtn.click();
		String actualGujratTxt = verifyGujrat.getText();
//		assertEquals(actualGujratTxt, "ગુજરાત");
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
		Reporter.log("****************verifySocialLinks Method is Executing*****************", true);
		String parent = driver.getWindowHandle();
		Reporter.log("parent Window is---------->" + parent);
		FbBtn.click();
		twitterBtn.click();
		youTubeBtn.click();
		movieReviewImg.click();
		rssBtn.click();

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
		Reporter.log("****************trandingVideo Method is Executing*****************", true);
		trandingVdo.click();
		String actualTxt = ValidateTrndVideo.getText();
		Reporter.log("Getting the Text is =====>" + actualTxt, true);
		Reporter.log("=======Font Size=========>" + ValidateTrndVideo.getCssValue("font-size"), true);

		assertEquals(actualTxt, "TRENDING VIDEOS");
		Reporter.log("<=====Tranding Video link redirecting Succefully to tranding Videos=====>", true);

	}

	public void VerifyBlogHomepage(WebDriver driver) {
		Reporter.log("****************VerifyBlogHomepage Method is Executing*****************", true);
		EbLogs.click();
		String actualTxt = verifyBlogs.getText();
		Reporter.log("Getting the Text is =====>" + actualTxt, true);
		Reporter.log("=======Font Size=========>" + verifyBlogs.getCssValue("font-size"), true);
		assertEquals(actualTxt, "Blog");
		Reporter.log("<=====Editors blog Link redirecting Succefully to editors Blog=====>", true);
		driver.navigate().back();
		Reporter.log("***** Back To HomePage *****", true);

		viewMorelink.click();
		Reporter.log("***** Click on View More Link ***** ", true);
		Reporter.log("***** Found the Blogs as below before Scroll *****", true);
		// Fetching the Blogs name before Scroll
		List<WebElement> blogsName = driver.findElements(By.xpath("//h3[@class='hidden-sm-down heading_limit']"));
		int total_node = blogsName.size();

		for (int i = 0; i < total_node; i++) {
			String blog = blogsName.get(i).getText();
			Reporter.log("===> " + blog, true);

		}

	}

	public void newslatterverify() {
		Reporter.log("****************newslatterverify Method is Executing*****************", true);
		emaliField.sendKeys(randomName() + "@abp.in");
		submitBtn.click();
		String s = successMsg.getText();
		Reporter.log("Newslatter responce=====> " + s, true);
		Reporter.log("=======Font Size=========>" + successMsg.getCssValue("font-size"), true);
		assertEquals(s, "Thanks for Subscribing");

	}

	public void verifyHomepageSection(WebDriver driver) throws InterruptedException {
		Reporter.log("****************verifyHomepageSection Method is Executing*****************", true);
		SoftAssert sa = new SoftAssert();
		Reporter.log("=======Font Size of News Heading=========>" + headingfontSize.getCssValue("font-size"), true);
		// Verify Photo Tab
		photolink.click();
		String photoTxt = VerifyPhotos.getText();
		Reporter.log("Successfully redirected to ====> " + photoTxt, true);
		Reporter.log("=======Font Size=========>" + VerifyPhotos.getCssValue("font-size"), true);
		sa.assertEquals(photoTxt, "PHOTOS");
		Thread.sleep(2000);
		VerifyPhotos.click();
		Reporter.log("Clicked on photo and redirected to Photo Detail page ======>" + detailedPhotos.getText(), true);
		Reporter.log("=======Font Size=========>" + detailedPhotos.getCssValue("font-size"), true);
		driver.navigate().back();

		// verify News Tab
		Thread.sleep(1000);
		newsLink.click();
		Reporter.log("Successfully redirected to ====> " + newsLink.getText(), true);
		Reporter.log("=======Font Size=========>" + newsLink.getCssValue("font-size"), true);
		Reporter.log("=======Font Size=========>" + headingfontSize.getCssValue("font-size"), true);

		Thread.sleep(1000);
		blogDetails.click();
		Reporter.log("***** Detailed News Open Successfully *****", true);
		driver.navigate().back();

		// Verify LiveTV
		liveTv.click();
		Reporter.log("Successfully redirected to ====> " + verifyLiveTv.getText(), true);
		Reporter.log("=======Font Size=========>" + verifyLiveTv.getCssValue("font-size"), true);
		driver.navigate().back();
		Thread.sleep(1000);

		// Verify Video Tab
		Reporter.log("Successfully redirected to ====> " + videolink.getText(), true);
		Reporter.log("=======Font Size=========>" + videolink.getCssValue("font-size"), true);
		videolink.click();
		Reporter.log("click on vidolink", true);
//		String s = verifyVideo.getText();
//		Reporter.log("getting Text ====> " + s, true);
		// sa.assertEquals(s, "VIDEO");

		verifyVideo.click();
		// Thread.sleep(2000);
		vdolinkstep2.click();

		Reporter.log("video description is=====> " + vdoDescription.getText(), true);
		Reporter.log("============Font Size Of Description==========>" + vdoDescription.getCssValue("font-size"), true);

	}

	// Verify Search Result
	public void searchBox() throws InterruptedException {
		Reporter.log("****************searchBox Method is Executing*****************", true);
		srchBtn.click();
		Thread.sleep(2000);
		search_box.sendKeys("modi", Keys.ENTER);
		Reporter.log("***************Search result shown for ***********" + srchResult.getText(), true);

	}

	// On Small browser window size
	public void verificationOnMobileWindow(WebDriver driver) {
		Reporter.log("****************verificationOnMobileWindow Method is Executing*****************", true);
		WebElement elementToClick = driver
				.findElement(By.xpath("//li[@id='photoTab']//a[@href='https://www.abplive.in/photos']"));
		elementToClick.click();

		Reporter.log("=============Clicked on Photo Tab =======>", true);
		driver.findElement(
				By.xpath("//div[@class='row mar0 marginSides ListNews']//div[1]//div[2]//div[1]//a[1]//img[1]"))
				.click();
		Reporter.log("=============Clicked on Photo News =======>", true);

		String S = driver.findElement(By.xpath("//h1[@class='padDiff']")).getText();
		Reporter.log("Photos heading is =======>" + S, true);
	}

	public void homePageImageSizeVerify(WebDriver driver) throws InterruptedException {

		WebDriverWait wait = new WebDriverWait(driver, 40);
		//WebElement element1 = driver.findElement(By.id("google_ads_iframe_/2599136/English_HP_728x90_0"));
		while (true) {
			Reporter.log("Home Page Image verification method is running now", true);
			if (headerAds.isDisplayed()) {
				int height = headerAds.getSize().getHeight();
				int width = headerAds.getSize().getWidth();
				Reporter.log("Header adds Image Height is==========> " + height + "Px" + " Image Width is======> "
						+ width + "Px", true);
				break;
			} else {
				Reporter.log("page refresh", true);
				driver.navigate().refresh();
			}
		}
		
		WebElement element = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.id("div-gpt-ad-1480314619440-3")));
		int h1 = element.getSize().getHeight();
		int w1 = element.getSize().getWidth();
		Reporter.log("RHS screen ads Image Height is=======> " + h1 + "Px" + " Image Width is======> " + w1 + "Px",
				true);
		//assertEquals(h1, "250");
		
		List<WebElement> newsImage1 = driver.findElements(By.xpath("//div[@class='news_image video_thumb']"));
		Thread.sleep(1000);
		int h2 = newsImage1.get(0).getSize().getHeight();
		int w2 = newsImage1.get(0).getSize().getWidth();
		Reporter.log("News Image Height is=================> " + h2 + "Px" + " Image Width is======> " + w2 + "Px",
				true);

		WebElement addImage2 = wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.id("google_ads_iframe_/2599136/English_HP_Story_0")));
		int w3 = addImage2.getSize().getWidth();
		int h3 = addImage2.getSize().getHeight();
		Reporter.log("Middle section ads Height is=========> " + h3 + "Px" + " Image Width is======> " + w3 + "Px",
				true);
	
		
		/*WebElement addImage4 = wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.id("google_ads_iframe_/2599136/English_HP_Medium_0__container__")));
		int w5 = addImage4.getSize().getWidth();
		int h5 = addImage4.getSize().getHeight();
		Reporter.log("Middle section ads Height is=========> " + h5 + "Px" + " Image Width is======> " + w5 + "Px",
				true);*/
	//	WebElement adsImage4 = driver.findElement((By.id("google_ads_iframe_/2599136/English_HP_Medium_0__container__")));
	while(true) {
		if(adsRHSd.isDisplayed()) {
		int w5 = adsRHSd.getSize().getWidth();
		int h5 = adsRHSd.getSize().getHeight();
		Reporter.log("RHS downside ads Height is===========> " + h5 + "Px" + " Image Width is========> " + w5 + "Px",
				true);
		break;
		}
		else {
			driver.navigate().refresh();
		}
	}
	
	
	}
}