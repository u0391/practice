package rensyuuproject;

public class God {

	public static void main(String[] args) {

		Hero h = new Hero();
		
		h.name = "オーバー";
		
		h.hp = 100;
		
		System.out.println("勇者"+h.name+"を生み出しました");
		
		h.sit(5);
		
		h.slip();
		
		h.sit(55);
		
		h.run();
		
		SuperHero sh = new SuperHero();
		
		sh.run();

	}

}
