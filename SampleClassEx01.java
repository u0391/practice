package rensyuuproject;

public class SampleClassEx01 {

	private int value = 0;
	
	private static int num = 0;
	
	public SampleClassEx01(int value) {
		
		//引数をインスタンスフィールドに代入
		
		this.value = value;
		
		//静的メンバのインクリメント
		
		num++;

	}
	//コンストラクタ 
	
	public SampleClassEx01() {
		this(100);//引数つきコンストラクタを呼びだす
	}
	//インスタンスの数を取得
	public static int getNumberOfInstance() {
		return num;
	}
	//インスタンスフィールドを取得
	public int getValue() {
		return this.value;
		
	}

}
