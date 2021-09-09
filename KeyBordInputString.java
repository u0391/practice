package rensyuuproject;

import java.util.Scanner;

public class KeyBordInputString {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("１つ目の数字を入力してください");
		
		int num1 = sc.nextInt();
		
		System.out.println("2つ目の数字を入力してください");
		
		int num2 =sc.nextInt();
		
		
		System.out.println(num1 + "+" + num2 +"=" + (num1+num2));
	}

}
