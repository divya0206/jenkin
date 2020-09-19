package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.LibGlobal;

public class LoginPageStep extends LibGlobal {
	
	public LoginPageStep() {

		PageFactory.initElements(driver, this);

	}

	@FindBy(id="username")
	private WebElement txtUsername;

	@FindBy(id = "password")
	private WebElement txtPassword;

	@FindBy(name = "login")
	private WebElement btnLogin;

	public WebElement getTxtUsername() {
		return txtUsername;
	}

	public WebElement getTxtPassword() {
		return txtPassword;
	}

	public WebElement getBtnLogin() {
		return btnLogin;
	}
	
	public void login(String username,String password) {
		
		type(getTxtUsername(), username);
		type(getTxtPassword(), password);
		btnclick(getBtnLogin());
		

	}
	

}
