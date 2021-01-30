package com.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class CucumberBase {
	  WebDriver driver;
	
public WebDriver launchBrowser() throws IOException {
	
	String browser= readProperties("Browser");
	if(browser.equals("chrome"))
	{
	System.setProperty("webdriver.chrome.driver","C:\\eclipse and jdk\\com.learn.cucumber\\Driver\\chromedriver.exe");
	  driver= new ChromeDriver();
	}
	else if(browser.equals("firefox"))
	{
	System.setProperty("webdriver.gecko.driver","C:\\eclipse and jdk\\com.learn.cucumber\\Driver\\geckodriver.exe");
	 driver= new FirefoxDriver();
	 
	 
		
	}
	else if (browser.equals("IE"))
	{
	 System.setProperty("webdriver.ie.driver","C:\\eclipse and jdk\\com.learn.cucumber\\Driver\\IEDriverServer.exe");
	 driver= new InternetExplorerDriver();
		
	}
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
	
	public String readProperties(String key) throws IOException
	{
		FileInputStream fs= new FileInputStream("C:\\eclipse and jdk\\com.learn.cucumber\\config.property");
		Properties pro = new Properties();
		pro.load(fs);
		String property=pro.getProperty(key);
		return property;
	}
	
	public void implicitWait() throws IOException
	{
		String readprop=readProperties("Implicitwait");
		driver.manage().timeouts().implicitlyWait(Integer.parseInt(readprop), TimeUnit.SECONDS);
	}
	
	
	
}

