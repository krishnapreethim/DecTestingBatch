package com.testscripts;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.object.pageobject.OrangeHRMAddEmployee;
import com.object.pageobject.OrangeHRMLogin;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OrnageHRMTest {
	
	WebDriver driver;
	
	Properties pr;
	
	@BeforeSuite
	public void configData() throws IOException {
		File file= new File("C:\\Users\\gurum\\Desktop\\XTreamTech\\MyProjects\\PageObjectModel\\config.properties");
		
		BufferedReader reader= new BufferedReader(new FileReader(file));
		
		pr= new Properties();
		
		pr.load(reader);
	}
	
	@BeforeMethod
	public void setUP() {
		WebDriverManager.chromedriver().setup();
		
		driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		String url=pr.getProperty("url");
	 
		driver.get(url);
		
	}
	
	@Test(priority = 1)
	public void loginTestScript() {
		
		OrangeHRMLogin login= new OrangeHRMLogin(driver);
		
		String username=pr.getProperty("username");
		String password= pr.getProperty("password");
		
		login.OrangeHRMLoginTest(username, password);
	}
	
	@Test (enabled= false, priority = 2)
	public void addEmployeeTestScript() {
		OrangeHRMAddEmployee addEmploye= new OrangeHRMAddEmployee(driver);
		
		addEmploye.addEmployee();
	}
	
	@AfterMethod
	public void logOut() {
		driver.close();
	}
	
	

}
