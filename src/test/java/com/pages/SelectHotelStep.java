package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.LibGlobal;

public class SelectHotelStep extends LibGlobal {
	public SelectHotelStep() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id="radiobutton_0")
	private WebElement btnclick;
	
	@FindBy(id="continue")
	private WebElement btncontinue;

	public WebElement getBtnclick() {
		return btnclick;
	}

	public WebElement getBtncontinue() {
		return btncontinue;
	}
	
	
	public void selectHotel() {
		
		btnclick(getBtnclick());
		btnclick(getBtncontinue());
		
	}

}
