package POM_Mistcloud;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class tyreFunction_New_New_Retread_POM {

	public tyreFunction_New_New_Retread_POM(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[contains(text(),'Add New/New Retread')]")
	private WebElement addNew_NewRetread_button;

	@FindBy(xpath = "//input[@name='officeName']")
	private WebElement enter_officeName;

	@FindBy(xpath = "//input[@name='vendorName']")
	private WebElement enter_vendorName;

	@FindBy(xpath = "//input[@name='vendorOfficeName']")
	private WebElement enter_vendorOfficeName;

	@FindBy(xpath = "//input[@id='DocumentTypeId']")
	private WebElement checkbox_challanCumInvoice;

	@FindBy(xpath = "//input[@name='challanNumber']")
	private WebElement enter_challanNumber;

	@FindBy(xpath = "//input[@name='remark']")
	private WebElement enter_Remark;

	@FindBy(xpath = "//input[@name='NoOfTyres']")
	private WebElement enter_numberOfTyres;

	@FindBy(xpath = "//input[@name='isPpu']")
	private WebElement checkbox_isPPU;

	@FindBy(xpath = "//input[@value='Save']")
	private WebElement saveButton;

	@FindBy(xpath = "//input[@id='tyre_autofocus']")
	private WebElement enter_tyreNumber;

	@FindBy(xpath = "//input[@name='brandName']")
	private WebElement enter_brandName;

	@FindBy(xpath = "//input[@name='rubberBrandName']")
	private WebElement enter_rubberBrandName;

	@FindBy(xpath = "//input[@name='productionMonth']")
	private WebElement enter_productionMonth;

	@FindBy(xpath = "//input[@name='productCardNumber']")
	private WebElement enter_cardNumber;

	@FindBy(xpath = "//input[@name='productAmount']")
	private WebElement enter_Amount;

	@FindBy(xpath = "//input[@name='discountPercentage']")
	private WebElement enter_discountPercentage;

	@FindBy(xpath = "//input[@name='remarks']")
	private WebElement enter_remarks;

	@FindBy(xpath = "//input[@value='Add']")
	private WebElement clickOnAdd_button;

	public WebElement getAddNew_NewRetread_button() {
		return addNew_NewRetread_button;
	}

	public WebElement getEnter_officeName() {
		return enter_officeName;
	}

	public WebElement getEnter_vendorName() {
		return enter_vendorName;
	}

	public WebElement getEnter_vendorOfficeName() {
		return enter_vendorOfficeName;
	}

	public WebElement getCheckbox_challanCumInvoice() {
		return checkbox_challanCumInvoice;
	}

	public WebElement getEnter_challanNumber() {
		return enter_challanNumber;
	}

	public WebElement getEnter_Remark() {
		return enter_Remark;
	}

	public WebElement getEnter_numberOfTyres() {
		return enter_numberOfTyres;
	}

	public WebElement getCheckbox_isPPU() {
		return checkbox_isPPU;
	}

	public WebElement getSaveButton() {
		return saveButton;
	}

	public WebElement getEnter_tyreNumber() {
		return enter_tyreNumber;
	}

	public WebElement getEnter_brandName() {
		return enter_brandName;
	}

	public WebElement getEnter_rubberBrandName() {
		return enter_rubberBrandName;
	}

	public WebElement getEnter_productionMonth() {
		return enter_productionMonth;
	}

	public WebElement getEnter_cardNumber() {
		return enter_cardNumber;
	}

	public WebElement getEnter_Amount() {
		return enter_Amount;
	}

	public WebElement getEnter_discountPercentage() {
		return enter_discountPercentage;
	}

	public WebElement getEnter_remarks() {
		return enter_remarks;
	}

	public WebElement getClickOnAdd_button() {
		return clickOnAdd_button;
	}

}
