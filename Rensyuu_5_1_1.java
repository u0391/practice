package rensyuuproject;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Rensyuu_5_1_1 {

	public static void main(String[] args) throws Exception {

		BufferedReader b= new BufferedReader
							(new InputStreamReader(System.in));
		
		String xx= b.readLine();
		
		String yy = b.readLine();
		
						
		int x=Integer.parseInt(xx);
		
		int y=Integer.parseInt(yy);
		
		if (x<y && x%2==0 && y%2==0) {
			
			System.out.println("xはyより小さく、かつ、xとyは共に偶数である");
		}
		

	}

}
	