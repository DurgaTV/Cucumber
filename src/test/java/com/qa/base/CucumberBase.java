package com.qa.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CucumberBase {
	public  WebDriver driver;
	
public WebDriver launchBrowser() {
	
	System.setProperty("webdriver.chrome.driver","C:\\eclipse and jdk\\com.learn.cucumber\\Driver\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	return driver;
	
}
	public void urlLoad(WebDriver driver,String url)
	{
		
		driver.get(url);
	}
	
	public void send(WebElement e,String s) {
		e.sendKeys(s);
	}
	
	public void Click(WebElement e) {
	e.click();
	}
	
	public void browserMaxim(WebDriver driver)
	{
		driver.manage().window().maximize();
	}
	
}

