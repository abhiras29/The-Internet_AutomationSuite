package com.selenium.AutomationSuite.PageFactory;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.selenium.AutomationSuite.Framework.BrowserImp;

public class HomePage {
	
	@FindBy(how = How.XPATH, using="//div[@id='content']/ul/li/a")
	public List<WebElement> lnkLocatorsList;
	
	@FindBy(how = How.XPATH, using="//a[contains(text(),'A/B Testing')]")
	public WebElement lnkABTesting;
	
	@FindBy(how = How.XPATH, using="")
	public WebElement lnkBasicAuth;

	@FindBy(how = How.XPATH, using="")
	public WebElement lnkBrokenImages;
	
	@FindBy(how = How.XPATH, using="")
	public WebElement lnkChallengingDOM;
	
	@FindBy(how = How.XPATH, using="")
	public WebElement lnkCheckboxes;
	
	@FindBy(how = How.XPATH, using="")
	public WebElement lnkContextMenu;
	
	@FindBy(how = How.XPATH, using="")
	public WebElement lnkDisappearingElements;
	
	@FindBy(how = How.XPATH, using="")
	public WebElement lnkDragAndDrop;
	
	@FindBy(how = How.XPATH, using="")
	public WebElement lnkDropdown;
	
	@FindBy(how = How.XPATH, using="")
	public WebElement lnkDynamicContent;

	
	/* ---------------------------------------------Business Layer Functions ------------------------------------------*/
	
	static Map<String, WebElement> linksLocatorsMap = new HashMap<String, WebElement>();
	static HomePage hg = PageFactory.initElements(BrowserImp.mdriver, HomePage.class);
	
	public static Map<String, WebElement> populateLinkLocators()
	{
		BrowserImp.waitTillElementAppears(hg.lnkLocatorsList.get(0), 10);
		
		List<WebElement> elementList = BrowserImp.mdriver.findElements(By.xpath("//div[@id='content']/ul/li/a"));
		
		for (WebElement webElement : elementList) {
			
			//Populate the Map with Key as Text and Value as the corresponding element
			linksLocatorsMap.put(webElement.getText().trim(), webElement);
				
		}
		
		return linksLocatorsMap;
	}
	
	
}
