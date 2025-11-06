package POM_Mistcloud;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TyreSupportMaster_ProductLog {

	public TyreSupportMaster_ProductLog(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@id='typeahead-basic']")
	private WebElement productLog_searchTextField;

	@FindBy(xpath = "//button[contains(text(),' Search ')]")
	private WebElement productLog_searchButton;

	@FindBy(xpath = "//a[contains(@class,'btn btn-p')]")
	private WebElement productLog_inspectionHistoryButton;

	@FindBy(xpath = "//button[contains(text(),'Export Details ')]")
	private WebElement productLog_exportDetailsButton;

	@FindBy(xpath = "//span[contains(text(),'Back To Index')]")
	private WebElement productLog_backToIndex;

	@FindBy(xpath = "//i[contains(@class,'fa-tr')]")
	private WebElement productLog_deleteButton;
	
	@FindBy(xpath = "//button[contains(@class,'close')]")
	private WebElement productLog_crossButton;

	public WebElement getProductLog_crossButton() {
		return productLog_crossButton;
	}

	public WebElement getProductLog_searchTextField() {
		return productLog_searchTextField;
	}

	public WebElement getProductLog_searchButton() {
		return productLog_searchButton;
	}

	public WebElement getProductLog_inspectionHistoryButton() {
		return productLog_inspectionHistoryButton;
	}

	public WebElement getProductLog_exportDetailsButton() {
		return productLog_exportDetailsButton;
	}

	public WebElement getProductLog_backToIndex() {
		return productLog_backToIndex;
	}

	public WebElement getProductLog_deleteButton() {
		return productLog_deleteButton;
	}

}
