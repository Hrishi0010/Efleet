package Tyre_Function;

import java.time.Duration;

import org.junit.Test;
import org.openqa.selenium.support.ui.WebDriverWait;

import POM_Mistcloud.tyreFunction_TyreStock_POM;
import mistcloud_Base_Class.base_mistclod;

public class tyreStock_allTask extends base_mistclod{
	
	@SuppressWarnings("unused")
	@org.testng.annotations.Test
	public void clickOn_allTask() throws InterruptedException {
//		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		
//		webdriverUtility.mouse_Hover(driver,tyreFunction.getTyre_FunctionButton());
//		webdriverUtility.mouse_Hover(driver, tyreFunction.getTyreFunction_tyreStockButton());
		tyreFunction.getTyre_FunctionButton().click();
		tyreFunction.getTyreFunction_tyreStockButton().click();
	}

}
