package rensyuuproject;

public class IncrementOperator {

	public static void main(String[] args) {

		int num = 9;
		
		System.out.println("--- 前置インクリメント--- ");
		
		System.out.println(num);
		
		System.out.println(++num); 
		
		System.out.println(num);
		
		
		num = 9;
		
		System.out.println("--- 後置インクリメント ---");
		
		System.out.println(num);
		
		System.out.println(num++);
		
		System.out.println(num);

	}

}
