package pageobjects;

import org.openqa.selenium.WebDriver;

public abstract class AmazonBasePage {
	
	static WebDriver driver;

	public AmazonBasePage(WebDriver driver) {
		AmazonBasePage.driver = driver;

	}

}
