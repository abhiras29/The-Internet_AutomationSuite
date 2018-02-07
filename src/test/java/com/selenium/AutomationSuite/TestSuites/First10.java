/**
 * 
 */
package com.selenium.AutomationSuite.TestSuites;

import java.util.Map;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.selenium.AutomationSuite.Framework.BrowserImp;
import com.selenium.AutomationSuite.PageFactory.HomePage;

/**
 * @author abhiras29
 * A/B Testing -> Completed
 * Basic Auth (user and pass: admin)
 * Broken Images
 * Challenging DOM
 * Checkboxes
 * Context Menu
 * Disappearing Elements
 *  Drag and Drop
 * Dropdown
 * Dynamic Content
 */
public class First10 {
	
	//Global Variables Declaration
	public static HomePage homePage;
	public static Map<String, WebElement> linkLocators;
	
	@BeforeClass
	public void initialSetup()	
	{
		homePage = PageFactory.initElements(BrowserImp.mdriver, HomePage.class);
		linkLocators = HomePage.populateLinkLocators();
	}
	
	@BeforeTest
	public void setup()
	{
		BrowserImp.setup();
		
	}
	
	@AfterTest
	public void tearDown()
	{
		BrowserImp.tearDown();
	}

	@Test
	public void ABTesting() throws InterruptedException
	{
		linkLocators.get("A/B Testing").click();
		
		Thread.sleep(2000);
	}
}
