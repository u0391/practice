package rensyuuproject;

public  class Sample {
	
	public static void main(String[] args) {
		
//		asters.aster(8);
		
		
		String b = asters.aster(8);
//		
//		System.out.println("ああ");
		
		// 100円のものを３個かいました。
		int kingaku = kakezan(100, 3);
		// レジ袋費用
		int kekka = rezibukuro(kingaku);
	}
	
	
	
	public void main2() {
		
		
		String b = asters.aster(8);
	}

	
	
	public static int kakezan(int a, int b) {
		return a * b;
	}
	

	
	
	public static int keisan(int a, int b) {
		return a * b + 5;
		
	}
	
	public static int rezibukuro(int a) {
		return a + 5;
	}
	

}
