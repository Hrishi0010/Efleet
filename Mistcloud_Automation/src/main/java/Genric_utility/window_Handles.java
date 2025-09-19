package Genric_utility;

import java.util.Set;

import org.openqa.selenium.WebDriver;

public class window_Handles {
	
	public void windowHandles(WebDriver driver) {
		Set<String> windows = driver.getWindowHandles();
		for (String childWindow : windows) {
			driver.switchTo().window(childWindow);
		}
	}

}
