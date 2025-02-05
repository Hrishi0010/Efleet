package POM_Mistcloud;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class tyre_Outward_POM {

	public tyre_Outward_POM(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//span[contains(text(),'Send to Retread')])[2]")
	private WebElement tyreOutward_sendToRetread;

	@FindBy(xpath = "(//span[contains(text(),'Send to Claim')])[2]")
	private WebElement tyreOutward_sendToClaim;

	@FindBy(xpath = "(//span[contains(text(),'Resale ')])[2]")
	private WebElement tyreOutward_resaleToBuyer;

	@FindBy(xpath = "(//span[contains(text(),'Theft')])[2]")
	private WebElement tyreOutward_theft;

	@FindBy(xpath = "(//span[contains(text(),'Scrap')])[2]")
	private WebElement tyreOutward_scrap;

	@FindBy(xpath = "(//span[contains(text(),'Claim Credit')])[2]")
	private WebElement tyreOutward_claimCreditNote;

	public WebElement getTyreOutward_sendToRetread() {
		return tyreOutward_sendToRetread;
	}

	public WebElement getTyreOutward_sendToClaim() {
		return tyreOutward_sendToClaim;
	}

	public WebElement getTyreOutward_resaleToBuyer() {
		return tyreOutward_resaleToBuyer;
	}

	public WebElement getTyreOutward_theft() {
		return tyreOutward_theft;
	}

	public WebElement getTyreOutward_scrap() {
		return tyreOutward_scrap;
	}

	public WebElement getTyreOutward_claimCreditNote() {
		return tyreOutward_claimCreditNote;
	}

}
