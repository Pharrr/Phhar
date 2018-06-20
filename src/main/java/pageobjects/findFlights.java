package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import helper.Log;

public class findFlights extends BasePage {

	public static WebElement element = null;

	public findFlights(WebDriver driver) {
		super(driver);

	}

	public static WebElement slc_btn() {
		try {
			element = driver.findElement(By.name("tripType"));
		} catch (Exception e) {
			e.getStackTrace();

		}
		return element;

	}

	public static WebElement slc_Pass() {
		try {
			element = driver.findElement(By.name("passCount"));
		} catch (Exception e) {
			e.getStackTrace();

		}
		return element;

	}
	// fromPort

	public static WebElement slc_fromports() {
		try {
			element = driver.findElement(By.name("fromPort"));
		} catch (Exception e) {
			e.getStackTrace();

		}
		return element;

	}

	public static WebElement slc_month() {
		try {
			element = driver.findElement(By.name("fromMonth"));
		} catch (Exception e) {
			e.getStackTrace();

		}
		return element;

	}
	// fromDay

	public static WebElement slc_day() {
		try {
			element = driver.findElement(By.name("fromDay"));
		} catch (Exception e) {
			e.getStackTrace();

		}
		return element;

	}

	public static WebElement slc_arrivingto() {
		try {
			element = driver.findElement(By.name("toPort"));
		} catch (Exception e) {
			e.getStackTrace();

		}
		return element;

	}

	public static WebElement slc_returningmonth() {
		try {
			element = driver.findElement(By.name("toMonth"));
		} catch (Exception e) {
			e.getStackTrace();

		}
		return element;

	}

	public static WebElement slc_returningday() {
		try {
			element = driver.findElement(By.name("toDay"));
		} catch (Exception e) {
			e.getStackTrace();

		}
		return element;

	}

	// servClass
	public static WebElement slc_servercls() {
		try {
			element = driver.findElement(By.name("servClass"));
		} catch (Exception e) {
			e.getStackTrace();

		}
		return element;

	}

	// airline
	public static WebElement slc_airlines() {
		try {
			element = driver.findElement(By.name("airline"));
		} catch (Exception e) {
			e.getStackTrace();

		}
		return element;

	}

	// findFlights
	public static WebElement btn_findFlights() {
		try {
			element = driver.findElement(By.name("findFlights"));
		} catch (Exception e) {
			e.getStackTrace();

		}
		return element;

	}

	public static void SelectItem(WebElement element, int index) {
		Select slc = new Select(element);
		slc.selectByIndex(index);

	}

	public static void JustdoClick(WebElement element) {
		element.click();
	}
}
