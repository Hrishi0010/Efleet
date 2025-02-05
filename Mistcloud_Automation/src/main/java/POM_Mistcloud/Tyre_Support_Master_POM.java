package POM_Mistcloud;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Tyre_Support_Master_POM {

	public Tyre_Support_Master_POM(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//span[contains(text(), 'Tyre Support')])[2]")
	private WebElement tyreSupportMaster;

	// manufacturer button
	@FindBy(xpath = "(//span[contains(text(), 'Manufacturer' )])[2]")
	private WebElement manufacturer;

//	Tyre Brands button
	@FindBy(xpath = "(//span[contains(text(), ' Tyre Brands ' )])[2]")
	private WebElement tyreBrands;

//Product Log Button	
	@FindBy(xpath = "(//span[contains(text(), ' Product Log ' )])[2]")
	private WebElement productLog;

	public WebElement getTyreSupportMaster() {
		return tyreSupportMaster;
	}

	public WebElement getManufacturer() {
		return manufacturer;
	}

	public WebElement getTyreBrands() {
		return tyreBrands;
	}

	public WebElement getProductLog() {
		return productLog;
	}

}
