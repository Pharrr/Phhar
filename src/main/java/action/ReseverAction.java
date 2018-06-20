package action;

import helper.Log;
import pageobjects.LoginPage;
import pageobjects.ReserveFlights;

public class ReseverAction {
	
	
	public static void Execute() throws Exception{
		LoginPage.Wait();
		LoginPage.Continue(ReserveFlights.btn_resevering());
		Log.info("Passed");
		
	}

}
