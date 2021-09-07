package rensyuuproject;

public class Sample0402 {

	public static void main(String[] args) {

		String x = "ABC";
		
		switch (x) {
		
		case "A":
			
			System.out.println("商品の筆箱を獲得しました。");
			
			break;
			
		case "B":
			
			System.out.println("商品の消しゴムを獲得しました。");
		
			break;
			
		case "C":
			
			System.out.println("商品の鉛筆を獲得しました。");
			
			break;
			
			
		default :

			System.out.println("何も獲得しませんでした。");
		}
		
	}

}
