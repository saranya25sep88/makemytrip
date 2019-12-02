package com.cucumber.testrunner;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import com.cucumber.baseclass.BaseClass;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\com\\cucumber\\featurefile",
                   glue = {"com.cucumber.stepdefinition"},
                   strict=true,
                   dryRun=false,
                   tags= "@test1"
         )

public class MytripTestrunner extends BaseClass {
	
	public static WebDriver driver;

	@BeforeClass
	public static void beforeclass() throws Exception {
		driver = launchBrowser("chrome");

	}

}
