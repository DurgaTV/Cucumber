package com.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)


  @CucumberOptions(
features="src/test/resources/Features/Register.feature"
,glue={"StepDef"}, dryRun =
  false,monochrome = true,plugin ={"pretty",
		  "html:target/MyReports/report.html",
		  "json:target/MyReports/report.json",
		  "junit:target/MyReports/report.xml"
}
,publish=true
)
 
 public class RegisterRunner {

}
