package com.qa.TestRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:\\Users\\poorn\\eclipse-workspace\\com.VFS\\src\\main\\java\\Cucumber\\com\\VFS\\vehiclecoverchk.feature", //the path of the feature files
		glue={"vehicle_stepdefinition"}, //the path of the step definition files
		
		//format= {"pretty","html:test-outout"}, //to generate different types of reporting
		
		monochrome = true, //display the console output in a proper readable format
		strict = false, //it will check if any step is not defined in step definition file
		dryRun = false//to check the mapping is proper between feature file and step def file
		//tags = {"~@SmokeTest" , "~@RegressionTest", "~@End2End"}			
		)


public class Vehicle_iden_runner {

}
