package action;

import helper.Amazon;
import pageobjects.AmazonTestPage;

public class AmazonAction {

	public static void Execute() throws Exception {

		AmazonTestPage.Hold();
		AmazonTestPage.Maxsize();
		AmazonTestPage.typStuffs(AmazonTestPage.typ_things(), "Amazon");

		AmazonTestPage.clk_btn().click();

	}

}
// typ_things
// clk_btn
//
//
//
//
//
//
//
