package rensyuuproject;

import javax.xml.crypto.Data;

public class Problem7_1 {

	public static void main(String[] args) {

		Data d = new Data();
		
		d.setNumber(100);
		
		d.setComment("Programming Java");
		
		System.out.println("number = "+ d.getNumber());
		
		System.out.println("comment = "+ d.getComment());

	}

}
