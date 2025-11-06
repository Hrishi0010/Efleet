package TestScripts.Tyre_Support_Master;

import java.io.IOException;
import java.time.Duration;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.WebDriverWait;

import mistcloud_Base_Class.base_mistclod;

public class tyreSupport_productLog extends base_mistclod{
	
	@SuppressWarnings("unused")


	@org.testng.annotations.Test
	public void tyreSupport_ProductLog() throws InterruptedException, IOException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		// Wait until visible
//		WebElement menu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//span[contains(text(), ' Tyre Brands ' )])[2]")));
//click on Product Log
		webdriverUtility.mouse_Hover(driver, tyreSupportMaster.getTyreSupportMaster());
		webdriverUtility.mouse_Hover(driver, tyreSupportMaster.getProductLog());
		tyreSupportMaster.getProductLog().click();
		Thread.sleep(3000);
		
//Enter Tyre Number and Click on search		
		productLog.getProductLog_searchTextField().sendKeys(file_Utility.propertyFile("tyreNumber"));
		productLog.getProductLog_searchTextField().sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		productLog.getProductLog_searchButton().click();
		Thread.sleep(3000);
		
//Click on Export Button
		productLog.getProductLog_exportDetailsButton().click();
		Thread.sleep(3000);
		
//Click on Inspection History Button
		productLog.getProductLog_inspectionHistoryButton().click();
		Thread.sleep(2000);
		productLog.getProductLog_crossButton().click();
		Thread.sleep(2000);
		
//Click on Back to Index
		productLog.getProductLog_backToIndex().click();
		Thread.sleep(2000);
		
	}

}
