package tyre_Inward;

import org.testng.annotations.Test;

import mistcloud_Base_Class.base_mistclod;

public class tyreInward_new_new_Retread_GRN extends base_mistclod{
	
	@Test
	public void new_Retread_GRN() {
		webdriverUtility.mouse_Hover(driver, tyreInward.getTyre_Inward());
		webdriverUtility.mouse_Hover(driver, tyreInward.getTyreInward_NewRetread_GRN());
		tyreInward.getTyreInward_NewRetread_GRN().click();
	}

}
