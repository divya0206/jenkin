
package com.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.base.JVMReport;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources",glue ="com\\stepdefinition",monochrome=true,dryRun= false,
plugin = {"pretty","json:src\\test\\resources\\Reporting\\cucumber.json","rerun:src\\test\\java\\failedscenarios.txt"
		},snippets = SnippetType.CAMELCASE,strict = true)
public class TestRunnerClass {
	
	@AfterClass
	public static void afterClass() {
		
		JVMReport.generateJVMReport("C:\\Users\\HP\\eclipse-workspace\\CucumberTask\\src\\test\\resources\\Reporting\\cucumber.json");
	}
	
	

}
 