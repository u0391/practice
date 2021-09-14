package rensyuuproject;

public class SampleEx102 {

		public SampleEx102() {
			
			System.out.println("コンストラクタ");
		}
		
		public void foo() {
			System.out.println("インスタンスメソッド");
		}
		
		public static void bar() {
			System.out.println("静的メソッド");
		}
		
	
	

	public static void main(String[] args) {

		SampleEx102 i = new SampleEx102();
		
		i.foo();
		//様々な静的メソッドの呼び出し
		
		i.bar();
		
		SampleEx102.bar();
		
		bar();
		
		// ガベージコレクターの呼び出し
		
		System.gc();

	}

}
