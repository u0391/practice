package rensyuuproject;

import java.util.Scanner;

public class SumKeyboard {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("合計したい数値を入力しなさい-->");
		
		int num = sc.nextInt();
		
		int total = 0;
		
		for(int i = 0; i<= num ; i++ ) {
			
			System.out.println("iの値="+i);
			
			total = total+i ;
			
			System.out.println("現時点totalの値="+total);
						
		}
		
		System.out.println("1から"+num+"の合計は"+total+"です。");

	}

}
