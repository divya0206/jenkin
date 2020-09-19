package com.pages;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.LibGlobal;

public class BookHotelStep extends LibGlobal {
	
	public BookHotelStep() {

		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "first_name")
	private WebElement btnFirstName;

	@FindBy(id = "last_name")
	private WebElement btnLastName;

	@FindBy(id = "address")
	private WebElement btnAdd;

	@FindBy(id = "cc_num")
	private WebElement btncard;

	
	@FindBy(id="cc_type")
	private WebElement btnccType;

	@FindBy(id="cc_exp_month")
	private WebElement btnMon;

	@FindBy(id="cc_exp_year")
	private WebElement btnYear;
	
	
	@FindBy(id="cc_cvv")
	private WebElement btnCvv;

	@FindBy(id="book_now")
	private WebElement btnBook;

	public WebElement getBtnFirstName() {
		return btnFirstName;
	}

	public WebElement getBtnLastName() {
		return btnLastName;
	}

	public WebElement getBtnAdd() {
		return btnAdd;
	}

	public WebElement getBtncard() {
		return btncard;
	}

	public WebElement getBtnccType() {
		return btnccType;
	}

	public WebElement getBtnMon() {
		return btnMon;
	}

	public WebElement getBtnYear() {
		return btnYear;
	}

	public WebElement getBtnCvv() {
		return btnCvv;
	}

	public WebElement getBtnBook() {
		return btnBook;
	}
	
	public void BookHotel(String firstname, String lastname, String address, String cardno, io.cucumber.datatable.DataTable dataTable) {
		
		type(getBtnFirstName(), firstname);
		type(getBtnLastName(), lastname);
		type(getBtnAdd(), address);
		type(getBtncard(), cardno);
		List<Map<String,String>> li = dataTable.asMaps();
		Map<String, String> map = li.get(1);
		String cardtype = map.get("cardtype");
		String month = map.get("month");
		String year = map.get("year");
		String cvv = map.get("cvv");
		selectvalue(getBtnccType(), cardtype);
		selvisible(getBtnMon(), month);
		selvisible(getBtnYear(), year);
		type(getBtnCvv(), cvv);
		btnclick(getBtnBook());
		
	}

}
