package com.object.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;

public class OrangeHRMLogin {

	WebDriver driver;

	
	public OrangeHRMLogin(WebDriver driver) {
		this.driver = driver;
	} // By using this constructor current driver get initialized

	By username = By.xpath("//input[@placeholder= 'Username']"); // Locators

	By password = By.name("password");

	By loginbtn = By.xpath("//button[@type= 'submit']");
	
	

	
	public void OrangeHRMLoginTest(String Username, String Password) {
		
		driver.findElement(username).sendKeys(Username);

		driver.findElement(password).sendKeys(Password);

		driver.findElement(loginbtn).click();

		String exp_url = "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";

		String act_url = driver.getCurrentUrl();

		Assert.assertEquals(exp_url, act_url);
	}
	
	
}
