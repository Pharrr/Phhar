package stepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepsForSendGmail {

	static WebDriver driver;

	@Given("^openbrowser$")
	public void openbrowser() throws Throwable {

		String driverPath = "C:/Program Files/Selenium/chromedriver.exe";
		String url = "http://www.gmail.com";
		System.setProperty("webdriver.chrome.driver", driverPath);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

	}

	@When("^presssignin$")
	public void presssignin() throws Throwable {
		driver.findElement(By.cssSelector("body > nav > div > a.gmail-nav__nav-link.gmail-nav__nav-link__sign-in"))
				.click();
	}

	@Then("^insertUserName$")
	public void insertusername() throws Throwable {
		driver.findElement(By.cssSelector("#identifierId")).sendKeys("parhatpahrzat@gmail.com");
	}

	@Then("^clicknext$")
	public void clicknext() throws Throwable {
		driver.findElement(By.cssSelector("#identifierNext > content > span")).click();
	}

	@Then("^insertPassWord$")
	public void insertpassword() throws Throwable {
		driver.findElement(By.cssSelector("#password > div.aCsJod.oJeWuf > div > div.Xb9hP > input"))
				.sendKeys("pahrzat008?");
		driver.findElement(By.cssSelector("#passwordNext")).click();
		driver.close();
		driver.quit();
	}

}
