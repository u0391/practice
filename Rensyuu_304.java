package rensyuuproject;

public class Rensyuu_304 {

	public static void main(String[] args) {

		int dice = (int)(Math.random()*7);
		
		System.out.println("さいころの目:"+dice);
		
		// 値が、サイコロの目の範囲内かどうかを調べる
		
		if(1 <= dice && dice <=6) {
			
			//さいころの目が、偶数か、奇数かで、処理を分ける。
			
			if(dice == 2 || dice == 4 || dice== 6) {
				
				System.out.println("丁です");
				
			}else {
				
				System.out.println("半です");
			}
			
		}else {
			System.out.println("範囲外の数値です");
		}

	}

}
