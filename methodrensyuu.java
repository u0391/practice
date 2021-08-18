package rensyuuproject;

public class methodrensyuu {

	public static void methodA() {
		
		methodB();
		
		System.out.println("methodA");
		
		
	}
	
	public static void methodB() {
		
		System.out.println("methodC");
	}
	
	public static void main(String[] args) {
		
		methodA();
	}

}
