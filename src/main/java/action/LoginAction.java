package action;

import helper.Credentials;
import helper.Log;
import pageobjects.LoginPage;

public class LoginAction {

	public static void Execute() throws Exception {
		LoginPage.startAPP();
		Log.info("Started");
		LoginPage.Wait();
		LoginPage.txt_userName().sendKeys(Credentials.username);
		Log.info("userName Inserted");
		LoginPage.txt_password().sendKeys(Credentials.password);
		Log.info("passWord Inserted");
		LoginPage.captureScreenShot();
		LoginPage.btn_login().click();
		Log.info("clicked");
		LoginPage.Maxsize();

	}
}
