package rensyuuproject;

public class SampleClassEx301 {

	public static void main(String[] args) {

		Crow1 c = new Crow1();
		
		Sparrow1 s = new Sparrow1();
		
		//カラスがなく
		
		System.out.println(c.getName()+":");
		
		c.sing();
		
		//雀がなく
		
		System.out.println(s.getName()+":");
		
		s.sing();

	}

}
