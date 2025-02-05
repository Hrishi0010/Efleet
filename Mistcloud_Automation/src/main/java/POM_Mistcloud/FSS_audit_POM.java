package POM_Mistcloud;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FSS_audit_POM {

	public FSS_audit_POM(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//span[contains(text(),'FSS')])[3]")
	private WebElement FSS_Audit;

	@FindBy(xpath = "(//span[contains(text(),'FSS Audit Report')])[2]")
	private WebElement FSSaudit_fssAuditReport;

	public WebElement getFSS_Audit() {
		return FSS_Audit;
	}

	public WebElement getFSSaudit_fssAuditReport() {
		return FSSaudit_fssAuditReport;
	}

}
