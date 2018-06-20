package action;

import helper.Credentials;
import helper.Log;
import pageobjects.LoginPage;
import pageobjects.buyFlightsPage;
import pageobjects.findFlights;

public class BuyFlightsActions {
	public static void Execute() throws Exception {

		LoginPage.Wait();
		buyFlightsPage.InputNames(buyFlightsPage.inp_firstName(), "Mike");
		
		Log.info("Passed");
		buyFlightsPage.InputNames(buyFlightsPage.inp_lastName(), "Josh");
		Log.info("Passed");
		findFlights.SelectItem(buyFlightsPage.slc_region(), 8);
		Log.info("Passed");
		findFlights.SelectItem(buyFlightsPage.slc_cardType(), 2);
		Log.info("Passed");
		buyFlightsPage.InputNames(buyFlightsPage.typ_cardNumber(), "123456789");
		Log.info("Passed");
		findFlights.SelectItem(buyFlightsPage.slc_expMonth(), 7);
		Log.info("Passed");
		findFlights.SelectItem(buyFlightsPage.slc_expYear(), 11);
		Log.info("Passed");
		buyFlightsPage.InputNames(buyFlightsPage.txtIn_FirstName(), "Mike");
		Log.info("Passed");
		buyFlightsPage.InputNames(buyFlightsPage.txtIn_MidName(), "");
		Log.info("Passed");
		buyFlightsPage.InputNames(buyFlightsPage.txtIn_LastName(), "Josh");
		Log.info("Passed");
		buyFlightsPage.InputNames(buyFlightsPage.txtIn_Address(), "ABCDEFGH");
		Log.info("Passed");
		buyFlightsPage.InputNames(buyFlightsPage.txtIn_Address2(), "HAHHAHAHAHA");	
		Log.info("Passed");
	    buyFlightsPage.InputNames(buyFlightsPage.txtIn_Address3(), "TOOEZZZZZ");
	    Log.info("Passed");
	    buyFlightsPage.InputNames(buyFlightsPage.txtIn_Address4(), "MKLDSAMLKMD");
	    Log.info("Passed");
	    buyFlightsPage.InputNames(buyFlightsPage.txtIn_ZipCode(), "120003");
	    Log.info("Passed");
	    findFlights.SelectItem(buyFlightsPage.slc_CountryName(), 8);
	    Log.info("Passed");
	    buyFlightsPage.clk_TktLess().click();
	    Log.info("Passed");
	    buyFlightsPage.clk_Next().click();
	    Log.info("Passed");
	    
	
	}

}
//inp_firstName
//inp_lastName
//slc_region
//slc_cardType
//typ_cardNumber
//slc_expMonth
//slc_expYear
//txtIn_FirstName
//txtIn_MidName
//txtIn_LastName
//txtIn_Address
//txtIn_Address2
//txtIn_Address3
//txtIn_Address4
//txtIn_ZipCode
//slc_CountryName
//clk_TktLess
//clk_Next
