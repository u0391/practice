package rensyuuproject;

import java.util.Scanner;

public class SumKeyLoop {

	public static void main(String[] args) {

		Scanner sc =new Scanner(System.in);
		
		while(true) {
			System.out.println("合計したい数値を入力しなさい--");
			
			int num = sc.nextInt();
			
			int total = 0;
			
			for(int i = 1; i<=num ; i++) {
				
				System.out.println("iの値="+i);
				
				total = total + i ;
				
				System.out.println("現時点totalの値="+total);
			}
			
			System.out.println("1から"+num+"の合計は"+total+"です。");
			
			System.out.println("合計を継続するか？Yesならy,Noならnを入力しなさい");
			
			String str = sc.next();
			
			if(!("y".equals(str))) {System.out.println("プログラムを終了します。");
		}

	}
		
	}

}
