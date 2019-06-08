package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.Base;

public class Dealerportal extends Base{

	
	static WebElement vehiclereg=driver.findElement(By.id("vehicleReg"));
	static WebElement FindVehicle=driver.findElement(By.name("btnfind"));
	
	static WebElement homepagelogo=driver.findElement(By.xpath("//*[@id=\\\"header\\\"]/a/img"));
	
	
	//page Factory
	
//	
//	@FindBy(id="vehicleReg")
//	WebElement vehiclereg;
//	
//	@FindBy(name="btnfind")
//	WebElement FindVehicle;
//	
//	@FindBy(xpath="//*[@id=\"header\"]/a/img")
//	WebElement homepagelogo;
	
	
	
//	public Dealerportal() {
//		
//		PageFactory.initElements(driver,this);
//	}
	
	
	
	public String validateHomepageTitle() {
		String title1=driver.getTitle();
		return title1;
	}
	
	
	
	public void regNumber(String regnum)
	{
		vehiclereg.sendKeys(regnum);
		FindVehicle.click();
		
		
	}
	
	
	
	
}
