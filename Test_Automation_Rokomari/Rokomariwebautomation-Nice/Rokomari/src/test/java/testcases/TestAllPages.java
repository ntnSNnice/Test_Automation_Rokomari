package testcases;

import org.testng.annotations.Test;

import pages.RokomariCartPage;
import pages.RokomariHomePage;
import pages.RokomariHumayunAhmedNextPage;
import pages.RokomariHumayunAhmedPage;
import pages.RokomariLoginPage;
import pages.RokomariShippingPage;
import utilities.DriverSetUp;

public class TestAllPages extends DriverSetUp {
	RokomariLoginPage rokomariLoginPage = new RokomariLoginPage();
	RokomariHomePage rokomariHomePage = new RokomariHomePage();
	RokomariHumayunAhmedPage rokomariHumayunAhmedPage = new RokomariHumayunAhmedPage();
	RokomariHumayunAhmedNextPage rokomariHumayunAhmedNextPage = new RokomariHumayunAhmedNextPage();
	RokomariCartPage rokomariCartPage = new RokomariCartPage();
	RokomariShippingPage rokomariShippingPage = new RokomariShippingPage();
	
	@Test
	 public void TestPages() {
		
//		rokomariLoginPage.doLogin("nafishatamanna@gmail.com", "Nice@ntn#");
//		rokomariLoginPage.clickLogin();
		
		rokomariHomePage.clickPopUp();
		rokomariHomePage.clickAuthors();
		rokomariHomePage.clickHumayunAhmed();
		rokomariHumayunAhmedPage.clickPopUpMessage();
		rokomariHumayunAhmedPage.clickCheckBoxes();
		rokomariHumayunAhmedPage.clickNextPage();
		
		rokomariHumayunAhmedNextPage.clickPopUp();
		rokomariHumayunAhmedNextPage.clickBookHover();
		rokomariHumayunAhmedNextPage.clickBook();
		rokomariHumayunAhmedNextPage.clickCartIcon();
		rokomariCartPage.clickPlaceOrder();
		rokomariShippingPage.doLogin("1794553770");
		rokomariShippingPage.sendPin();
		
	}
}
