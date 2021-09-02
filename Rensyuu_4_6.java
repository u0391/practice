package rensyuuproject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

	public class Rensyuu_4_6 {

		private static int result;
		private static int wins;

		public static void main(String[] args) throws IOException {
			
			BufferedReader win = new BufferedReader
									
									(new InputStreamReader(System.in));
			

			
			for(int i=0; i<10; i++) {
				
				int ball = Integer.parseInt(win.readLine());
				
				if(result == 1)
					
					wins +=1;
												
			}
			
			System.out.println("勝ち"+ wins+ "回、負け"+(10-wins)+"回");
			
		}
}
