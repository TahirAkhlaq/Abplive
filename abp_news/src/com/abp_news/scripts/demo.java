/**
 * 
 */
package com.abp_news.scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @author bluepi
 *
 */
public class demo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://abpnews.abplive.in/");
		driver.findElement(By.xpath("//div[@class='storyBox no_b hp_large']")).click();
	}

}
