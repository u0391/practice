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
			
		}else if(x==y && x<0 && y<0) {
			
			System.out.println("xとyは等しく、かつ、負の数である");
			
		}else if(x<y || x%2==0) {
			
			System.out.println("xはyより小さい、または、xは偶数である");
			
		}else if(x<=10 || x>=100 && y>=10 && y<=100) {
			
			System.out.println("xは10以下または100以上で、かつ、ｙは１０以上かつ１００以下である。");
		
		}else if(!(x<0) && !(y<0)) {
			
			System.out.println("ｘもｙも負の数である、ではない");
		}
		

	}

}
	