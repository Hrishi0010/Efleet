package POM_Mistcloud;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TyreSupportMaster_TyreBrands {

	public TyreSupportMaster_TyreBrands(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[@id='Searchtext']")
	private WebElement tyreBrand_searchTextField;

	@FindBy(xpath = "//button[contains(@class,'btn')]")
	private WebElement tyreBrand_searchButton;

//	eye button
	@FindBy(xpath = "//i[contains(@class,'fa fa-eye action-btn')]")
	private WebElement tyreBrand_eyeButon;

//	click on back to index button
	@FindBy(xpath = "//span[contains(text(),'Back To Index')]")
	private WebElement tyreBrand_backToIndex;

	public WebElement getTyreBrand_searchTextField() {
		return tyreBrand_searchTextField;
	}

	public WebElement getTyreBrand_searchButton() {
		return tyreBrand_searchButton;
	}

	public WebElement getTyreBrand_eyeButon() {
		return tyreBrand_eyeButon;
	}

	public WebElement getTyreBrand_backToIndex() {
		return tyreBrand_backToIndex;
	}

}
