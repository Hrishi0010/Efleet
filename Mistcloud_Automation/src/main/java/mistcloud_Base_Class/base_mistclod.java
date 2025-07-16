package mistcloud_Base_Class;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import Genric_utility.Mistcloud_File_Utility;
import Genric_utility.WebDriver_Utility;
import POM_Mistcloud.Login_POM;
import POM_Mistcloud.Tyre_Support_Master_POM;

public class base_mistclod {

	public WebDriver driver;
	public static WebDriver listernerDriver;
	public Mistcloud_File_Utility file_Utility = new Mistcloud_File_Utility();
	public WebDriver_Utility webdriverUtility = new WebDriver_Utility();
	public Login_POM mistcloud_Login;
	public Tyre_Support_Master_POM tyreSupportMaster;

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("before suite");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("before Test");
	}

	@BeforeClass
	public void beforeClass() throws IOException, InterruptedException {
		String url = file_Utility.propertyFile("url");
		String browser = file_Utility.propertyFile("browser");
		if (browser.equals("chrome")) {
			driver = new ChromeDriver();
		} else if (browser.equals("firefox")) {
			driver = new FirefoxDriver();
		} else {
			System.out.println("please enter valid browser name:");
		}
		listernerDriver = driver;
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get(url);

//		mistcloud_Login = new Login_POM(driver);
	}

	@BeforeMethod
	public void beforeMethod() throws IOException, InterruptedException {
		System.out.println("before Method:");

		mistcloud_Login = new Login_POM(driver);
		mistcloud_Login.getUsername().sendKeys(file_Utility.propertyFile("username"));
		mistcloud_Login.getPassword().sendKeys(file_Utility.propertyFile("password"));
		mistcloud_Login.getLoginButton().click();
	}

	@AfterMethod
	public void AfterMethod() {
		System.out.println("After Method :");
	}

	@AfterClass
	public void AfterClass() throws InterruptedException {
		driver.quit();
	}

	@AfterTest
	public void AfterTest() {
		System.out.println("After Test");
	}

	@AfterSuite
	public void AfterSuite() {
		System.out.println("After Suit :");
	}
}
