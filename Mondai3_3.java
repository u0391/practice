package rensyuuproject;

public class Mondai3_3 {

	public static void main(String[] args) {

		int isHungry = 0;
		
		String food ="おにぎり";
		
		System.out.println("こんにちは");
		
		if(isHungry == 0) {
			
			System.out.println("お腹がいっぱいです");
		}else {
			
			System.out.println("腹ペコです");
		}
		
		if(isHungry == 1) {
			
			System.out.println(food + "を頂きます");
		}
		System.out.println("ごちそうさまでした");

	}

}
