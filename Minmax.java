package rensyuuproject;

public class Minmax {

	public int max(int n1, int n2) {
		
		if(n1>n2) {
			
			return n1;
		}
		
		return n2;

	}
	
	//最大値の取得
	
	public int min(int n1, int n2) {
		
		if(n1 < n2) {
			return n1;
			
		}
		return n2;
	}

}
