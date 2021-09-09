package rensyuuproject;

public class NestedIfStatement {

	public static void main(String[] args) {

		int a = 9;
		
		System.out.println("******ifの判定開始*****");
		
		if(a>=0) {
			
			System.out.println("変数aは0以上。");
			
			if(a<=10) {
				System.out.println("変数aは10以下。");
								
			}else {
				System.out.println("変数aは10より大きい。");
			
			}
			
		}
		
		System.out.println("*****if文の判定終了");
		

	}

}
