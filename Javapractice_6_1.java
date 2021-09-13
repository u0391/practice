package rensyuuproject;

public class Javapractice_6_1 {
	
	static Javapractice6_2 feef = new Javapractice6_2();

	public static void main(String[] args) {

		int a = 20; int b = 3;
		
		int total = feef.tasu(a,b);
		
		int delete = feef.hiku(a,b);
		
		System.out.println("足すと"+total+"、引くと"+delete);
	
	}
	
//	public static int tasu(int a, int b) {
//		
//		return (a+b);
//		
//	}
//	
//	public static int hiku(int a, int b) {
//		
//		return (a-b);
//				
//		
//	}
	
}
