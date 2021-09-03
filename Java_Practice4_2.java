package rensyuuproject;

public class Java_Practice4_2 {

	public static void main(String[] args) {

		int [] numbers = {3,4,7,9};
		
		System.out.println("１桁の数字を入力してください");
		
		@SuppressWarnings("resource")
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
	
	
	
