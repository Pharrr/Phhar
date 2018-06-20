package stepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class autoSteps {

	static WebDriver driver;

	@Given("^OpenBrowser$")
	public void openbrowser() throws Throwable {
		String driverPath = "C:/Program Files/Selenium/chromedriver.exe";
		String url = "http://automationpractice.com/index.php?";
		System.setProperty("webdriver.chrome.driver", driverPath);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

	}

	@When("^Signin$")
	public void signin() throws Throwable {
		driver.findElement(By.cssSelector("#header > div.nav > div > div > nav > div.header_user_info > a")).click();
	}

	@When("^InsertUserNanme$")
	public void insertusernanme() throws Throwable {
		driver.findElement(By.cssSelector("#email")).sendKeys("656912624@qq.com");
	}

	@Then("^InsetPassWord$")
	public void insetpassword() throws Throwable {
		driver.findElement(By.cssSelector("#passwd")).sendKeys("pahrzat008?");
	}

	@Then("^ClickLogin$")
	public void clicklogin() throws Throwable {
		driver.findElement(By.cssSelector("#SubmitLogin > span")).click();
	}

}
