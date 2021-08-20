package rensyuuproject;

public class Sample3_02 {

	public static void main(String[] args) {

		int weather = 2;
		
		switch(weather) {
		case 1:
			System.out.println("今日は晴れです");
			System.out.println("ハイキングに行きましょう");
			
			
		case 2:
			System.out.println("今日は曇りです");
			System.out.println("映画館に行きましょう");
			
			
		 
		case 3:
			System.out.println("今日は雨です");
			System.out.println("家でゆっくり過ごしましょう");
					
		default:
			System.out.println("1,2,3");
			
	
		
		}
		
	}

}
