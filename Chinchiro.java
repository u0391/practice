package rensyuuproject;

import java.util.Random;

public class Chinchiro {

	public static void main(String[] args) {

		int[] saikoro = {1,2,3,4,5,6};
		
		Random sai = new Random();
		
			
			
			int kaisuu =saikoro[sai.nextInt(1)];
			
			System.out.println(kaisuu);
			
		
			int kaisuu2 = saikoro[sai.nextInt(2)];
			
			System.out.println(kaisuu2);
			
			if(kaisuu==kaisuu2) {
				
				System.out.println("ゾロ目");
			}
			
	
	}

}
