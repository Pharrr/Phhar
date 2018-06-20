package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class buyFlightsPage extends BasePage {

	public static WebElement element = null;

	public buyFlightsPage(WebDriver driver) {
		super(driver);

	}

	public static WebElement inp_firstName() {
		try {
			element = driver.findElement(By.name("passFirst0"));
		} catch (Exception e) {
			e.getStackTrace();

		}
		return element;

	}

	public static WebElement inp_lastName() {
		try {
			element = driver.findElement(By.name("passLast0"));
		} catch (Exception e) {
			e.getStackTrace();

		}
		return element;

	}

	public static WebElement slc_region() {
		try {
			element = driver.findElement(By.name("pass.0.meal"));
		} catch (Exception e) {
			e.getStackTrace();

		}
		return element;

	}

	public static WebElement slc_cardType() {
		try {
			element = driver.findElement(By.name("creditCard"));
		} catch (Exception e) {
			e.getStackTrace();

		}
		return element;

	}

	public static WebElement typ_cardNumber() {
		try {
			element = driver.findElement(By.name("creditnumber"));
		} catch (Exception e) {
			e.getStackTrace();

		}
		return element;

	}

	public static WebElement slc_expMonth() {
		try {
			element = driver.findElement(By.name("cc_exp_dt_mn"));
		} catch (Exception e) {
			e.getStackTrace();

		}
		return element;

	}

	public static WebElement slc_expYear() {
		try {
			element = driver.findElement(By.name("cc_exp_dt_yr"));
		} catch (Exception e) {
			e.getStackTrace();

		}
		return element;

	}

	public static WebElement txtIn_FirstName() {
		try {
			element = driver.findElement(By.name("cc_frst_name"));
		} catch (Exception e) {
			e.getStackTrace();

		}
		return element;

	}

	public static WebElement txtIn_MidName() {
		try {
			element = driver.findElement(By.name("cc_mid_name"));
		} catch (Exception e) {
			e.getStackTrace();

		}
		return element;

	}

	public static WebElement txtIn_LastName() {
		try {
			element = driver.findElement(By.name("cc_last_name"));
		} catch (Exception e) {
			e.getStackTrace();

		}
		return element;

	}

	public static WebElement txtIn_Address() {
		try {
			element = driver.findElement(By.name("billAddress1"));
		} catch (Exception e) {
			e.getStackTrace();

		}
		return element;

	}

	// billAddress2
	public static WebElement txtIn_Address2() {
		try {
			element = driver.findElement(By.name("billAddress2"));
		} catch (Exception e) {
			e.getStackTrace();

		}
		return element;

	}

	public static WebElement txtIn_Address3() {
		try {
			element = driver.findElement(By.name("billCity"));
		} catch (Exception e) {
			e.getStackTrace();

		}
		return element;

	}

	// billState
	public static WebElement txtIn_Address4() {
		try {
			element = driver.findElement(By.name("billState"));
		} catch (Exception e) {
			e.getStackTrace();

		}
		return element;

	}

	public static WebElement txtIn_ZipCode() {
		try {
			element = driver.findElement(By.name("billZip"));
		} catch (Exception e) {
			e.getStackTrace();

		}
		return element;

	}

	public static WebElement slc_CountryName() {
		try {
			element = driver.findElement(By.name("billCountry"));
		} catch (Exception e) {
			e.getStackTrace();

		}
		return element;

	}

	// ticketLess
	public static WebElement clk_TktLess() {
		try {
			element = driver.findElement(By.name("ticketLess"));
		} catch (Exception e) {
			e.getStackTrace();

		}
		return element;

	}

	// buyFlights
	public static WebElement clk_Next() {
		try {
			element = driver.findElement(By.name("buyFlights"));
		} catch (Exception e) {
			e.getStackTrace();

		}
		return element;

	}

	public static void InputNames(WebElement element, String name) {
		element.sendKeys(name);

	}

}
