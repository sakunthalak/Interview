package com.qa.util;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.qa.config.ReadPropertiesFile;

public class Base {
	
	public static WebDriver driver;
	static String driverpath= System.getProperty("user.dir")+ "\\drivers";
	public static ReadPropertiesFile  prop= new ReadPropertiesFile();
	public static Properties result=prop.readAll("config.properties");		
		
	public static void startWebDriver() {
		driver.get(result.getProperty("url"));
		
	}
	
	public static WebDriver getWebDriverInstance() {
		String browser=result.getProperty("browser");
		
		if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",driverpath+"\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		if(browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver\"",driverpath+"\\geckodriver.exe");
			driver=new FirefoxDriver();
		}
		if(browser.equalsIgnoreCase("ieexplorer")) {
			System.setProperty("webdriver.ie.driver",driverpath+"\\IEDriver.exe");
			driver=new InternetExplorerDriver();
		}
		 if (browser.equalsIgnoreCase("htmlunitdriver"))
		 { driver=new HtmlUnitDriver();
		 }
		 driver.manage().window().maximize();
		 return Base.driver;
	}
	
	public static void tearDown()
	{
		driver.close();
	}
	
	
	

	
	
	
}
