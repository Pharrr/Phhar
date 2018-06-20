package stepDefinition;

import org.openqa.selenium.WebDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import helper.Log;
import pageobjects.LoginPage;
import pageobjects.findFlights;

public class FlightFinder {
	static WebDriver driver;

	@Given("^click types$")
	public void click_types() throws Throwable {

		findFlights.JustdoClick(findFlights.slc_Pass());

	}

	@When("^select passengers$")
	public void select_passengers() throws Throwable {
		findFlights.SelectItem(findFlights.slc_Pass(), 0);

	}

	@When("^select departingform$")
	public void select_departingform() throws Throwable {
		findFlights.SelectItem(findFlights.slc_fromports(), 2);

	}

	@Then("^select month and date$")
	public void select_month_and_date() throws Throwable {
		findFlights.SelectItem(findFlights.slc_month(), 7);

		findFlights.SelectItem(findFlights.slc_day(), 9);

	}

	@Then("^select Arriving in$")
	public void select_Arriving_in() throws Throwable {
		findFlights.SelectItem(findFlights.slc_arrivingto(), 4);

	}

	@Then("^select Returning$")
	public void select_Returning() throws Throwable {
		findFlights.SelectItem(findFlights.slc_returningmonth(), 8);

		findFlights.SelectItem(findFlights.slc_day(), 18);

	}

	@Then("^click Service Class$")
	public void click_Service_Class() throws Throwable {
		findFlights.slc_servercls().click();

	}

	@Then("^select Airline$")
	public void select_Airline() throws Throwable {
		findFlights.SelectItem(findFlights.slc_airlines(), 2);

	}

	@Then("^click and go to next page$")
	public void click_and_go_to_next_page() throws Throwable {
		LoginPage.Continue(findFlights.btn_findFlights());

	}

}
