package com.mm.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(

		features = "Features",
		glue = "com.mm.stepdef",
		tags = "@feelinglucky"

)

public class SmokeTestRunner extends AbstractTestNGCucumberTests{

}
