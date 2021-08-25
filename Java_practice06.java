package rensyuuproject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Java_practice06 {

	public static void main(String[] args) {

		String [] week = new String[7];
		
		String numStr;
		int num, remainder;

		try {
		    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		    numStr = br.readLine();
		    num = Integer.parseInt(numStr);

		    week[0] = "Monday";
		    week[1] = "Tuesday";
		    week[2] = "Wednesday";
		    week[3] = "Thursday";
		    week[4] = "Friday";
		    week[5] = "Saturday";
		    week[6] = "Sunday";

		    remainder = num % 7;

		    System.out.println("Day of the week: " + week[remainder]);
		}
		catch (IOException ioe) {
		}
		{
	}

	}

}
