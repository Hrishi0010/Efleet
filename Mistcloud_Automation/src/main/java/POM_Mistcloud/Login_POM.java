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

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}

}
