package POM_Mistcloud;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class stock_Transfer_POM {

	public stock_Transfer_POM(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//span[contains(text(),'Stock Transfer')])[4]")
	private WebElement stock_Transfer;

	@FindBy(xpath = "(//span[contains(text(),'Stock Transfer (O')])[2]")
	private WebElement stockTransfer_stockTransferOUT;

	@FindBy(xpath = "(//span[contains(text(),'Stock Transfer (I')])[2]")
	private WebElement stockTransfer_stockTransferIN;

	public WebElement getStock_Transfer() {
		return stock_Transfer;
	}

	public WebElement getStockTransfer_stockTransferOUT() {
		return stockTransfer_stockTransferOUT;
	}

	public WebElement getStockTransfer_stockTransferIN() {
		return stockTransfer_stockTransferIN;
	}

}
