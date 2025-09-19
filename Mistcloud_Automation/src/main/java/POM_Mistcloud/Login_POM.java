package POM_Mistcloud;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_POM {

//	public WebDriver driver;
		
	public Login_POM(WebDriver driver) {
		PageFactory.initElements(driver, this);
//		this.driver=driver;

	}

		@FindBy(xpath = "//input[@id='userName']")
	private WebElement username;

	@FindBy(xpath = "//input[@id='password']")
	private WebElement password;

	@FindBy(xpath = "//input[@value='Log in']")
	private WebElement loginButton;

	@FindBy(xpath = "//input[contains(@id,'subscriberListRadio')]")
	private WebElement SelectSubscriberRadioButton;
	
	@FindBy(xpath = "//input[contains(@id,'Searchtext')]")
	private WebElement searchSubscriberText;
	
	@FindBy(xpath = "//button[contains(@class,'btn btn-warning t')]")
	private WebElement searchSubscriberButton;
	
	@FindBy(xpath = "//button[contains(text(),'Submit')]")
	private WebElement subscriberSubmit_button;
	
	
	
	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}

	public WebElement getSelectSubscriberRadioButton() {
		return SelectSubscriberRadioButton;
	}

	public WebElement getSearchSubscriberText() {
		return searchSubscriberText;
	}

	public WebElement getSearchSubscriberButton() {
		return searchSubscriberButton;
	}

	public WebElement getSubscriberSubmit_button() {
		return subscriberSubmit_button;
	}
	
	
}
