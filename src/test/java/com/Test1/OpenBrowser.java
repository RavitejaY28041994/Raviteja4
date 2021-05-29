package com.Test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenBrowser {
	public static WebDriver driver;

	@BeforeTest
	public static void invokeBrowser() {
	    WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}

	@AfterTest
	public static void releaseBrowser() {
		driver.close();
		driver.quit();

	}

	@Test
	public static void setChromePath() {
	
		driver.navigate().to("https://facebook.com/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("raviteja");
	}

}
