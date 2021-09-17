package rensyuuproject;

	interface Figure {
	
		//描画メソッド
		
		void draw();
		
		
}
	
	//三角形を表すTriangleクラスの定義
	
	class Triangle implements Figure{
		
		public void draw() {
			
			System.out.println("△");
		}
		
	}
	
	//四角形を表すRectangleクラスの定義
	
	class Rectangle implements Figure{
		//描画メソッドの実装
		
		public void draw() {
			
			System.out.println("□");
		}
	}
	
	//円を表すCircleクラスの定義
	
	
	
	
	
	//図形クラスをテストするクラス
	public class Sample23{
		public static void main(String [] args) {
			
			//Figureクラスの配列を用意する
			
			Figure [] fig = new Figure[5];
			
			//配列に図形クラスのインスタンスを格納する
			
			fig[0] = new Triangle();
			
			fig[1] = new Rectangle();
			
			fig[2] = new Circle();
			
			fig[3] = new Rectangle();
			
			fig[4] = new Triangle();
			
			//メソッドを呼び出す
			
			for(int i =0; i<fig.length; i++) {
				
				fig[i].draw();
			}
			
		}
	}
	
	








































public class Sample23 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

	}

}
