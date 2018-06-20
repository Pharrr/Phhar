package action;

import helper.Log;
import pageobjects.LoginPage;
import pageobjects.buyFlightsPage;
import pageobjects.findFlights;

public class FlightFindPageAction {
	public static void Execute() throws Exception {
	  
		LoginPage.Wait();
		
		findFlights.JustdoClick(findFlights.slc_Pass());//having problem
		Log.info("Passed");
		findFlights.SelectItem(findFlights.slc_Pass(),0);
		Log.info("Passed");
		findFlights.SelectItem(findFlights.slc_fromports(), 2);
		Log.info("Passed");
		findFlights.SelectItem(findFlights.slc_month(), 7);
		Log.info("Passed");
		findFlights.SelectItem(findFlights.slc_day(), 9);
		Log.info("Passed");
		findFlights.SelectItem(findFlights.slc_arrivingto(), 4);
		Log.info("Passed");
		findFlights.SelectItem(findFlights.slc_returningmonth(), 8);
		Log.info("Passed");
		findFlights.SelectItem(findFlights.slc_day(), 18);
		Log.info("Passed");
		findFlights.slc_servercls().click();// also this one having problem
		Log.info("Passed");
		findFlights.SelectItem(findFlights.slc_airlines(), 2);
		Log.info("Passed");
		LoginPage.Continue(findFlights.btn_findFlights());
		Log.info("Passed");
		
	
	}
}
//slc_Pass
//slc_fromports
//slc_month
//slc_day
//slc_arrivingto
//slc_returningmonth
//slc_returningday
//slc_servercls
//slc_airlines
//btn_findFlights
//

