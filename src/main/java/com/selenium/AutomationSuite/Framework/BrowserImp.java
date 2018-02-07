package com.selenium.AutomationSuite.Framework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;

public class BrowserImp {

		
		public static WebDriver mdriver;
		
		public BrowserImp()
		{
			
		}
		
		public static void waitTillElementAppears(WebElement element,int waittime)
		{
			WebDriverWait wait = new WebDriverWait(mdriver, waittime);
			wait.until(ExpectedConditions.visibilityOf(element));		
		}
		
		public void FluentWait(By E, int waittime)
		{
			WebDriverWait wait = new WebDriverWait(mdriver, waittime);
			
		}

		public static void setup()
		{
			System.setProperty("webdriver.chrome.driver", "chromedriver_win32//chromedriver.exe");
			mdriver = new ChromeDriver();
			mdriver.get("https://the-internet.herokuapp.com/");
			mdriver.manage().window().maximize();
			mdriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		}
		
		public static void tearDown()
		{
			mdriver.close();
			mdriver.quit();
			
		}
		
		public static WebDriver getDriver()
		{
			return mdriver;
		}
	}

