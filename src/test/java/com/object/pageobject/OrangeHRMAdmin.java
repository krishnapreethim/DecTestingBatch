package com.object.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrangeHRMAdmin {
	
	WebDriver driver;
	
	public OrangeHRMAdmin(WebDriver driver) {
		this.driver=driver;
	} // This is used for the initialization of driver
	
	
	
	By usrname= By.xpath("//tagname[@attribute='value']");
	
	By userrole= By.name("role");
	
	By empname= By.id("empname");
	
	By empstatus= By.linkText("empstatus");
	
	
	
	public void admincreation() {
		
	}

}
