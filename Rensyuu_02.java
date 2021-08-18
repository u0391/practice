package rensyuuproject;

public class Rensyuu_02 {
	
	
	static int num =0;
	
	private final String hogehohe;
	
	private final int age;
	
	Rensyuu_02(String russ, int nenrei) {
		
		this.hogehohe = russ;
		
		this.age = nenrei;
		
		this.num +=1;
		
	}
	
	void greeting() {
		
		System.out.println("Hello, my name is"+ this.hogehohe);
		System.out.println("私の年齢は"+ age +"です。");
	}
	
		
		
			
	}
		
	
