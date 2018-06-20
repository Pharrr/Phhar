package pageobjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import helper.Amazon;
import helper.Credentials;

public class AmazonTestPage extends AmazonBasePage {
	static WebElement element = null;

	public AmazonTestPage(WebDriver driver) {
		super(driver);

	}

	public static WebElement typ_things() {
		try {
			element = driver.findElement(By.name("lst-ib"));
		} catch (Exception e) {
			e.getStackTrace();
		}
		return element;
	}

	public static WebElement clk_btn() {
		try {
			element = driver.findElement(By.name("btnK"));
		} catch (Exception e) {
			e.getStackTrace();
		}
		return element;
	}

	public static void openWeb() {
		String driverPath = Amazon.chromeDriverPath;
		String opq = Amazon.opq;
		System.setProperty("webdriver.chrome.driver", driverPath);
		driver = new ChromeDriver();
		driver.get(opq);

	}

	public static void Hold() {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

	}

	public static void Maxsize() {
		driver.manage().window().maximize();
	}



	public static void typStuffs(WebElement element, String type) {
		element.sendKeys(type);

	}
}
