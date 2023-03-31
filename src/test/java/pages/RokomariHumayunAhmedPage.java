package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RokomariHumayunAhmedPage extends Basepage {
	
	public By CHECKBOX_1 = By.xpath("//label[contains(text(),'সমকালীন উপন্যাস')]");
	public By CHECKBOX_2 = By.xpath("//label[contains(text(),'রচনা সংকলন ও সমগ্র')]");
	public By POP_UP_MESSAGE = By.xpath("//span[@aria-hidden='true']");
	public By NEXT_BUTTON = By.xpath("//a[normalize-space()='Next']");
	

	public void clickFirstCheckBox() throws InterruptedException {
	    WebElement checkbox = getElement(CHECKBOX_1);
	    JavascriptExecutor js= (JavascriptExecutor)getdriver();
	    js.executeScript("arguments[0].scrollIntoView()", checkbox);
	    WebDriverWait wait = new WebDriverWait(getdriver(), Duration.ofSeconds(50));
	    wait.until(ExpectedConditions.elementToBeClickable(CHECKBOX_1));
	    js.executeScript("arguments[0].click();", checkbox);
	    Thread.sleep(2000);
	}

	public void clickThirdCheckBox() throws InterruptedException {
	    WebElement checkbox = getElement(CHECKBOX_2);
	    JavascriptExecutor js= (JavascriptExecutor)getdriver();
	    js.executeScript("arguments[0].scrollIntoView()", checkbox);
	    WebDriverWait wait = new WebDriverWait(getdriver(), Duration.ofSeconds(50));
	    wait.until(ExpectedConditions.elementToBeClickable(CHECKBOX_2));
	    js.executeScript("arguments[0].click();", checkbox);
	    Thread.sleep(2000);
	}

	public void clickNextPage() throws InterruptedException {
		
		WebElement nextPage = getElement(NEXT_BUTTON);
		JavascriptExecutor js= (JavascriptExecutor)getdriver();
		js.executeScript("arguments[0].scrollIntoView()", nextPage);
		WebDriverWait wait= new WebDriverWait(getdriver(), Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(NEXT_BUTTON));
		Thread.sleep(2000);
		nextPage.click();
	}	
}
