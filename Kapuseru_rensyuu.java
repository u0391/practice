package rensyuuproject;

public class Kapuseru_rensyuu {

	public static void main(String[] args) {
		
		int score =0;

		int hosuu =2;
		
		int faul = 5;
		
		String shuoot = "paint";
		
		if(hosuu>=3) {
			System.out.println("トラベリング");
		}
		
		if(faul>=6) {
			System.out.println("退場です");
		}
		
		if(shuoot=="paint") {
			
			score = score+2; 
			
		}else if(shuoot=="downtown") {
			
			score = score+3;
		}
		    
		System.out.println(score);
	}

}
