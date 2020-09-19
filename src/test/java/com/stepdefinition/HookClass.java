package com.stepdefinition;

import java.net.MalformedURLException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.base.LibGlobal;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class HookClass extends LibGlobal{
	
	WebDriver driver;
	
	@Before
	public void beforeScenario() throws MalformedURLException {
		
		driver=getDriverCloud();
		loadUrl("http://adactin.com/HotelApp/");
	}
	
	@After
	public void afterScenario(Scenario sc) {
		
		TakesScreenshot tk =(TakesScreenshot)driver;
		byte[] b = tk.getScreenshotAs(OutputType.BYTES);
		sc.embed(b, "img/png");
		
	}
	
	
	

}
