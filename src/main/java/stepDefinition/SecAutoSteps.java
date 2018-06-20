package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class SecAutoSteps {
	static WebDriver driver;

	@Given("^PressTshirt$")
	public void presstshirt() throws Throwable {
		driver.findElement(By.xpath("//ul[contains(@class,'sf-menu clearfix menu-content sf-js-enabled sf-arrows')][text()='T-SHIRTS']")).click();
	}

	@When("^SelectSize$")
	public void selectsize() throws Throwable {
		driver.findElement(By.cssSelector("#layered_id_attribute_group_2")).click();
	}

	@When("^Select Color$")
	public void select_Color() throws Throwable {
		driver.findElement(By.cssSelector("#layered_id_attribute_group_14")).click();
	}

}
// Xpath= "//a[contains(text(),'T-shirts')]"
