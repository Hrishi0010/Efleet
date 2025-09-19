package TestScripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import mistcloud_Base_Class.base_mistclod;

public class tyre_Support_Master extends base_mistclod{
	
	@Test
	public void tyreSupportMaster_Mousehover() throws InterruptedException {
		@SuppressWarnings("unused")
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		// Wait until visible
//		WebElement menu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//span[contains(text(), ' Tyre Brands ' )])[2]")));
		webdriverUtility.mouse_Hover(driver, tyreSupportMaster.getTyreSupportMaster());
		webdriverUtility.mouse_Hover(driver, tyreSupportMaster.getTyreBrands());
		tyreSupportMaster.getTyreBrands().click();
		
		Thread.sleep(3000);
	}
}
