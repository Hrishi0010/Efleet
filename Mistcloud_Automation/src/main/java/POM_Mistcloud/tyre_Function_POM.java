package POM_Mistcloud;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class tyre_Function_POM {

	public tyre_Function_POM(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//span[contains(text(),' Tyre Function ')])[2]")
	private WebElement tyre_FunctionButton;

	@FindBy(xpath = "(//span[contains(text(),' Tyre Stock ')])[2]")
	private WebElement tyreFunction_tyreStockButton;

	@FindBy(xpath = "(//span[contains(text(),' Issue / Receive Tyre ')])[2]")
	private WebElement tyreFunction_issueReceiveButton;

	@FindBy(xpath = "(//span[contains(text(),' All Inward/Outward ')])[2]")
	private WebElement tyreFunction_allInward_OutwardButton;

	@FindBy(xpath = "(//span[contains(text(),' Tyre Inspection ')])[2]")
	private WebElement tyreFunction_tyreInspectionButton;

	@FindBy(xpath = "(//span[contains(text(),' Excel ')])[2]")
	private WebElement tyreFunction_excelUploadButton;

	public WebElement getTyre_FunctionButton() {
		return tyre_FunctionButton;
	}

	public WebElement getTyreFunction_tyreStockButton() {
		return tyreFunction_tyreStockButton;
	}

	public WebElement getTyreFunction_issueReceiveButton() {
		return tyreFunction_issueReceiveButton;
	}

	public WebElement getTyreFunction_allInward_OutwardButton() {
		return tyreFunction_allInward_OutwardButton;
	}

	public WebElement getTyreFunction_tyreInspectionButton() {
		return tyreFunction_tyreInspectionButton;
	}

	public WebElement getTyreFunction_excelUploadButton() {
		return tyreFunction_excelUploadButton;
	}

}
