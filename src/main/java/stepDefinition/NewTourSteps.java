package stepDefinition;

import org.openqa.selenium.WebDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import helper.Credentials;
import pageobjects.LoginPage;

public class NewTourSteps {
	static WebDriver driver;

	@Given("^Open WebSite$")
	public void open_WebSite() throws Throwable {
		LoginPage.startAPP();
		LoginPage.Wait();
		LoginPage.Maxsize();
	}

	@When("^Put my UserName$")
	public void put_my_UserName() throws Throwable {
		LoginPage.txt_userName().sendKeys(Credentials.username);
	}

	@Then("^Put my PassWord$")
	public void put_my_PassWord() throws Throwable {
		LoginPage.txt_password().sendKeys(Credentials.password);
	}

	@Then("^click login button$")
	public void click_login_button() throws Throwable {
		LoginPage.btn_login().click();
	}
}
