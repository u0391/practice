package rensyuuproject;

public class Problem7_3 {

	public static void main(String[] args) {

		Calculation c = new Calculation();
		
		c.setNumber1(8);
		
		c.setNumber2(9);
		
		System.out.println(c.getNumber1()+"+"+ c.getNumber2()+"="+ c.add());
		
		//二つの数の差を表示 
		
		System.out.println(c.getNumber1()+"-"+ c.getNumber2()+"="+ c.sub());
		
		System.out.println("");

		System.out.println("6");
		
		
	}

}
