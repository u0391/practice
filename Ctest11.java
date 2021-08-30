package rensyuuproject;

public class Ctest11 {

	public static void main(String[] args) {

		Soarer soarer = new Soarer();
		
		soarer.openRoof();
		
		if(soarer.roofOpenFlag) {
			
			System.out.println("屋根が開いています");
			
		}else {
			
			System.out.println("屋根が閉じています");
		}

		soarer.accele();
		
		System.out.println("現在の速度は"+soarer.speed+"キロです");
	}

}
