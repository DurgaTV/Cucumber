package StepDef;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;


import com.pom.CucumberPojo;
import com.qa.base.CucumberBase;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class FacebookClass {
	WebDriver driver;
	CucumberBase base = new CucumberBase();
	CucumberPojo pj = new CucumberPojo();
	
	@Given("Open the facebook pages")
	public void open_the_facebook_pages() throws IOException {
		
		driver=base.launchBrowser();
		base.urlLoad(driver,"https://www.facebook.com/");
		base.browserMaxim(driver);
		base.implicitWait();
		
		
	}  
	
	


@When("Enter the username and password")
public void enter_the_username_and_password(DataTable dataTable) 
{
	
	PageFactory.initElements(driver, pj);
	Map<Object, Object> asMap = dataTable.asMap(String.class, String.class);
	 WebElement accept =
			 driver.findElement(By.xpath("//button[@title='Alle akzeptieren']"));
	 		 accept.click();
	
	 base.send(pj.getTxtUsername(), String.valueOf(asMap.get("username")));
	 System.out.println(String.valueOf(asMap.get("username")));
	 base.send(pj.getTxtPassword(), String.valueOf(asMap.get("password")));
	 base.Click(pj.getBtnLogin());
}
	  
	@Then("Validate the login username")
	public void validate_the_login_username() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String s = driver.getTitle();
		System.out.println(s);
		Assert.assertEquals("Facebook – Anmelden oder Registrieren", s);

	}
	
	

	

}
