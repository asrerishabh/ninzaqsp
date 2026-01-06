package genericUtility;

import java.security.SecureRandom;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

import org.openqa.selenium.WebElement;

public class javautility {
	 private static final String CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
	 private static final SecureRandom RANDOM = new SecureRandom();
	 
	 public static String generateRandomString(int length) {
	  StringBuilder sb = new StringBuilder(length);
	  for (int i = 0; i < length; i++) {
	   int index = RANDOM.nextInt(CHARACTERS.length());
	   sb.append(CHARACTERS.charAt(index));
	  }
	  return sb.toString();
	 }
	 
	 public static void enterRandomString(WebElement element, int length) {
	  String randomText = generateRandomString(length);
	  element.clear();
	  element.sendKeys(randomText);
	
	 
	 }

	 public static String getRequiredDate(int days)
		{//if we pass the days it will calculate the date after so and so number of days
			Date date=new Date();
			SimpleDateFormat sim=new SimpleDateFormat("dd-MM-yyyy");
			sim.format(date);
			Calendar cal = sim.getCalendar();
			cal.add(Calendar.DAY_OF_MONTH, days);
			String requiredDate = sim.format(cal.getTime());

			
			return requiredDate;
		}
		public static int generateNineDigitNumber() {
			
			
			Random random= new Random();
			int randomNum = random.nextInt(100000000, 999999999);
		
			
			return randomNum;
		}
		public static String getCurrentDateAndTime()
		{
		Date d= new Date();
			
			String date = d.toString().replace(" ", "_").replace(":", "_");
			System.out.println(date);
			return date;
		}
	}

