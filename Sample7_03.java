package rensyuuproject;

public class Sample7_03 {

	public static void main(String[] args) {

		int[] a= {1,2,3,4,5};
		
		int[] b= a;
		
		a[0]=100;
		
		for(int i=0; i<=4; i++) {
			
			System.out.println(a[i]);
			
		}
		
		for(int i=0; i<=4; i++) {
			
			System.out.println(b[i]);
			
		}

	}

}
