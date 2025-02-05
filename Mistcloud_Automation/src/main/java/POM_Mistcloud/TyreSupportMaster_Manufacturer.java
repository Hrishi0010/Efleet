package POM_Mistcloud;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TyreSupportMaster_Manufacturer {

	public TyreSupportMaster_Manufacturer(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@id='Searchtext']")
	private WebElement manufacturer_searchTextField;

	@FindBy(xpath = "//button[contains(@class,'btn')]")
	private WebElement manufacturer_searchButton;

//	eye button
	@FindBy(xpath = "//i[contains(@class,'fa fa-eye action-btn')]")
	private WebElement manufacturer_eyeButon;

//	click on back to index button
	@FindBy(xpath = "//span[contains(text(),'Back To Index')]")
	private WebElement manufacturer_backToIndex;

	public WebElement getManufacturer_searchTextField() {
		return manufacturer_searchTextField;
	}

	public WebElement getManufacturer_searchButton() {
		return manufacturer_searchButton;
	}

	public WebElement getManufacturer_eyeButon() {
		return manufacturer_eyeButon;
	}

	public WebElement getManufacturer_backToIndex() {
		return manufacturer_backToIndex;
	}

}
