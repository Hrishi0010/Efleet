package Tyre_Function;

import mistcloud_Base_Class.base_mistclod;

public class tyreStock_allTask extends base_mistclod{
	
	@org.testng.annotations.Test
	public void clickOn_allTask() throws InterruptedException {
//		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		
//		webdriverUtility.mouse_Hover(driver,tyreFunction.getTyre_FunctionButton());
//		webdriverUtility.mouse_Hover(driver, tyreFunction.getTyreFunction_tyreStockButton());
		tyreFunction.getTyre_FunctionButton().click();
		//To click on All task 
		tyreFunction.getTyreFunction_tyreStockButton().click();
		Thread.sleep(3000);
		//to click on drop down button
		tyreStock.getTyreStock_dropdown().click();
		Thread.sleep(3000);
		webdriverUtility.printAllOptions(tyreStock.getTyreStock_dropdown());
		//to select a value from drop down
		webdriverUtility.selectByValue(tyreStock.getTyreStock_dropdown(), "7: 7");
		Thread.sleep(3000);
	}

}
