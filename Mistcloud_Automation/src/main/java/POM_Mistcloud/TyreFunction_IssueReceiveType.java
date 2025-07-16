package POM_Mistcloud;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TyreFunction_IssueReceiveType {

	public TyreFunction_IssueReceiveType(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[contains(@id,'limitFromDate')]")
	private WebElement tyreIssueRecieve_FromDate;

	@FindBy(xpath = "//input[contains(@id,'limitToDate')]")
	private WebElement tyreIssueRecieve_ToDate;

	@FindBy(xpath = "//input[contains(@type,'submit')]")
	private WebElement tyreIssueRecieve_SearchButton;

	@FindBy(xpath = "//a[contains(text(),'Add New')]")
	private WebElement tyreIssueRecieve_AddNewButton;

	@FindBy(xpath = "(//input[contains(@id,'typeahead-basic')])[1]")
	private WebElement tyreIssueRecieve_VehicleNumber;

	@FindBy(xpath = "(//input[contains(@name,'VehicleReading')])[1]")
	private WebElement tyreIssueRecieve_VehicleMeterReading;

	@FindBy(xpath = "(//input[contains(@id,'typeahead-basic')])[3]")
	private WebElement tyreIssueRecieve_tyreRecieveNumber;

	@FindBy(xpath = "(//input[contains(@id,'typeahead-basic')])[4]")
	private WebElement tyreIssueRecieve_tyreIssueNumber;

	@FindBy(xpath = "(//select[contains(@id,'position')])")
	private WebElement tyreIssueRecieve_WheelPosition_dropdown;

	@FindBy(xpath = "(//input[contains(@type,'submit')])")
	private WebElement tyreIssueRecieve_saveButton;

	public WebElement getTyreIssueRecieve_FromDate() {
		return tyreIssueRecieve_FromDate;
	}

	public WebElement getTyreIssueRecieve_ToDate() {
		return tyreIssueRecieve_ToDate;
	}

	public WebElement getTyreIssueRecieve_SearchButton() {
		return tyreIssueRecieve_SearchButton;
	}

	public WebElement getTyreIssueRecieve_AddNewButton() {
		return tyreIssueRecieve_AddNewButton;
	}

	public WebElement getTyreIssueRecieve_VehicleNumber() {
		return tyreIssueRecieve_VehicleNumber;
	}

	public WebElement getTyreIssueRecieve_VehicleMeterReading() {
		return tyreIssueRecieve_VehicleMeterReading;
	}

	public WebElement getTyreIssueRecieve_tyreRecieveNumber() {
		return tyreIssueRecieve_tyreRecieveNumber;
	}

	public WebElement getTyreIssueRecieve_tyreIssueNumber() {
		return tyreIssueRecieve_tyreIssueNumber;
	}

	public WebElement getTyreIssueRecieve_WheelPosition_dropdown() {
		return tyreIssueRecieve_WheelPosition_dropdown;
	}

	public WebElement getTyreIssueRecieve_saveButton() {
		return tyreIssueRecieve_saveButton;
	}

}
