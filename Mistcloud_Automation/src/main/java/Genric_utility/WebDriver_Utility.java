package Genric_utility;

import java.io.File;
import java.io.IOException;
import java.util.List;

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

	
	// Select by visible text
    public static void selectByText(WebElement element, String text) {
        Select select = new Select(element);
        select.selectByVisibleText(text);
    }

    // Select by value attribute
    public static void selectByValue(WebElement element, String value) {
        Select select = new Select(element);
        select.selectByValue(value);
    }

    // Select by index
    public static void selectByIndex(WebElement element, int index) {
        Select select = new Select(element);
        select.selectByIndex(index);
    }

    // Get all dropdown options
    public void printAllOptions(WebElement element) {
        Select select = new Select(element);
        List<WebElement> options = select.getOptions();
        for (WebElement option : options) {
            System.out.println(option.getText());
        }
    }

    // Get selected option text
    public static String getSelectedOption(WebElement element) {
        Select select = new Select(element);
        return select.getFirstSelectedOption().getText();
    }

    // Select multiple values (for multi-select dropdowns)
    public static void selectMultipleByText(WebElement element, String... texts) {
        Select select = new Select(element);
        if (select.isMultiple()) {
            for (String text : texts) {
                select.selectByVisibleText(text);
            }
        } else {
            System.out.println("Dropdown is not multi-select!");
        }
    }

    // Deselect all (only for multi-select)
    public static void deselectAll(WebElement element) {
        Select select = new Select(element);
        if (select.isMultiple()) {
            select.deselectAll();
        }
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
		mouse.moveToElement(element).perform();
		
		
	}
	
	
	

}
