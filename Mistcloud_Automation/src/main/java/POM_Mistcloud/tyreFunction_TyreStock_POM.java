package POM_Mistcloud;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class tyreFunction_TyreStock_POM {

	public tyreFunction_TyreStock_POM(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//select[contains(@id,'typeId')]")
	private WebElement tyreStock_dropdown;

	@FindBy(xpath = "(//select[contains(@id,'typeId')])[2]")
	private WebElement tyreStock_Action_dropdown;

	@FindBy(xpath = "//option[contains(text(),' Get All Status ')]")
	private WebElement tyreStock_GetAll_Status;

	@FindBy(xpath = "//option[contains(text(),'New')]")
	private WebElement tyreStock_New;

	@FindBy(xpath = "//option[contains(text(),'On Vehicle')]")
	private WebElement tyreStock_OnVehicle;

	@FindBy(xpath = "//option[contains(text(),'Off Vehicle')]")
	private WebElement tyreStock_OffVehicle;

	@FindBy(xpath = "//option[contains(text(),'Sent for Retread/Refurbish')]")
	private WebElement tyreStock_SentForRetread;

	@FindBy(xpath = "//option[contains(text(),'Sent for Claim')]")
	private WebElement tyreStock_SentForClaim;

	@FindBy(xpath = "//option[contains(text(),'Retread/Refurbish Received')]")
	private WebElement tyreStock_Retread_Received;

	@FindBy(xpath = "//option[contains(text(),'Claim Received')]")
	private WebElement tyreStock_ClaimReceived;

	@FindBy(xpath = "//option[contains(text(),'Retread/Refurbish Reject')]")
	private WebElement tyreStock_Retread_Reject;

	@FindBy(xpath = "//option[contains(text(),'Claim Reject')]")
	private WebElement tyreStock_RetreadReject;

	@FindBy(xpath = "//option[contains(text(),'Scrapped')]")
	private WebElement tyreStock_Scrapped;

	@FindBy(xpath = "//option[contains(text(),'Missing')]")
	private WebElement tyreStock_Missing;

	@FindBy(xpath = "//option[contains(text(),'Resale')]")
	private WebElement tyreStock_Resale;

	@FindBy(xpath = "//option[contains(text(),'Claim Settled')]")
	private WebElement tyreStock_ClaimSettled;

	@FindBy(xpath = "//option[contains(text(),'Sent to CFA')]")
	private WebElement tyreStock_SentTo_CFA;

	@FindBy(xpath = "//option[contains(text(),'Old Inward')]")
	private WebElement tyreStock_OldInward;

	@FindBy(xpath = "//option[contains(text(),'Stock Out (Transit)')]")
	private WebElement tyreStock_StockOut;

	@FindBy(xpath = "//option[contains(text(),'Transit Inward')]")
	private WebElement tyreStock_TransitInward;

	@FindBy(xpath = "//option[contains(text(),'Issue/Receive')]")
	private WebElement tyreStock_ActionIssueReceive;

	@FindBy(xpath = "//option[contains(text(),'Send to Claim')]")
	private WebElement tyreStock_Action_SendToClaim;

	@FindBy(xpath = "//option[contains(text(),'Send to Retread')]")
	private WebElement tyreStock_Action_SendToRetread;

	@FindBy(xpath = "//option[contains(text(),'Resale to Buyer')]")
	private WebElement tyreStock_Action_ResaleToBuyer;

	@FindBy(xpath = "(//option[contains(text(),'Scrap')])[2]")
	private WebElement tyreStock_Action_Scrap;

	@FindBy(xpath = "(//option[contains(text(),'Retread Tyre')])")
	private WebElement tyreStock_Action_RetreadTyre;

	@FindBy(xpath = "(//option[contains(text(),'Tyre against Claim')])")
	private WebElement tyreStock_Action_TyreAgainst_claim;

	@FindBy(xpath = "(//option[contains(text(),'Claim Credit Note')])")
	private WebElement tyreStock_Action_ClaimCreditNote;

	@FindBy(xpath = "(//option[contains(text(),'Vehicle')])[3]")
	private WebElement tyreStock_selectType_Vehicle;

	@FindBy(xpath = "(//option[contains(text(),'Tyre')])[2]")
	private WebElement tyreStock_selectType_Tyre;

	@FindBy(xpath = "(//input[contains(@id,'typeahead-basic')])")
	private WebElement tyreStock_SearchField;

	@FindBy(xpath = "(//button[contains(text(),'Process')])")
	private WebElement tyreStock_ProcessButton;

	public WebElement getTyreStock_dropdown() {
		return tyreStock_dropdown;
	}

	public WebElement getTyreStock_Action_dropdown() {
		return tyreStock_Action_dropdown;
	}

	public WebElement getTyreStock_GetAll_Status() {
		return tyreStock_GetAll_Status;
	}

	public WebElement getTyreStock_New() {
		return tyreStock_New;
	}

	public WebElement getTyreStock_OnVehicle() {
		return tyreStock_OnVehicle;
	}

	public WebElement getTyreStock_OffVehicle() {
		return tyreStock_OffVehicle;
	}

	public WebElement getTyreStock_SentForRetread() {
		return tyreStock_SentForRetread;
	}

	public WebElement getTyreStock_SentForClaim() {
		return tyreStock_SentForClaim;
	}

	public WebElement getTyreStock_Retread_Received() {
		return tyreStock_Retread_Received;
	}

	public WebElement getTyreStock_ClaimReceived() {
		return tyreStock_ClaimReceived;
	}

	public WebElement getTyreStock_Retread_Reject() {
		return tyreStock_Retread_Reject;
	}

	public WebElement getTyreStock_RetreadReject() {
		return tyreStock_RetreadReject;
	}

	public WebElement getTyreStock_Scrapped() {
		return tyreStock_Scrapped;
	}

	public WebElement getTyreStock_Missing() {
		return tyreStock_Missing;
	}

	public WebElement getTyreStock_Resale() {
		return tyreStock_Resale;
	}

	public WebElement getTyreStock_ClaimSettled() {
		return tyreStock_ClaimSettled;
	}

	public WebElement getTyreStock_SentTo_CFA() {
		return tyreStock_SentTo_CFA;
	}

	public WebElement getTyreStock_OldInward() {
		return tyreStock_OldInward;
	}

	public WebElement getTyreStock_StockOut() {
		return tyreStock_StockOut;
	}

	public WebElement getTyreStock_TransitInward() {
		return tyreStock_TransitInward;
	}

	public WebElement getTyreStock_ActionIssueReceive() {
		return tyreStock_ActionIssueReceive;
	}

	public WebElement getTyreStock_Action_SendToClaim() {
		return tyreStock_Action_SendToClaim;
	}

	public WebElement getTyreStock_Action_SendToRetread() {
		return tyreStock_Action_SendToRetread;
	}

	public WebElement getTyreStock_Action_ResaleToBuyer() {
		return tyreStock_Action_ResaleToBuyer;
	}

	public WebElement getTyreStock_Action_Scrap() {
		return tyreStock_Action_Scrap;
	}

	public WebElement getTyreStock_Action_RetreadTyre() {
		return tyreStock_Action_RetreadTyre;
	}

	public WebElement getTyreStock_Action_TyreAgainst_claim() {
		return tyreStock_Action_TyreAgainst_claim;
	}

	public WebElement getTyreStock_Action_ClaimCreditNote() {
		return tyreStock_Action_ClaimCreditNote;
	}

	public WebElement getTyreStock_selectType_Vehicle() {
		return tyreStock_selectType_Vehicle;
	}

	public WebElement getTyreStock_selectType_Tyre() {
		return tyreStock_selectType_Tyre;
	}

	public WebElement getTyreStock_SearchField() {
		return tyreStock_SearchField;
	}

	public WebElement getTyreStock_ProcessButton() {
		return tyreStock_ProcessButton;
	}

}
