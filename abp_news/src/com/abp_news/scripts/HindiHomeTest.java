/**
 * 
 */
package com.abp_news.scripts;

import org.testng.annotations.Test;

import com.abp_news.generic.BaseLib;
import com.abp_news.pom.HindiHomePage;

/**
 * @author bluepi
 *
 */
public class HindiHomeTest extends BaseLib{

	@Test
	public void image() throws InterruptedException {
		HindiHomePage hhp = new HindiHomePage(driver);
		wLib.implicitWaitForSeconds(driver, 10);
		hhp.hindihomepageVerify(driver);
		hhp.linkVerification(driver);
		hhp.verifySocialLinksm(driver);
		
	}
	
}
