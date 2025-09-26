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

import Genric_utility.Java_Utitlity;
import Genric_utility.Mistcloud_File_Utility;
import Genric_utility.WebDriver_Utility;
import Genric_utility.window_Handles;
import POM_Mistcloud.Login_POM;
import POM_Mistcloud.Tyre_Support_Master_POM;
import POM_Mistcloud.tyreFunction_New_New_Retread_POM;
import POM_Mistcloud.tyreFunction_TyreStock_POM;
import POM_Mistcloud.tyre_Function_POM;
import POM_Mistcloud.tyre_Inward_POM;

public class base_mistclod {

	public WebDriver driver;
	public static WebDriver listernerDriver;
	public Java_Utitlity java_utility = new Java_Utitlity();
	public Mistcloud_File_Utility file_Utility = new Mistcloud_File_Utility();
	public WebDriver_Utility webdriverUtility = new WebDriver_Utility();
	public Login_POM mistcloud_Login;
//	public Tyre_Support_Master_POM tyreSupportMaster = new Tyre_Support_Master_POM(driver);
	public Tyre_Support_Master_POM tyreSupportMaster;
	public window_Handles windowHandles = new window_Handles();
	public tyreFunction_TyreStock_POM tyreStock ;
	public tyre_Function_POM tyreFunction;
	public tyre_Inward_POM tyreInward;
	public tyreFunction_New_New_Retread_POM new_NewRetread;
	

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("=== Test Suite Started ===");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("--- Starting Tests ---");
	}

	@BeforeClass
	public void SetUp() throws IOException, InterruptedException {
	
		String browser = file_Utility.propertyFile("browser");
		String url = file_Utility.propertyFile("url");
		if (browser.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		} else {
			System.out.println("please enter valid browser name:");
			throw new IllegalArgumentException("Unsupported Browser" +browser);
		}
		listernerDriver = driver;
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get(url);

		mistcloud_Login = new Login_POM(driver);
		tyreSupportMaster = new Tyre_Support_Master_POM(driver);
		tyreFunction = new tyre_Function_POM(driver);
		tyreInward = new tyre_Inward_POM(driver);
		tyreStock = new tyreFunction_TyreStock_POM(driver);
		new_NewRetread = new tyreFunction_New_New_Retread_POM(driver);
		 
	}

	@BeforeMethod
	public void login() throws IOException, InterruptedException {
		System.out.println("Logging in...");

//		mistcloud_Login = new Login_POM(driver);
		mistcloud_Login.getUsername().sendKeys(file_Utility.propertyFile("username"));
		mistcloud_Login.getPassword().sendKeys(file_Utility.propertyFile("password"));
		mistcloud_Login.getLoginButton().click();
		
		windowHandles.windowHandles(driver);
		mistcloud_Login.getSearchSubscriberText().sendKeys(file_Utility.propertyFile("Fleet"));
		mistcloud_Login.getSearchSubscriberButton().click();
		Thread.sleep(3000);
		mistcloud_Login.getSelectSubscriberRadioButton().click();
		mistcloud_Login.getSubscriberSubmit_button().click();
		
		Thread.sleep(10000);
	}

	@AfterMethod
	public void AfterMethod() {
		System.out.println("Test completed......");
	}

	@AfterClass
	public void tearDown() throws InterruptedException {
		if (driver != null) {
            driver.quit();
            System.out.println("Browser closed....");
        }
	}

	@AfterTest
	public void AfterTest() {
		System.out.println("--- Tests Finished ---");
	}

	@AfterSuite
	public void AfterSuite() {
		System.out.println("=== Test Suite Finished ===");
	}
}
