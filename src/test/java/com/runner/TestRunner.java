package com.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



	@RunWith(Cucumber.class)
	
	
	  @CucumberOptions(features
	  ="src/test/resources/Features/Facebook.feature",glue={"StepDef"}, dryRun =
	  true,monochrome = true,plugin = {"pretty","json:target/MyReports/report.json"}, tags = "@datatable")
	 
	public class TestRunner 
	{	
	
 }
