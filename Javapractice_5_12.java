package rensyuuproject;

public class Javapractice_5_12 {

	public static void printArray(int[] array) {
		
		for(int i =0; i<array.length; i++) {
			
			array[i]++;
			
		}
	}
	
	public static void main(String [] args) {
		
		int [] array = {2,5,8};
		
		printArray(array);
				
	}
}
