package POM_Mistcloud;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class tyreFunction_New_New_Retread_POM {
	
	
	public tyreFunction_New_New_Retread_POM(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}

	@FindBy(xpath = "//a[contains(text(),'Add New/New Retread')]")
	private WebElement addNew_NewRetread_button;
	
	@FindBy(xpath = "//input[@name='officeName']")
	private WebElement enter_officeName;
	
	@FindBy(xpath = "//input[@name='vendorName']")
	private WebElement enter_vendorName;
	
	
}
