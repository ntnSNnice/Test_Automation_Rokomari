package testcases;

import org.testng.annotations.Test;

import io.qameta.allure.Description;
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
	
	@Test (description = "TestPages")
	@Description("TestPages from Allure")
	
	 public void TestPages() throws InterruptedException {
		
		rokomariHomePage.clickHomePage();
		rokomariLoginPage.doLogin("nafishatamanna@gmail.com", "Nice@ntn#");
		rokomariLoginPage.clickLogin();
		rokomariLoginPage.takeScreenShot("Login Successfully");
		rokomariHomePage.clickAuthors();
		rokomariHomePage.clickHumayunAhmed();
		rokomariCartPage.takeScreenShot("Click Humayun Ahmed Page");
		rokomariHumayunAhmedPage.clickFirstCheckBox();
		rokomariHumayunAhmedPage.clickThirdCheckBox();
		rokomariHumayunAhmedPage.clickNextPage();
		rokomariHumayunAhmedNextPage.clickBookHover();
		rokomariHumayunAhmedNextPage.clickBook();
		rokomariHumayunAhmedNextPage.clickCartIcon();
		rokomariCartPage.clickPlaceOrder();
		rokomariCartPage.takeScreenShot("Click Place Order");
		rokomariShippingPage.fillupallInfo();
		rokomariShippingPage.takeScreenShot("Fill Up All Information");
		

	}
}
