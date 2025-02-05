package Genric_utility;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Random;

public class Java_Utitlity {
	
//	Generate any random number
	public int randomNumber() {
		Random random = new Random();
		int value = random.nextInt(1000);
		return value;
	}

//	to take date from machine
	public String local_Date() {
		String date = LocalDate.now().toString().replace("-", "");
		return date;
	}
	
//	to paste date and time 
	public String local_Date_time() {
		String date_Time =LocalDateTime.now().toString().replace("-", "").replace(":", "");
		return date_Time;
	}
}
