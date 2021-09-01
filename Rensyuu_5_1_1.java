package rensyuuproject;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Rensyuu_5_1_1 {

	public static void main(String[] args) throws Exception {

		BufferedReader b= new BufferedReader
							(new InputStreamReader(System.in));
		
		String xx= b.readLine();
		
		String yy= b.readLine();
		
		String zz= b.readLine();
		
		
		int x=Integer.parseInt(xx);
		
		int y=Integer.parseInt(yy);
		
		int z=Integer.parseInt(zz);
		
		System.out.println("ケース１");

		if(x>=60) {
			System.out.println("合格");
		}else {
			System.out.println("不合格");
		}
		
		System.out.println("ケース２");
		
		if(y>=80) {
			System.out.println("たいへんよくできました");
		
		}else if(y>=60 && y<80) {
			System.out.println("よくできました");
		
		}else if(y<60) {
			System.out.println("残念でした");
		}
		
		System.out.println("ケース３");	
			
		if(z>=80) {
			System.out.println("優");
			
		}else if(z>=70 && z<80) {
			System.out.println("良");
			
		}else if(z>=60 && z<70) {
			System.out.println("可");
			
		}else if(z<60) {
			System.out.println("不可");
		}
		
		

	}

}
