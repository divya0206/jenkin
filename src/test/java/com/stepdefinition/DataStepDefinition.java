package com.stepdefinition;

import org.openqa.selenium.WebDriver;

import com.base.LibGlobal;
import com.manager.PageObjectManager;
import com.pages.BookHotelStep;
import com.pages.LoginPageStep;
import com.pages.SearchHotelStep;
import com.pages.SelectHotelStep;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class DataStepDefinition extends LibGlobal {

	WebDriver driver;
	PageObjectManager pageObjectManager;
	LoginPageStep loginPageStep;
	SearchHotelStep searchHotelStep;
	SelectHotelStep selectHotelStep;
	BookHotelStep bookHotelStep;
	

	@Given("user is on the adactin page")
	public void user_is_on_the_adactin_page() {
		

		}

	@When("user should login using {string} and {string}")
	public void user_should_login_using_and(String username, String password) {
		pageObjectManager = PageObjectManager.getInstance();
		loginPageStep = pageObjectManager.getLoginPageStep();
		loginPageStep.login(username, password);

	}

	@Then("user should verify the login page")
	public void user_should_verify_the_login_page() {

		System.out.println("user is matched");
	}

	@Then("user should search using {string},{string},{string}")
	public void user_should_search_using(String location, String hotel, String roomtype,
			io.cucumber.datatable.DataTable dataTable) {

		pageObjectManager = PageObjectManager.getInstance();
		searchHotelStep = pageObjectManager.getSearchHotelStep();
		searchHotelStep.searchHotel(location, hotel, roomtype, dataTable);

	}

	@Then("user should verify the search hotel page")
	public void user_should_verify_the_search_hotel_page() {

		System.out.println("search hotel is verified");

	}

	@Then("user should select the first hotel")
	public void user_should_select_the_first_hotel() {

		pageObjectManager = PageObjectManager.getInstance();
		selectHotelStep = pageObjectManager.getSelectHotelStep();
		selectHotelStep.selectHotel();

	}

	@Then("user should book hotel using {string},{string},{string},{string}")
	public void user_should_book_hotel_using(String firstname, String lastname, String address, String cardno,
			io.cucumber.datatable.DataTable dataTable) {
		pageObjectManager = PageObjectManager.getInstance();
		bookHotelStep = pageObjectManager.getBookHotelStep();
		bookHotelStep.BookHotel(firstname, lastname, address, cardno, dataTable);

	}

	@Then("user should verify the book hotel page")
	public void user_should_verify_the_book_hotel_page() {
		
		System.out.println("booking verified");

	}

	@Then("user can check the booking confirmation order in the page")
	public void user_can_check_the_booking_confirmation_order_in_the_page() {
		
		

	}

	@Then("user can cancel the booked hotel")
	public void user_can_cancel_the_booked_hotel() {
		
		System.out.println("cancel page");

	}

}
