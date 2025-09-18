package TestScripts;

import org.testng.annotations.Test;

import mistcloud_Base_Class.base_mistclod;

public class tyre_Support_Master extends base_mistclod{
	
	@Test
	public void tyreSupportMaster_Mousehover() {
		webdriverUtility.mouse_Hover(driver, tyreSupportMaster.getTyreBrands());
	}
}
