package pages;

import org.openqa.selenium.By;

public class RokomariCartPage extends Basepage {
	
	public String CART_PAGE_URL = "https://www.rokomari.com/cart";
	public By PLACE_ORDER_BUTTON = By.xpath("//span[normalize-space()='Place Order']");
	
	
	public void clickPlaceOrder() {	
        clickOnElement(PLACE_ORDER_BUTTON);		
}

}
