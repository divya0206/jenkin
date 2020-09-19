package com.pages;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.LibGlobal;

public class SearchHotelStep extends LibGlobal{
	
	public SearchHotelStep() {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(id="location")
	private WebElement txtLoc;
	
	@FindBy(id = "hotels")
	private WebElement txtHot;

	@FindBy(id = "room_type")
	private WebElement btnRoom;

	@FindBy(id = "room_nos")
	private WebElement btnNum;

	@FindBy(id = "adult_room")
	private WebElement btnAdult;

	@FindBy(id = "child_room")
	private WebElement btnChild;

	@FindBy(id = "Submit")
	private WebElement Submit;

	public WebElement getTxtLoc() {
		return txtLoc;
	}

	public WebElement getTxtHot() {
		return txtHot;
	}

	public WebElement getBtnRoom() {
		return btnRoom;
	}

	public WebElement getBtnNum() {
		return btnNum;
	}

	public WebElement getBtnAdult() {
		return btnAdult;
	}

	public WebElement getBtnChild() {
		return btnChild;
	}

	public WebElement getSubmit() {
		return Submit;
	}
	
	public void searchHotel(String location, String hotel, String roomtype, io.cucumber.datatable.DataTable dataTable) {
		
		selectvalue(getTxtLoc(), location);
		selectvalue(getTxtHot(), hotel);
		selvisible(getBtnRoom(), roomtype);
		List<Map<String,String>> l = dataTable.asMaps();
		Map<String, String> m = l.get(1);
		String noroom = m.get("Roomno");
		String adult = m.get("adultroom");
		String child = m.get("childroom");
		selvisible(getBtnNum(), noroom);
		selvisible(getBtnAdult(), adult);
		selvisible(getBtnChild(), child);
		btnclick(getSubmit());
		
	}

	
	

}
