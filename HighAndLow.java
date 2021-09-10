package rensyuuproject;

import java.util.Scanner;

public class HighAndLow {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int leftcard = (int) (Math.random()*9)+1;
		
		System.out.println("**********");
		
		System.out.println("*High & Low*");
		
		System.out.println("**********");
		
		System.out.println("");
		
		
		
		System.out.println("[問題表示]");
		
		System.out.println("*****  ******");
		
		System.out.println("");
		
		System.out.println("**"+leftcard+"* ***");
		
		System.out.println("* *  *  *");
		
		System.out.println("*** ***");
		
		System.out.println("***  ***");
		
		System.out.println("******* *******");
		
		System.out.println("High or Low?(h/1)>");
		
		String select = sc.nextLine();
		
		if(select.equals("h")) {
			System.out.println("Highを選択しました。");
		}else {
			System.out.println("Lowを選択しました。");
		}
		
		System.out.println("");
		
		System.out.println("--ゲーム終了--");
		

	}

}
