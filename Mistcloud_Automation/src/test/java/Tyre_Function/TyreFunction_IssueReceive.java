package Tyre_Function;

import java.time.Duration;

import org.openqa.selenium.support.ui.WebDriverWait;

import mistcloud_Base_Class.base_mistclod;

public class TyreFunction_IssueReceive extends base_mistclod{
	
	public void tyreFunction_Issue() throws InterruptedException {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		// Wait until visible
//		WebElement menu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//span[contains(text(), ' Tyre Brands ' )])[2]")));
//click on Product Log
		webdriverUtility.mouse_Hover(driver, tyreSupportMaster.getTyreSupportMaster());
		webdriverUtility.mouse_Hover(driver, tyreSupportMaster.getProductLog());
		tyreSupportMaster.getProductLog().click();
		Thread.sleep(3000);
		
	}

}
