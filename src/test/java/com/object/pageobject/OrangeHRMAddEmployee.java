package com.object.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrangeHRMAddEmployee {
	
   WebDriver driver;
   
   public OrangeHRMAddEmployee(WebDriver driver) {
	   this.driver= driver;
   }
   
   By name= By.name("firstName");
   
   By mname= By.name("middleName");
   
   By lname= By.name("lastName");
   
   
   public void addEmployee() {
	   driver.findElement(name).sendKeys("Ram");
       
	   driver.findElement(mname).sendKeys("Rahim");
   }

}
