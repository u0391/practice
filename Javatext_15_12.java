package rensyuuproject;

import java.util.Calendar;
import java.util.Date;

public class Javatext_15_12 {

	public static void main(String[] args) {

		Calendar c =Calendar.getInstance();
		
		c.set(2019,8,22,1,23,45);
		
		c.set(Calendar.MONTH,9);
		
		Date d = c.getTime();
		
		System.out.println(d);
		

	}

}
