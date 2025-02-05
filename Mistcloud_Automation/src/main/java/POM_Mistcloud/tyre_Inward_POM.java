package POM_Mistcloud;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class tyre_Inward_POM {

	public tyre_Inward_POM(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//span[contains(text(),'Tyre Inward')])[3]")
	private WebElement tyre_Inward;

	@FindBy(xpath = "(//span[contains(text(),'New /New-Retread GRN')])[2]")
	private WebElement tyreInward_NewRetread_GRN;

	@FindBy(xpath = "(//span[contains(text(),'Chassis Tyre GRN')])[2]")
	private WebElement tyreInward_chassisTyre_GRN;

	@FindBy(xpath = "(//span[contains(text(),'Retread Tyre GRN')])[2]")
	private WebElement tyreInward_retreadTyre_GRN;

	@FindBy(xpath = "(//span[contains(text(),'Against Claim')])[2]")
	private WebElement tyreInward_againstClaim_GRN;

	@FindBy(xpath = "(//span[contains(text(),'Old Tyre Inward')])[2]")
	private WebElement tyreInward_oldTyreInward_GRN;

	public WebElement getTyre_Inward() {
		return tyre_Inward;
	}

	public WebElement getTyreInward_NewRetread_GRN() {
		return tyreInward_NewRetread_GRN;
	}

	public WebElement getTyreInward_chassisTyre_GRN() {
		return tyreInward_chassisTyre_GRN;
	}

	public WebElement getTyreInward_retreadTyre_GRN() {
		return tyreInward_retreadTyre_GRN;
	}

	public WebElement getTyreInward_againstClaim_GRN() {
		return tyreInward_againstClaim_GRN;
	}

	public WebElement getTyreInward_oldTyreInward_GRN() {
		return tyreInward_oldTyreInward_GRN;
	}

}
