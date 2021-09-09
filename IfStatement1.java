package rensyuuproject;

public class IfStatement1 {

	public static void main(String[] args) {

		String str = "テストｑｑ";
		
		System.out.println("--if文開始--");
		
		if(str.equals("テスト")) {
			
			System.out.println("String型の変数strと文字列テストとは意味的に等しい");
		
		}else {
			
			System.out.println("等しくない");
		}
		
		System.out.println("--if文終了--");

	}

}
