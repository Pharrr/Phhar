package testRunner;

import action.BuyFlightsActions;
import action.FlightFindPageAction;
import action.LoginAction;
import action.ReseverAction;

public class Runner {
	public static void main(String[] args) throws Exception {
	LoginAction.Execute();
		FlightFindPageAction.Execute();
		ReseverAction.Execute();
		BuyFlightsActions.Execute();

		
		
	}
}
