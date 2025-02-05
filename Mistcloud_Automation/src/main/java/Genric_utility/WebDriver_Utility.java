package Genric_utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class WebDriver_Utility {

	Select select;
//	WebDriver driver;
	File temp, dest;
	Java_Utitlity java_Utility = new Java_Utitlity();
//select by value
	public void select_By_Value(WebElement element, String value) {
		select = new Select(element);
		select.selectByValue(value);
	}
//Screen Shot of entire Web Page
	public void take_Screenshot_Webpage(WebDriver driver) throws IOException {
		TakesScreenshot takeScreenshot =(TakesScreenshot) driver;
		temp= takeScreenshot.getScreenshotAs(OutputType.FILE);
		dest = new File(Mistcloud_constraints.screenshot_folder_Path+java_Utility.local_Date_time());
		FileHandler.copy(temp, dest);
	}
//Screen shot of Webelement
	public void take_Screenshot_Webelement(WebElement element) throws IOException {
		temp = element.getScreenshotAs(OutputType.FILE);
		dest = new File(Mistcloud_constraints.screenshot_folder_Path+java_Utility.local_Date_time());
		FileHandler.copy(temp, dest);
	}
	
//	Mouse Action
	public void mouse_Hover(WebDriver driver, WebElement element) {
		Actions mouse = new Actions(driver);
		mouse.moveToElement(element);
		mouse.perform();
		
	}

}
