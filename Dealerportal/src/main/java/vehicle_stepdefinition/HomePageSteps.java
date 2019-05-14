package vehicle_stepdefinition;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.openqa.selenium.By;

import com.qa.pages.Dealerportal;
import com.qa.util.Base;
import com.qa.util.Log;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import junit.framework.Assert;

public class HomePageSteps extends Base{
	Dealerportal coverchkpage =new Dealerportal();
	public String RegistrationNumber=Base.result.getProperty("ValidRegNumber");
	
	@Given("^Open the Chrome and Launch the application$")
	public void open_the_Chrome_and_Launch_the_application() throws Throwable {
	    
		Base.getWebDriverInstance();
		Base.startWebDriver();
			  
	}



	@Then("^validate user is on homepage$")
	public void validate_user_is_on_homepage() throws Throwable {
		String title=coverchkpage.validateHomepageTitle();
	    Assert.assertEquals("Dealer Portal", title);
		Log.info("user is on Dealerportal page");
	   
	}

	@Then("^user enter vehicle reg number and clicks find$")
	public void user_enter_vehicle_reg_number_and_clicks_find() throws Throwable {
		
				
		Pattern pattern = Pattern.compile("[a-zA-Z0-9]*");
		Matcher matcher = pattern.matcher(RegistrationNumber);
		if (matcher.matches()) {
			System.out.println(RegistrationNumber);
			coverchkpage.regNumber(RegistrationNumber);
			Thread.sleep(3000);
		}
		else
			System.out.println("invalid Reg number");
	}


@Then("^verifies vehicle exists$")
public void verifies_vehicle_exists() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	
	String string1=driver.findElement(By.xpath("//*[@id=\"page-container\"]/div[4]/div[1]")).getText();
	
	boolean isfound=string1.contains(RegistrationNumber);
	
	if(isfound==true)
	System.out.println("vehicle insurance is exists");
	else
		System.out.println("vehicle not exists");
	
	
	
    
}



	
	

}
