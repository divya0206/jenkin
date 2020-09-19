package com.base;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JVMReport {
	public static void generateJVMReport(String jsonFile)	{	
		
		File loc = new File("C:\\Users\\HP\\eclipse-workspace\\CucumberTask\\src\\test\\resources\\Reporting");
		
		Configuration con = new Configuration(loc, "adactin automation");
		con.addClassifications("sprint", "20");
		con.addClassifications("Browser", "chrome");
		con.addClassifications("Env", "UAT");
		con.addClassifications("OS", "WIN-10");
		
		List<String> json = new ArrayList<String>();
		json.add(jsonFile);
		
		ReportBuilder builder = new ReportBuilder(json, con);
		builder.generateReports();
		
	}

}
