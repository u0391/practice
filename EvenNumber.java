package rensyuuproject;

import java.util.Scanner;

public class EvenNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("数値を入力--");
		
		int num = sc.nextInt();
		
		if(num%2==0) {
			System.out.println("入力数値["+num+"]は偶数です。");
			
		}else {
			System.out.println("入力数値["+num+"]は奇数です。");
		}

	}

}
