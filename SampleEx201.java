package rensyuuproject;

public class SampleEx201 {

	public static void main(String[] args) {

		Car c = new Car();
		
		c.supply(10);	//燃料補給
		
		c.move(); //移動
		
		c.move();	//移動
		
		Ambulance a = new Ambulance();
		
		a.supply(10); 
		
		a.move();
		
		a.sevePeople();

	}

}
