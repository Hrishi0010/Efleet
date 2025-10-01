package Genric_utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class datePicker_util {

	public void selectDate(WebDriver driver, String expYear , String expMonth , String expDay) {
		while(true) {
		String year = driver.findElement(By.xpath("//div[contains(@class,'bs-datepicker-head')]//button[3]")).getText();
		String month = driver.findElement(By.xpath("//div[contains(@class,'bs-datepicker-head')]//button[2]")).getText();
		
		if (month.equals(expMonth) && year.equals(expYear)) {
			break;
		}
		//click previous until we get the date
		driver.findElement(By.xpath("//div[contains(@class,'bs-datepicker-head')]//button")).click();
		}
		//select day
		driver.findElement(By.xpath("//div[contains(@class,'bs-datepicker-body')]/table/tbody/tr/td//span[text()='"+expDay+"']"));
		
	}
}
