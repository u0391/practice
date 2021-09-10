package rensyuuproject;

public class Prob3_1 {

	public static void main(String[] args) {

		int number =(int)(Math.random()*100);
		
		System.out.println(number);
		
		if(number >=20 && number<80) {
			
			System.out.println("20以上80未満です");
		}
	
	}
	
}
