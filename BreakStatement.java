package rensyuuproject;

import java.util.Scanner;

public class BreakStatement {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int count = 0;
		
		System.out.println("**ループ開始**");
		
		while(true) {
			
			System.out.println("ループを続けるなら「ｙ」を入力して下さい");
			
			String result = sc.nextLine();
			
			//入力判定
			if(result.equals("y")) {
				
				count++;
					
				System.out.println(count+"回目のループです。");
				
				System.out.println();
			
			}else {
				
				System.out.println("y以外の"+result+"が入力されたので終了します。");
				
				break;
			}
			
		}
		System.out.println("**ループ終了**s");

	}

}
