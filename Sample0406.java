package rensyuuproject;

public class Sample0406 {

	public static void main(String[] args) {

		int i = 10;
		
		while(i>0) {
			
			i--;
			
			if(i == 8 || i==5) {
				
				continue;
				
			}
			
			System.out.println("iが負になるまで表示しますi = "+i);
			
		}
		      
	}

}
