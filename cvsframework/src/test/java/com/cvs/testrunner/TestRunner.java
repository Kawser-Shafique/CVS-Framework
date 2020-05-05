package com.cvs.testrunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		
		features = {"Features"},
		glue = {"com.cvs.steps"},
		tags = {"@cvssearch"}
		
		)
public class TestRunner extends AbstractTestNGCucumberTests {

	

}
