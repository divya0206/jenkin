package com.manager;

import com.base.LibGlobal;
import com.pages.BookHotelStep;
import com.pages.LoginPageStep;
import com.pages.SearchHotelStep;
import com.pages.SelectHotelStep;

public class PageObjectManager extends LibGlobal {

	private static PageObjectManager pageObjectManager;
	private LoginPageStep loginPageStep;
	private SearchHotelStep searchHotelStep;
	private SelectHotelStep selectHotelStep;
	private BookHotelStep bookHotelStep;
	

	private PageObjectManager() {

	}

	public static PageObjectManager getInstance() {
		return (pageObjectManager == null) ? pageObjectManager = new PageObjectManager() : pageObjectManager;

	}

	public LoginPageStep getLoginPageStep() {
		System.out.println(loginPageStep);
		return (loginPageStep == null) ? loginPageStep = new LoginPageStep() : loginPageStep;
	}

	public SearchHotelStep getSearchHotelStep() {
		return (searchHotelStep == null) ? searchHotelStep = new SearchHotelStep() : searchHotelStep;
	}

	public SelectHotelStep getSelectHotelStep() {
		return (selectHotelStep == null) ? selectHotelStep = new SelectHotelStep() : selectHotelStep;
	}

	public BookHotelStep getBookHotelStep() {
		return (bookHotelStep == null) ? bookHotelStep = new BookHotelStep() : bookHotelStep;
	}

	
	

}
