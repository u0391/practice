package rensyuuproject;

public class Kuku {

	public static void main(String[] args) {
			

		int[] kuku = {1,2,3,4,5,6,7,8,9};
		
			for(int i=0; i<kuku.length; i++) {
				
				for(int k=0; k<kuku.length; k++) {
					
					System.out.print(kuku[i]*kuku[k]);
					
					System.out.print(" ");
				}
				
				System.out.println();
			}
			
		}

}
