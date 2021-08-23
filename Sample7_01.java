package rensyuuproject;

public class Sample7_01 {

	public static void main(String[] args) {
		
		int goukei = 0;
		
		int i;
		
		int syuppi[]= {5064,3072,10048,3458,6679}; 
				
		for( i=0; i<=4;  i++ ) {
			
			goukei=goukei+syuppi[i];
					
		}
		
		System.out.println(goukei);
		
		System.out.println(goukei/i);
	}

}
