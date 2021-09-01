package rensyuuproject;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Rensyuu_5_1_1 {

	public static void main(String[] args) throws Exception {

		BufferedReader b= new BufferedReader
							(new InputStreamReader(System.in));
		
		String xx= b.readLine();
		
//		String yy= b.readLine();
		
		int x=Integer.parseInt(xx);
		
//		int y=Integer.parseInt(yy);
		
		
		if(x>=0) {
			if(x%2==0) {
				System.out.println("正の偶数");
			}else {
				System.out.println("正の奇数");
			}
		}else {
			if(x%2==0) {
				System.out.println("負の偶数");
			}else {
				System.out.println("負の奇数");
			}
		}

	}

}
