package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ReserveFlights extends BasePage {

	public static WebElement element = null;

	public ReserveFlights(WebDriver driver) {
		super(driver);

	}

	public static WebElement btn_resevering() {
		try {
			element = driver.findElement(By.name("reserveFlights"));

		} catch (Exception e) {

			e.getStackTrace();
		}

		return element;

	}

}
