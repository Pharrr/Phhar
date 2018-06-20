package stepDefinition;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageobjects.buyFlightsPage;
import pageobjects.findFlights;

public class BuyFlightSteps {

	static WebDriver driver;
      
	@Given("^put Names and slc Meal$")
	public void put_Names_and_slc_Meal() throws Throwable {
		buyFlightsPage.InputNames(buyFlightsPage.inp_firstName(), "Mike");
		
		buyFlightsPage.InputNames(buyFlightsPage.inp_lastName(), "Josh");

		findFlights.SelectItem(buyFlightsPage.slc_region(), 8);
	
	}

	@When("^CreditCard info$")
	public void creditcard_info() throws Throwable {
		findFlights.SelectItem(buyFlightsPage.slc_cardType(), 2);

		buyFlightsPage.InputNames(buyFlightsPage.typ_cardNumber(), "123456789");

		findFlights.SelectItem(buyFlightsPage.slc_expMonth(), 7);
	
		findFlights.SelectItem(buyFlightsPage.slc_expYear(), 11);
		
		buyFlightsPage.InputNames(buyFlightsPage.txtIn_FirstName(), "Mike");
		
		buyFlightsPage.InputNames(buyFlightsPage.txtIn_MidName(), "");
		
		buyFlightsPage.InputNames(buyFlightsPage.txtIn_LastName(), "Josh");
		
	}

	@Then("^Billing Address$")
	public void billing_Address() throws Throwable {
		buyFlightsPage.InputNames(buyFlightsPage.txtIn_Address(), "ABCDEFGH");

		buyFlightsPage.InputNames(buyFlightsPage.txtIn_Address2(), "HAHHAHAHAHA");
	
		buyFlightsPage.InputNames(buyFlightsPage.txtIn_Address3(), "TOOEZZZZZ");
	
		buyFlightsPage.InputNames(buyFlightsPage.txtIn_Address4(), "MKLDSAMLKMD");
	
		buyFlightsPage.InputNames(buyFlightsPage.txtIn_ZipCode(), "120003");
		
		findFlights.SelectItem(buyFlightsPage.slc_CountryName(), 8);
		
	}

	@Then("^Delivery Address$")
	public void delivery_Address() throws Throwable {
		buyFlightsPage.clk_TktLess().click();
		
	}

	@Then("^Click Next$")
	public void click_Next() throws Throwable {
		buyFlightsPage.clk_Next().click();
	
	}

}