package rensyuuproject;

public class riteral {
	

		public static void main(String[] args) { 

			  

			int [] numbers = {1,2,3,4,5,6,7,8,9,10,11}; 
			 

			System.out.println("１桁の数字を入力してください"); 


			int input = new java.util.Scanner(System.in).nextInt(); 

			 

			for(int i=0; i<numbers.length; i++) { 
			 

			if(input == numbers[i]) { 

			System.out.println("あたり！"); 

			}else { 

			System.out.println("はずれ！"); 

			} 
		
		}			 

	} 			

}


