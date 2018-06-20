package stepDefinition;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Then;
import pageobjects.LoginPage;
import pageobjects.ReserveFlights;

public class reservingFlightsSteps {
	static WebDriver driver;

	@Then("^click next button$")
	public void click_next_button() throws Throwable {

		LoginPage.Continue(ReserveFlights.btn_resevering());
	}

}
