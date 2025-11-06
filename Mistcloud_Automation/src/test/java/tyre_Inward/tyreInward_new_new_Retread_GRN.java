package tyre_Inward;

import java.io.IOException;

import org.testng.annotations.Test;

import mistcloud_Base_Class.base_mistclod;

public class tyreInward_new_new_Retread_GRN extends base_mistclod {

	@Test
	public void new_Retread_GRN() throws InterruptedException, IOException {
		webdriverUtility.mouse_Hover(driver, tyreInward.getTyre_Inward());
		webdriverUtility.mouse_Hover(driver, tyreInward.getTyreInward_NewRetread_GRN());
		// click on New/New Retread GRN
		tyreInward.getTyreInward_NewRetread_GRN().click();
		Thread.sleep(3000);

		// add New/New Retread FRN
		new_NewRetread.getAddNew_NewRetread_button().click();
		Thread.sleep(3000);
		new_NewRetread.getEnter_officeName().sendKeys(file_Utility.propertyFile("retread_officeName"));
		Thread.sleep(3000);
		new_NewRetread.getEnter_vendorName().sendKeys(file_Utility.propertyFile(""));
		new_NewRetread.getEnter_vendorOfficeName().sendKeys(file_Utility.propertyFile(""));
		new_NewRetread.getEnter_challanNumber().sendKeys(file_Utility.propertyFile("challanNumber"));
		new_NewRetread.getEnter_numberOfTyres().sendKeys(file_Utility.propertyFile("numberOfTyre"));
	}

}
